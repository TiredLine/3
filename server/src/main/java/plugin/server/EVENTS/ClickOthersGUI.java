package plugin.server.EVENTS;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import plugin.server.INVENTORYES.OthersGUI;
import plugin.server.INVENTORYES.SellGUI;

public class ClickOthersGUI implements Listener {
    private OthersGUI othersGUI;
    @EventHandler
    public void ClickGUI(InventoryClickEvent e){
        othersGUI = new OthersGUI();

        if (e.getWhoClicked() instanceof Player) {
            Player player = (Player) e.getWhoClicked();

            if (e.getCurrentItem() != null && e.getCurrentItem().getType() == Material.BLACK_DYE && e.getCurrentItem().getItemMeta().getDisplayName().equals("Прочее")) {
                player.openInventory(othersGUI.Others());

            }
        }

    }
}
