package plugin.server.EVENTS;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import plugin.server.INVENTORYES.MagazinGUI;
import plugin.server.INVENTORYES.SellGUI;

import javax.swing.*;

public class ClickSellGUI implements Listener {
    private SellGUI sellGUI;
    @EventHandler
    public void ClickGUI(InventoryClickEvent e){
        sellGUI = new SellGUI();
        if (e.getWhoClicked() instanceof Player) {
            Player player = (Player) e.getWhoClicked();

            if (e.getCurrentItem() != null && e.getCurrentItem().getType() == Material.EMERALD && e.getCurrentItem().getItemMeta().getDisplayName().equals("Продажа предметов с мобов")) {
                player.openInventory(sellGUI.Sell());
            }
        }

    }
}
