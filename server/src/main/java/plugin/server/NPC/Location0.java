package plugin.server.NPC;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;

public class Location0 {
   double [] lc = new double[] {24.5,60.5,24.5,60.5,24.5,60.5,24.5,60.5,24.5,60.5,-555.5,-555.5,-654.5,-654.5,-753.5,-753.5,-851.5,-851.5,-950.5,-950.5};
   double [] out = new double[] {21.5,63.5,21.5,63.5,21.5,63.5,21.5,63.5,21.5,63.5,-555.5,-555.5,-654.5,-654.5,-753.5,-753.5,-851.5,-851.5,-950.5,-950.5};
    Entity loc;
    Entity loc0;

    public Entity lc01(){
        for(int i = 0; i<10; i++) {
            LivingEntity loc = (LivingEntity) Bukkit.getWorld("world").spawnEntity(new Location(Bukkit.getWorld("world"), lc[i], 31,lc[i+10] ), EntityType.VILLAGER);
            loc.setAI(false);
            loc.setCustomName(ChatColor.GREEN + "Локация " + i);
            loc.setCustomNameVisible(true);
            if(i+1>0 && (i+1)%2==0){
                loc.setRotation(90, 0);
            }
            else {
                loc.setRotation(-90, 0);
            }
        }
            return loc;
    }
    public Entity lc02(){
        for(int i = 0; i<10; i++) {
            LivingEntity loc0 = (LivingEntity) Bukkit.getWorld("world").spawnEntity(new Location(Bukkit.getWorld("world"), out[i], 31, out[i+10]), EntityType.VILLAGER);
            loc0.setAI(false);
            loc0.setCustomName(ChatColor.RED + "Выход");
            loc0.setCustomNameVisible(true);
            if(i+1>0 && (i+1)%2==0){
                loc0.setRotation(-90, 0);
            }
            else {
                loc0.setRotation(90, 0);
            }
        }
        return loc0;
    }
}
