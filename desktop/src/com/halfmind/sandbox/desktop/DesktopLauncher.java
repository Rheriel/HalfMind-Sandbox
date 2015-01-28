package com.halfmind.sandbox.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.halfmind.sandbox.Sandbox;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
	    config.title = "HalfMind Sandbox";
	    config.width = 800;
	    config.height = 480;
	    new LwjglApplication(new Sandbox(), config);
	}
}
