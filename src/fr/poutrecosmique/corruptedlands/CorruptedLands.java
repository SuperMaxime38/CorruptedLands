package fr.poutrecosmique.corruptedlands;

import org.bukkit.plugin.java.JavaPlugin;

import fr.poutrecosmique.corruptedlands.commands.ClusterCommand;
import fr.poutrecosmique.corruptedlands.commands.CorruptionCommand;
import fr.poutrecosmique.corruptedlands.events.WaterListener;

public class CorruptedLands extends JavaPlugin {
	
	@Override
	public void onEnable() {

		getServer().getPluginManager().registerEvents(new WaterListener(), this);
		getCommand("cluster").setExecutor(new ClusterCommand());
		getCommand("corruption").setExecutor(new CorruptionCommand());
		System.out.println("Plugin started");
	}
	
	@Override
	public void onDisable() {
		System.out.println("Plugin stoped");
	}

}
