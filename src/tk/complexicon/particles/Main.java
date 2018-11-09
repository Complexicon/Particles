package tk.complexicon.particles;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import tk.complexicon.particles.commands.ParticleCommand;
import tk.complexicon.particles.listeners.InventoryListener;
import tk.complexicon.particles.listeners.MoveListener;
import tk.complexicon.particles.utils.Particle;

import java.util.HashMap;
import java.util.Random;
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

    public static String rainbowString(String in){
        char[] chars = new char[]{'c', '6', 'e', 'a', 'b', '3', 'd'};
        Random r = new Random();
        int index = r.nextInt(chars.length);
        String returnValue = "";
        for (char c : in.toCharArray()){
            returnValue += "§" + chars[index] + c;
            index++;
            if (index == chars.length){
                index = 0;
            }
        }
        return returnValue;
    }

}
