package plugin.server.ITEMS;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class DropMobs {
    public ItemStack sheep(){
        ItemStack drop = new ItemStack(Material.MUTTON);
        ItemMeta meta = drop.getItemMeta();
        meta.setDisplayName("Баранина");
        drop.setItemMeta(meta);
        return drop;
    }
}
