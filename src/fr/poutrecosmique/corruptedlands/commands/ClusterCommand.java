package fr.poutrecosmique.corruptedlands.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import fr.poutrecosmique.corruptedlands.world.Cluster;
import fr.poutrecosmique.corruptedlands.world.ClusterManager;
import fr.poutrecosmique.corruptedlands.world.biomes.NetherWastes;

public class ClusterCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(!(sender instanceof Player)) {
			System.out.println("Only for players");
			return true;
		}
		
		switch(args.length) {
			case 0:
				sender.sendMessage("/cluster create <biome>");
				sender.sendMessage("/cluster delete");
				sender.sendMessage("/cluster update");
				return true;
			case 1:
				if(args[0].equals("create")) {
					sender.sendMessage("/cluster create <biome>");
					
					//We set default biome bcs it's a test version and this is what it is
					ClusterManager.addCluster(new Cluster(((Player) sender).getLocation(), new NetherWastes()));
					
					return true;
				}
				if(args[0].equals("delete")) {
					
					// Delete the nearest cluster
					
					return true;
				}
				if(args[0].equals("update")) {
					
					ClusterManager.update();
					return true;
				}
				return true;
		}
		
		return false;
	}

}
