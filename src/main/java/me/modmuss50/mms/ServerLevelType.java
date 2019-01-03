package me.modmuss50.mms;

import net.minecraft.server.dedicated.PropertyManager;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import java.io.File;

@Mod(modid = "serverleveltype", name = "Server Level Type", serverSideOnly = true, dependencies = "required-after:reborncore")
public class ServerLevelType {

	@Mod.EventHandler
	public void serverStarted(FMLPreInitializationEvent event){
		PropertyManager manager = new PropertyManager(new File("server.properties"));
		manager.setProperty("level-type", Config.levelType);
		manager.saveProperties();
	}

}
