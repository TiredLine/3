package plugin.server.ITEMS;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class MifKatana {
    ItemStack stack;


    public MifKatana() {
        this.stack = new ItemStack(Material.GOLDEN_SWORD);

    }

    public MifKatana Names(){
        ItemMeta meta = stack.getItemMeta();
        meta.setDisplayName(ChatColor.RED+"Мифриловая катана");
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        List<String> list = new ArrayList<>();
        int damage = meta.getEnchantLevel(Enchantment.DAMAGE_ALL);
        int damage1 = damage+23;
        boolean b = meta.addEnchant(Enchantment.DAMAGE_ALL, damage1, true);
        double uron = 4 +((damage1+1)/2);
        int uron1 = (int)uron;
        list.add(ChatColor.YELLOW+"⚔ Урон по мобам " + uron1);
        list.add(ChatColor.RED+"⚔ Урон по игрокам");
        meta.setLore(list);
       stack.setItemMeta(meta);
        return this;
    }
    public ItemStack Katana(){
        ItemStack mKatana = stack;
        Names();
        return mKatana;
    }
}
