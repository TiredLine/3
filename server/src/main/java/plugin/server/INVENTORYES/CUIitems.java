package plugin.server.INVENTORYES;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import plugin.server.ITEMS.DropMobs;
import plugin.server.ITEMS.KosaSmerti;
import plugin.server.ITEMS.MifKatana;

public class CUIitems {
    private MifKatana mifKatana;
    private KosaSmerti kosaSmerti;
    private DropMobs dropMobs;
    public Inventory MenuItems(){
        Inventory menu = Bukkit.createInventory(null, 45, "Предметы");
        mifKatana = new MifKatana();
        dropMobs = new DropMobs();
        kosaSmerti = new KosaSmerti();
        menu.addItem(mifKatana.Katana());
        menu.addItem(kosaSmerti.Kosa());
        menu.addItem(dropMobs.sheep());
        return menu;
    }
}
