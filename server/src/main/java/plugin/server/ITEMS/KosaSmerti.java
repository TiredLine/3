package plugin.server.ITEMS;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class KosaSmerti {
    ItemStack stack;
    public KosaSmerti(){
        this.stack = new ItemStack(Material.DIAMOND_SWORD);

    }
    public KosaSmerti Enchants(){
        ItemMeta meta = stack.getItemMeta();
        meta.addEnchant(Enchantment.DAMAGE_ALL, 20000, true);
        stack.setItemMeta(meta);
        return this;
    }
    public KosaSmerti Name(){
        ItemMeta meta = stack.getItemMeta();
        meta.setDisplayName(ChatColor.RED+"Легендарная коса");
        List<String> list = new ArrayList<>();
        list.add(ChatColor.GOLD+"Редкость 5/5");
        list.add(ChatColor.WHITE+"Великое оружие для убийства монстров");
        stack.setItemMeta(meta);
        return this;
    }
    public ItemStack Kosa(){
        ItemStack LKosa = stack;
        Enchants();
        Name();
        return LKosa;
    }
}
