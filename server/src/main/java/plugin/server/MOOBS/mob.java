package plugin.server.MOOBS;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDeathEvent;

import org.bukkit.inventory.ItemStack;
import plugin.server.ITEMS.MifKatana;

public class mob implements Listener {
    private MifKatana mifKatana;
    private int maxMobCount = 10;

    Entity zombie;
    public void mob(){
        LivingEntity mob = (LivingEntity) Bukkit.getWorld("world").spawnEntity(new Location(Bukkit.getWorld("world"), 40, 35,-470),EntityType.ZOMBIE);
       mob.setCustomName("Зомбик");
       mob.setCustomNameVisible(true);
       mob.setMaxHealth(200);

    }
    @EventHandler
    public void onCreatureSpawn(CreatureSpawnEvent event) {
        if (event.getSpawnReason() == CreatureSpawnEvent.SpawnReason.NATURAL) {
            int currentMobCount = countMobsInWorld(event.getLocation().getWorld(), EntityType.ZOMBIE);
            if (currentMobCount < maxMobCount) {
                mob();
            }
        }
    }
    private int countMobsInWorld(org.bukkit.World world, EntityType entityType) {
        int count = 0;
        for (LivingEntity entity : world.getLivingEntities()) {
            if (entity.getType() == entityType) {
                count++;
            }
        }
        return count;
    }
   @EventHandler
   public void onEntityDeath(EntityDeathEvent event) {
       if (event.getEntityType() == EntityType.ZOMBIE) {
           event.getDrops().clear();
           double random = Math.random();
        mifKatana = new MifKatana();

           if (random < 0.1) {
               event.getDrops().add(mifKatana.Katana());
           }
           event.getDrops().add(new ItemStack(Material.IRON_INGOT, 2));


   }
   }
   @EventHandler
    public void mobdr(EntityDeathEvent e){

        if(e.getEntity().getCustomName().equals("Зомбик")){
            e.setDroppedExp(50);
        }
   }

}
