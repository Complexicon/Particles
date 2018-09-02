package tk.complexicon.particles.utils;

import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Particle {

    public String permission = "particle.default";
    public Effect effect = Effect.CRIT;
    public ItemStack displayItem = new CItemStack(Material.BARRIER).setName("§aDEFAULT").build();
    public int id = 0;
    public int data = 0;
    public float x = 0;
    public float y = 0;
    public float z = 0;
    public float speed = 0;
    public int particleAmt = 1;

    public void spawnParticle(Player p){
        p.getWorld().spigot().playEffect(p.getLocation(), effect,id, data, x, y, z, speed, particleAmt, 256);
    }

}
