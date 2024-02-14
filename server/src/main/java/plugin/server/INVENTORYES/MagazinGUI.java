package plugin.server.INVENTORYES;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;

public class MagazinGUI {

    public Inventory gmag(){
        Inventory inv = Bukkit.createInventory(null, 45,"Магазин");

        inv.setItem(19, mg());
        inv.setItem(21, mg2());
        inv.setItem(23, mg3());
        inv.setItem(25, mg4());
        return inv;
    }
    public ItemStack mg(){
        ItemStack mg = new ItemStack(Material.EMERALD);
        ItemMeta meta = mg.getItemMeta();
        meta.setDisplayName("Продажа предметов с мобов");
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        mg.setItemMeta(meta);

        return mg;
    }
    public ItemStack mg2(){
        ItemStack mg2 = new ItemStack(Material.APPLE);
        ItemMeta meta = mg2.getItemMeta();
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS,ItemFlag.HIDE_ATTRIBUTES);
        meta.setDisplayName("Еда");
        mg2.setItemMeta(meta);
        return mg2;
    }
    public ItemStack mg3(){
        ItemStack mg3 = new ItemStack(Material.POTION);
        ItemMeta meta = mg3.getItemMeta();
        meta.setDisplayName("Зелья");
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        mg3.setItemMeta(meta);
        return mg3;
    }
    public ItemStack mg4(){
        ItemStack mg4 = new ItemStack(Material.BLACK_DYE);
        ItemMeta meta = mg4.getItemMeta();
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES);
        meta.setDisplayName("Прочее");
        mg4.setItemMeta(meta);
        return mg4;
    }

}
