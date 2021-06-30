package tk.complexicon.particles.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import tk.complexicon.particles.Main;
import tk.complexicon.particles.utils.CItemStack;
import tk.complexicon.particles.utils.Particle;

import java.util.ArrayList;
import java.util.List;

public class ParticleCommand implements CommandExecutor {

    private Main pl;

    public ParticleCommand(Main pl) {
        this.pl = pl;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (commandSender instanceof Player){
            Player p = (Player) commandSender;
            if (p.hasPermission("particles.use")){
                List<ItemStack> temp = new ArrayList<>();

                temp.add(new CItemStack(Material.BARRIER).setName("&cDeaktivieren").build());

                for(Particle par : pl.manager.particleList){
                    if(p.hasPermission(par.permission)){
                        temp.add(par.displayItem);
                    }
                }

                if(temp.size() == 1){
                    p.sendMessage("§cDu Besitzt keine Effekte!");
                    return true;
                }

                int multiplier = (int) Math.ceil(temp.size() / 9.0);
                Inventory dummy = Bukkit.createInventory(null, 9 * multiplier, ChatColor.GOLD + "Partikel");

                dummy.addItem(temp.toArray(new ItemStack[temp.size()]));

                p.openInventory(dummy);
                p.playSound(p.getLocation(), Sound.CHEST_OPEN, 1, 2);

            }else{
                p.sendMessage("§cDu besitzt keine Berechtigung dafür!");
            }
        }else{
            commandSender.sendMessage("§cNur Spieler dürfen dies!");
        }
        return true;
    }

}
