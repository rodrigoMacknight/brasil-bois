package com.mack.brasilbois.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mack.brasilbois.BrBoisMain;

public class DesktopLauncherEnemy {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width= BrBoisMain.Companion.getWIDTH();
		config.height= BrBoisMain.Companion.getHEIGHT();
		config.title = BrBoisMain.Companion.getTITLE();
		new LwjglApplication(new BrBoisMain(), config);
	}
}
