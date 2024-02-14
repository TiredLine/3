package plugin.server.EVENTS;

import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import plugin.server.NPC.Magazin;

public class GIUOPENMagazin implements Listener {

    @EventHandler
    public void DamageEn(EntityDamageByEntityEvent e) {
        Entity damage = e.getEntity();
            if (damage instanceof Villager && damage.getCustomName().equals(ChatColor.GREEN+"Магазин")) {
                e.setCancelled(true);
            }
        }
    }

