package plugin.server.INVENTORYES;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import plugin.server.ITEMS.DropMobs;

public class SellGUI {
    int Bal;
    private DropMobs dropMobs;

    public Inventory Sell(){
        Inventory SellGUI = Bukkit.createInventory(null, 45, "Продажа предметов с мобов");
        dropMobs = new DropMobs();
        SellGUI.setItem(10,dropMobs.sheep());
        return SellGUI;
    }

}
