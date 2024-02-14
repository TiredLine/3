package plugin.server.EVENTS;

import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import plugin.server.INVENTORYES.MagazinGUI;
import plugin.server.NPC.Magazin;

public class DamageMagazin implements Listener {

    private MagazinGUI magazinGUI;
    private Magazin magazin;
    @EventHandler
    public void click(PlayerInteractEntityEvent e){
        magazinGUI = new MagazinGUI();
        Player p = e.getPlayer();
        Entity click = e.getRightClicked();
        if(click instanceof Villager && click.getCustomName().equals(ChatColor.GREEN+"Магазин")){
            p.openInventory(magazinGUI.gmag());

        }
    }
}
