package plugin.server.EVENTS;

import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class DamageMobLocations implements Listener {
    @EventHandler
    public void DamageEn(EntityDamageByEntityEvent e) {
        Entity damage = e.getEntity();
        for(int i =0; i<10; i++) {
            if (damage instanceof Villager && damage.getCustomName().equals(ChatColor.GREEN + "Локация " + i)) {
                e.setCancelled(true);
            }
        }
    }
    @EventHandler
    public void DamageEn0(EntityDamageByEntityEvent e) {
        Entity damage = e.getEntity();
        if (damage instanceof Villager && damage.getCustomName().equals(ChatColor.RED+"Выход")) {
            e.setCancelled(true);
        }
    }
}
