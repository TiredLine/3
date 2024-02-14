package plugin.server.INVENTORYES;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class PotionsGUI {
    public Inventory Potions(){
        Inventory potGUI = Bukkit.createInventory(null, 45, "Зелья");
        return potGUI;
    }
}
