package tk.complexicon.particles.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import tk.complexicon.particles.Main;

public class MoveListener implements Listener {

    Main pl;

    public MoveListener(Main pl) {
        this.pl = pl;
    }

    @EventHandler
    public void onMove(PlayerMoveEvent e){
        if(pl.map.containsKey(e.getPlayer())){
            pl.map.get(e.getPlayer()).spawnParticle(e.getPlayer());
        }
    }

}
