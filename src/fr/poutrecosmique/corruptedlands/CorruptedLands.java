package fr.poutrecosmique.corruptedlands;

import org.bukkit.plugin.java.JavaPlugin;

import fr.poutrecosmique.corruptedlands.commands.ClusterCommand;
import fr.poutrecosmique.corruptedlands.commands.CorruptionCommand;
import fr.poutrecosmique.corruptedlands.events.MobListener;
import fr.poutrecosmique.corruptedlands.events.WaterListener;
import fr.poutrecosmique.corruptedlands.world.ClusterManager;

public class CorruptedLands extends JavaPlugin {
	
	@Override
	public void onEnable() {

		getServer().getPluginManager().registerEvents(new WaterListener(), this);
		getServer().getPluginManager().registerEvents(new MobListener(), this);
		getCommand("cluster").setExecutor(new ClusterCommand(this));
		getCommand("corruption").setExecutor(new CorruptionCommand());
		
		ClusterManager.gameTimer(this);
		System.out.println("Plugin started");
	}
	
	@Override
	public void onDisable() {
		System.out.println("Plugin stoped");
	}

}
