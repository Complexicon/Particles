package tk.complexicon.particles;

import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.potion.PotionType;
import tk.complexicon.particles.utils.CItemStack;
import tk.complexicon.particles.utils.CPotion;
import tk.complexicon.particles.utils.Particle;

import java.util.ArrayList;
import java.util.List;

public class ParticleManager {

    public List<Particle> particleList = new ArrayList<>();

    public ParticleManager() {

        admin();

        flame();
        heart();
        ender();
        note();
        cloud();
        redstone();
        rainbow();
        emerald();
        water();
        lava();
        stars();
        enchant();
        crit();
        bluecrit();
        portal();
        explode();
    }

    private void addParticle(Particle p){
        particleList.add(p);
        Bukkit.getLogger().info("Registered Particle: " + p.permission);
    }

    private void admin(){
        Particle p = new Particle();

        p.permission = "particle.admin";
        p.displayItem = new CItemStack(Material.DIAMOND).setName("&4Admin").build();
        p.effect = Effect.LARGE_SMOKE;
        p.x = 0.2F;
        p.z = 0.2F;
        p.y = 1F;
        p.particleAmt = 6;

        addParticle(p);
    }

    private void flame(){
        Particle p = new Particle();

        p.permission = "particle.flame";
        p.displayItem = new CItemStack(Material.BLAZE_POWDER).setName("&cFlamme").build();
        p.effect = Effect.FLAME;
        p.y = 0.4F;
        p.particleAmt = 4;
        p.speed = 0.02F;

        addParticle(p);
    }

    private void heart(){
        Particle p = new Particle();

        p.permission = "particle.heart";
        p.displayItem = new CPotion().setType(PotionType.INSTANT_HEAL).hideFlag(ItemFlag.HIDE_POTION_EFFECTS).setName("&4Herz").build();
        p.effect = Effect.HEART;

        addParticle(p);
    }

    private void ender(){
        Particle p = new Particle();

        p.permission = "particle.ender";
        p.displayItem = new CItemStack(Material.ENDER_PEARL).setName("&1Ender").build();
        p.effect = Effect.WITCH_MAGIC;
        p.y = 0.2F;
        p.x = 0.2F;
        p.z = 0.2F;
        p.particleAmt = 2;

        addParticle(p);
    }

    private void note(){
        Particle p = new Particle();

        p.permission = "particle.note";
        p.displayItem = new CItemStack(Material.NOTE_BLOCK).setName("&aNoten").build();
        p.effect = Effect.NOTE;
        p.y = 0.2F;
        p.x = 0.2F;
        p.z = 0.2F;
        p.speed = 1;

        addParticle(p);
    }

    private void cloud(){
        Particle p = new Particle();

        p.permission = "particle.cloud";
        p.displayItem = new CItemStack(Material.WOOL).setName("Wolken").build();
        p.effect = Effect.CLOUD;
        p.speed = 0.06F;

        addParticle(p);
    }

    private void redstone(){
        Particle p = new Particle();

        p.permission = "particle.redstone";
        p.displayItem = new CItemStack(Material.REDSTONE).setName("&4Redstone").build();
        p.effect = Effect.COLOURED_DUST;
        p.x = 0.4F;
        p.z = 0.4F;

        addParticle(p);
    }

    private void rainbow(){
        Particle p = new Particle();

        p.permission = "particle.rainbow";
        p.displayItem = new CItemStack(Material.EXP_BOTTLE).setName(Main.rainbowString("Rainbow")).build();
        p.effect = Effect.COLOURED_DUST;
        p.y = 0.2F;
        p.x = 0.2F;
        p.z = 0.2F;
        p.speed = 1F;
        p.data = 1;
        p.particleAmt = 4;

        addParticle(p);
    }

    private void emerald(){
        Particle p = new Particle();

        p.permission = "particle.emerald";
        p.displayItem = new CItemStack(Material.EMERALD).setName("&aSmaragd").build();
        p.effect = Effect.HAPPY_VILLAGER;
        p.speed = 0.08F;
        p.x = 0.5F;
        p.y = 0.8F;
        p.z = 0.5F;

        addParticle(p);
    }

    private void water(){
        Particle p = new Particle();

        p.permission = "particle.water";
        p.displayItem = new CItemStack(Material.WATER_BUCKET).setName("&1Wasser").build();
        p.effect = Effect.SPLASH;
        p.speed = 0.2F;
        p.x = 0.1F;
        p.y = 0.1F;
        p.z = 0.1F;
        p.particleAmt = 6;

        addParticle(p);
    }

    private void lava(){
        Particle p = new Particle();

        p.permission = "particle.lava";
        p.displayItem = new CItemStack(Material.LAVA_BUCKET).setName("&6Lava").build();
        p.effect = Effect.LAVA_POP;
        p.speed = 1F;

        addParticle(p);
    }

    private void stars(){
        Particle p = new Particle();

        p.permission = "particle.stars";
        p.displayItem = new CItemStack(Material.NETHER_STAR).setName("Sterne").build();
        p.effect = Effect.INSTANT_SPELL;
        p.y = 0.8F;
        p.speed = 0.02F;

        addParticle(p);
    }

    private void enchant(){
        Particle p = new Particle();

        p.permission = "particle.enchant";
        p.displayItem = new CItemStack(Material.ENCHANTMENT_TABLE).setName("&dMagic").build();
        p.effect = Effect.FLYING_GLYPH;
        p.x = 0.84F;
        p.y = 0.8F;
        p.z = 0.8F;
        p.particleAmt = 4;
        p.speed = 0.02F;

        addParticle(p);
    }

    private void crit(){
        Particle p = new Particle();

        p.permission = "particle.crit";
        p.displayItem = new CItemStack(Material.IRON_SWORD).setName("&cCrit").build();
        p.effect = Effect.CRIT;
        p.particleAmt = 4;
        p.x = 0.4F;
        p.y = 0.4F;
        p.z = 0.4F;
        p.speed = 0.02F;

        addParticle(p);
    }

    private void bluecrit(){
        Particle p = new Particle();

        p.permission = "particle.bluecrit";
        p.displayItem = new CPotion().setType(PotionType.NIGHT_VISION).hideFlag(ItemFlag.HIDE_POTION_EFFECTS).setName("&1Magie Crit").build();
        p.effect = Effect.MAGIC_CRIT;
        p.x = 0.4F;
        p.y = 0.4F;
        p.z = 0.4F;
        p.particleAmt = 4;
        p.speed = 0.02F;

        addParticle(p);
    }

    private void portal(){
        Particle p = new Particle();

        p.permission = "particle.portal";
        p.displayItem = new CItemStack(Material.NETHERRACK).setName("&4Nether").build();
        p.effect = Effect.PORTAL;
        p.particleAmt = 4;
        p.speed = 0.02F;

        addParticle(p);
    }

    private void explode(){
        Particle p = new Particle();

        p.permission = "particle.explode";
        p.displayItem = new CItemStack(Material.SULPHUR).setName("&7Rauch").build();
        p.effect = Effect.EXPLOSION;
        p.x = 0.2F;
        p.y = 0.2F;
        p.z = 0.2F;
        p.speed = 0.02F;

        addParticle(p);
    }

}