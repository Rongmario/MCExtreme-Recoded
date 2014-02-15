package mcextreme.core.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import cpw.mods.fml.common.Loader;

public class ReflectionHelper {
	
	//Kodehawa: Reflection utilities for somethings that will need it
	
    public static Field findFieldOfTypeInClass(final Class source, final Class type) {
        for (final Field e : source.getDeclaredFields()) {
            if (e.getType().equals(type)) {
                return e;
            }
    }
        return null;
    }
    
    public static void setField(Class c, Object o, String str, Object val){
        Field[] fields = c.getDeclaredFields();
        for (int i = 0; i < fields.length; i++){
            if (fields[i].getName().equals(str)){
            	System.out.println("Fix Reflection Usage: Use \""+i+"\" instead of \""+str+"\"!");
                setField(c, o, i,val);
                return;
            }
        }
        System.out.println("Fix Reflection Usage: No such field: \""+str+"\"!");
    }
   
    public static void setField(Class c, Object o, int num, Object val){
        try{
            Field f = c.getDeclaredFields()[num];
            f.setAccessible(true);
            Field modifiers = f.getClass().getDeclaredField("modifiers");
            modifiers.setAccessible(true);
            modifiers.setInt(f, f.getModifiers() & ~Modifier.FINAL);
            f.set(o, val);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
