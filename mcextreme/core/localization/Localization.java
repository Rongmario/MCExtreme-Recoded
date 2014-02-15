package mcextreme.core.localization;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class Localization
{
    public static void localize()
    {
        LanguageRegistry lr = LanguageRegistry.instance();

        lr.loadLocalization("assets/mcextreme/lang/en_US.lang", "en_US", false);
        lr.loadLocalization("assets/mcextreme/lang/de_DE.lang", "de_DE", false);
    }
}