package tk.complexicon.particles;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import tk.complexicon.particles.commands.ParticleCommand;
import tk.complexicon.particles.listeners.InventoryListener;
import tk.complexicon.particles.listeners.MoveListener;
import tk.complexicon.particles.utils.Particle;

import java.util.HashMap;
import java.util.logging.Logger;

public class Main extends JavaPlugin {

    Logger l = getLogger();
    public ParticleManager manager;
    public HashMap<Player, Particle> map = new HashMap<>();

    @Override
    public void onEnable() {
        l.info("Registering Events...");

        Bukkit.getPluginManager().registerEvents(new MoveListener(this), this);
        Bukkit.getPluginManager().registerEvents(new InventoryListener(this), this);

        l.info("Registering Commands...");

        getCommand("particle").setExecutor(new ParticleCommand(this));

        l.info("Registering Particles...");

        manager = new ParticleManager();

        l.info("Ready! Particles v0.1 by Complexicon");

    }
}
