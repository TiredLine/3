package plugin.server.NPC;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;

public class Magazin {
    public Entity Magazin(){
        LivingEntity magazin = (LivingEntity) Bukkit.getWorld("world").spawnEntity(new Location(Bukkit.getWorld("world"), 51.460,31,-451.544), EntityType.VILLAGER);
        magazin.setAI(false);
        magazin.setCustomName(ChatColor.GREEN+"Магазин");
        magazin.setCustomNameVisible(true);
        magazin.setRotation(180, 0);
        return magazin;

    }
}
