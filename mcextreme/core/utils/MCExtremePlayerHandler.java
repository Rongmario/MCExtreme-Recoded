package mcextreme.core.utils;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.network.IConnectionHandler;
import cpw.mods.fml.common.network.Player;
import mcextreme.core.MCExtremeCore;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.NetLoginHandler;
import net.minecraft.network.packet.NetHandler;
import net.minecraft.network.packet.Packet1Login;
import net.minecraft.network.packet.Packet3Chat;
import net.minecraft.server.MinecraftServer;
import net.minecraft.src.ModLoader;
import net.minecraft.util.ChatMessageComponent;
import net.minecraftforge.event.entity.player.PlayerEvent;

public class MCExtremePlayerHandler implements IConnectionHandler
{
	@Override
	public void playerLoggedIn(Player player, NetHandler netHandler, INetworkManager manager) 
	{
		for(String username : MinecraftServer.getServer().getAllUsernames()){
			if(username.equals("warlordjones")){
				FMLLog.warning("The code breaker is here: warlordjones! You're warned!", ""); break;
			}
			if(username.contains("Player")){
				FMLLog.info("MCP Test Enviroment!", ""); break;
			}
			//Insert Exacat Hate here!
			if(username.equals("Exacat"))
			{
			MCExtremeCore.exhate = true;
			FMLLog.warning("Exacat, you do not deserve this mod!", "");
			}
			if(username.equals("Rongmario")){
			    FMLLog.warning("Lelfish"); break;
		    } 
			if(username.equals("TheDoctor15555")){
			    FMLLog.warning("CENTIPEDE"); break;
		    }
			//Rongmario predicts what Domi says when KyonSkyxx_ is logged on :D
			if(username.contains("KyonSkyxx_")){
			    FMLLog.warning("Get premium!"); break;
		    } 
		}
	}

	@Override
	public String connectionReceived(NetLoginHandler netHandler, INetworkManager manager) 
	{
		return null;
	}

	@Override
	public void connectionOpened(NetHandler netClientHandler, String server, int port, INetworkManager manager) { }

	@Override
	public void connectionOpened(NetHandler netClientHandler, MinecraftServer server, INetworkManager manager) { }

	@Override
	public void connectionClosed(INetworkManager manager) {	}

	@Override
	public void clientLoggedIn(NetHandler clientHandler, INetworkManager manager, Packet1Login login) { }
}
