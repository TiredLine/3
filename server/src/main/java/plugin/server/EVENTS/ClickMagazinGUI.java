package plugin.server.EVENTS;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import plugin.server.INVENTORYES.MagazinGUI;

public class ClickMagazinGUI implements Listener {
    public MagazinGUI magazinGUI;

    @EventHandler
    public void clickmagaz(InventoryClickEvent e) {
        if(e.getView().getTitle().equals("Магазин")){
            e.setCancelled(true);
        }

    }
}