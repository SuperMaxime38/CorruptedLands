package fr.poutrecosmique.corruptedlands;

import org.bukkit.plugin.java.JavaPlugin;

import fr.poutrecosmique.corruptedlands.commands.ClusterCommand;
import fr.poutrecosmique.corruptedlands.commands.CorruptionCommand;

public class CorruptedLands extends JavaPlugin {
	
	@Override
	public void onEnable() {

		getCommand("cluster").setExecutor(new ClusterCommand());
		getCommand("corruption").setExecutor(new CorruptionCommand());
		System.out.println("Plugin started");
	}
	
	@Override
	public void onDisable() {
		System.out.println("Plugin stoped");
	}

}
