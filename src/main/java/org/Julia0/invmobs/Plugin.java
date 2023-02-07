package org.Julia0.invmobs;

import org.Julia0.invmobs.events.ZombieSpawnEv;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {

    @Override
    public void onEnable(){
        Bukkit.getPluginManager().registerEvents(new ZombieSpawnEv(), this);
    }

    @Override
    public void onDisable(){

    }
}
