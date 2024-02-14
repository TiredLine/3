package plugin.server.EVENTS;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import plugin.server.INVENTORYES.EatGUI;
import plugin.server.INVENTORYES.MagazinGUI;
import plugin.server.INVENTORYES.SellGUI;

public class ClickFoodGUI implements Listener {
    private EatGUI eatGUI;

    @EventHandler
    public void ClickGUI(InventoryClickEvent e){
        eatGUI = new EatGUI();

        if (e.getWhoClicked() instanceof Player) {
            Player player = (Player) e.getWhoClicked();

            if (e.getCurrentItem() != null && e.getCurrentItem().getType() == Material.APPLE && e.getCurrentItem().getItemMeta().getDisplayName().equals("Еда")) {
                player.openInventory(eatGUI.EatGui());
            }
        }

    }
}
