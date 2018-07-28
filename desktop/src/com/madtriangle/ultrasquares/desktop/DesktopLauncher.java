package com.madtriangle.ultrasquares.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.madtriangle.ultrasquares.MyGdxGame;

public class DesktopLauncher {
    public static void main(String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = Thread.currentThread().getName();
        new LwjglApplication(new MyGdxGame(), config);
    }
}
