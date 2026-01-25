package fr.poutrecosmique.corruptedlands.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import fr.poutrecosmique.corruptedlands.world.Cluster;
import fr.poutrecosmique.corruptedlands.world.ClusterManager;
import fr.poutrecosmique.corruptedlands.world.biomes.BasaltDeltas;
import fr.poutrecosmique.corruptedlands.world.biomes.CrimsonForest;
import fr.poutrecosmique.corruptedlands.world.biomes.NetherWastes;
import fr.poutrecosmique.corruptedlands.world.biomes.SoulSandValley;
import fr.poutrecosmique.corruptedlands.world.biomes.WarpedForest;

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
			case 2:
				if(args[0].equals("create")) {
					switch(args[1]) {
					case "netherwastes":
						ClusterManager.addCluster(new Cluster(((Player) sender).getLocation(), new NetherWastes()));
						sender.sendMessage("§aCluster created");
						return true;
					case "basaltdeltas":
						ClusterManager.addCluster(new Cluster(((Player) sender).getLocation(), new BasaltDeltas()));
						sender.sendMessage("§aCluster created");
						return true;
					case "crimsonforest":
						ClusterManager.addCluster(new Cluster(((Player) sender).getLocation(), new CrimsonForest()));
						sender.sendMessage("§aCluster created");
						return true;
					case "soulsandvalley":
						ClusterManager.addCluster(new Cluster(((Player) sender).getLocation(), new SoulSandValley()));
						sender.sendMessage("§aCluster created");
						return true;
					case "warpedforest":
						ClusterManager.addCluster(new Cluster(((Player) sender).getLocation(), new WarpedForest()));
						sender.sendMessage("§aCluster created");
						return true;
					default:
						sender.sendMessage("§cWrong biome <netherwastes|basaltdeltas|crimsonforest|soulsandvalley|warpedforest>");
						return true;
					}
				}
				
				return true;
					
		}
		
		return false;
	}

}
