package me.trixkz.refillinventory;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import me.trixkz.refillinventory.listeners.RefillSignCreateEvent;
import me.trixkz.refillinventory.listeners.RefillSignListener;

public class Main extends JavaPlugin {

    public void onEnable(){

        Bukkit.getPluginManager().registerEvents(new RefillSignListener(), this);
        Bukkit.getPluginManager().registerEvents(new RefillSignCreateEvent(), this);


    }
}