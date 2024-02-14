package plugin.server.EVENTS;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import plugin.server.NPC.Location0;

public class ClickMobLocations implements Listener {
    double [] lc = new double[] {19.5,65.5,19.5,65.5,19.5,65.5,19.5,65.5,19.5,65.5,-555.5,-555.5,-654.5,-654.5,-753.5,-753.5,-851.5,-851.5,-950.5,-950.5};
    double [] out = new double[] {21.5,63.5,21.5,63.5,21.5,63.5,21.5,63.5,21.5,63.5,-555.5,-555.5,-654.5,-654.5,-753.5,-753.5,-851.5,-851.5,-950.5,-950.5};
    double [] out1 = new double[] {25.5,58.5,25.5,58.5,25.5,58.5,25.5,58.5,25.5,58.5,-555.5,-555.5,-654.5,-654.5,-753.5,-753.5,-851.5,-851.5,-950.5,-950.5};

    private Location0 location0;
    @EventHandler
    public void click(PlayerInteractEntityEvent e){
        location0 = new Location0();
        Player p = e.getPlayer();
        Entity click = e.getRightClicked();
        for(int i = 0; i<10;i++) {
            if (click instanceof Villager && click.getCustomName().equals(ChatColor.GREEN + "Локация " + i)) {
                p.teleport(new Location(p.getWorld(), lc[i], 31, lc[i+10]));

            }
        }
    }
    @EventHandler
    public void click0(PlayerInteractEntityEvent e){
        location0 = new Location0();
        Player p = e.getPlayer();
        Entity click = e.getRightClicked();
        for(int i = 0; i<10; i++){
        if(click instanceof Villager && click.getLocation().getX() == out[i] && click.getLocation().getZ() == out[i+10] ) {
            p.teleport(new Location(p.getWorld(), out1[i], 31, out1[i+10]));
        }

        }
    }
}
