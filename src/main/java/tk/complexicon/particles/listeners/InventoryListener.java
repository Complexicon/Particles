package tk.complexicon.particles.listeners;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import tk.complexicon.particles.Main;
import tk.complexicon.particles.utils.Particle;

public class InventoryListener implements Listener {

    Main pl;

    public InventoryListener(Main pl) {
        this.pl = pl;
    }

    @EventHandler
    public void onInteract(InventoryClickEvent e){

        Player p = (Player) e.getWhoClicked();
        ItemStack c = e.getCurrentItem();
        Inventory i = e.getInventory();

        if(c == null || c.getType() == Material.AIR){
            return;
        }

        if(i.getName().contains("§6Partikel")){
            e.setCancelled(true);

            if (c.getItemMeta().getDisplayName().contains("Deaktivieren")){
                pl.map.remove(p);
                p.sendMessage("§aDein Effekt wurde Deaktiviert!");
                p.closeInventory();
            }

            for(Particle par : pl.manager.particleList){
                if(c.getItemMeta().getDisplayName() == par.displayItem.getItemMeta().getDisplayName() && c.getType() == par.displayItem.getType()){
                    pl.map.put(p, par);
                    p.sendMessage(par.displayItem.getItemMeta().getDisplayName() + " §awurde Aktiviert!");
                    p.playSound(p.getLocation(), Sound.ORB_PICKUP, 1, 1);
                    p.closeInventory();
                }
            }
        }

    }

}
