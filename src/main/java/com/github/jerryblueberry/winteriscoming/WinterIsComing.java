package com.github.jerryblueberry.winteriscoming;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class WinterIsComing extends JavaPlugin {

    public static final ConsoleCommandSender CONSOLE_COMMAND_SENDER = Bukkit.getConsoleSender();

    @Override
    public void onEnable() {
        CONSOLE_COMMAND_SENDER.sendMessage("Plugin WinterIsComing is Enabled");
    }

    @Override
    public void onDisable() {
        CONSOLE_COMMAND_SENDER.sendMessage("Plugin WinterIsComing is Disabled");
    }

}
