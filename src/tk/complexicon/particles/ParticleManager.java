package tk.complexicon.particles;

import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.potion.PotionType;
import tk.complexicon.particles.utils.CItemStack;
import tk.complexicon.particles.utils.CPotion;
import tk.complexicon.particles.utils.Particle;

import java.util.ArrayList;
import java.util.List;

public class ParticleManager {

    public List<Particle> particleList = new ArrayList<>();

    public ParticleManager() {
        flame();
        heart();
    }

    private void addParticle(Particle p){
        particleList.add(p);
        Bukkit.getLogger().info("Registered Particle: " + p.permission);
    }

    private void flame(){
        Particle p = new Particle();

        p.permission = "particle.flame";
        p.displayItem = new CItemStack(Material.BLAZE_POWDER).setName("&6Flame").build();
        p.effect = Effect.FLAME;
        p.y = 0.4F;
        p.particleAmt = 4;
        p.speed = 0.02F;

        addParticle(p);
    }

    private void heart(){
        Particle p = new Particle();

        p.permission = "particle.heart";
        p.displayItem = new CPotion().setType(PotionType.INSTANT_HEAL).setName("&4Herz").build();
        p.effect = Effect.HEART;

        addParticle(p);
    }

}