package plugin.server.INVENTORYES;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class OthersGUI {
    public Inventory Others(){
        Inventory others = Bukkit.createInventory(null, 45, "Прочее");
        return others;
    }
}
