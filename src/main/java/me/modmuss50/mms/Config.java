package me.modmuss50.mms;

import reborncore.common.registration.RebornRegistry;
import reborncore.common.registration.impl.ConfigRegistry;

@RebornRegistry(modID = "serverleveltype")
public class Config {

	@ConfigRegistry(comment = "The server level type, overrides the one in server.properties, does nothing on the client")
	public static String levelType = "DEFAULT";


}
