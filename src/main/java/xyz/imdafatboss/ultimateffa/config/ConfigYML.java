package xyz.imdafatboss.ultimateffa.config;

import xyz.imdafatboss.ultimateffa.Home;

public class ConfigYML {

    Home plugin;
    public ConfigYML(Home instance){

        this.plugin = instance;

    }
    FileManager fm;

    public int defaultELO(){

        fm = new FileManager(plugin);
        return fm.getConfig("config.yml").get().getInt("default-elo");

    }

    public boolean gappleDrop(){

        fm = new FileManager(plugin);
        return fm.getConfig("config.yml").get().getBoolean("gapple-drop");

    }

}
