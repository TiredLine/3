package plugin.server.MOOBS.LOCATION0;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

public class l0  {
    int maxMobCount = 50;
    public void mob(){
        LivingEntity mob = (LivingEntity) Bukkit.getWorld("world").spawnEntity(new Location(Bukkit.getWorld("world"), 0, 32,-552), EntityType.SHEEP);

        mob.setMaxHealth(16);

    }
    @EventHandler
    public void onCreatureSpawn(CreatureSpawnEvent event) {
        if (event.getSpawnReason() == CreatureSpawnEvent.SpawnReason.NATURAL) {
            int currentMobCount = countMobsInWorld(event.getLocation().getWorld(), EntityType.SHEEP);
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
        if (event.getEntityType() == EntityType.SHEEP) {
            event.getDrops().clear();
            double random = Math.random();
            if (random < 0.1) {
                event.getDrops().add(new ItemStack(Material.MUTTON, 3));
            }
            event.getDrops().add(new ItemStack(Material.MUTTON, 1));

        }
    }
}
