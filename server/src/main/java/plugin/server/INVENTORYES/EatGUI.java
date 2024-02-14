package plugin.server.INVENTORYES;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class EatGUI {
    public Inventory EatGui() {
        Inventory eatgui = Bukkit.createInventory(null, 45, "Еда");
        return eatgui;
    }
}
