package plugin.server.EVENTS;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import plugin.server.INVENTORYES.EatGUI;
import plugin.server.INVENTORYES.MagazinGUI;
import plugin.server.INVENTORYES.PotionsGUI;

public class ClickPotionsGUI implements Listener {
    private PotionsGUI potionsGUI;

    @EventHandler
    public void ClickGUI(InventoryClickEvent e) {
        potionsGUI = new PotionsGUI();

        if (e.getWhoClicked() instanceof Player) {
            Player player = (Player) e.getWhoClicked();

            if (e.getCurrentItem().getType() == Material.POTION && e.getCurrentItem().getItemMeta().getDisplayName().equals("Зелья")) {
                player.openInventory(potionsGUI.Potions());
            }
        }
    }
}
