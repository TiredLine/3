package plugin.server.VALUES;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import plugin.server.Server;

import static org.bukkit.Bukkit.getServer;

public class CountMobs{
    int mobs1;


    public int mobs(EntityDeathEvent e) {
        int mobs1 = 0;
        if (!(e.getEntity() instanceof Player)) {
             mobs1++;
        }
        return mobs1;
    }
    public int mob(){
        return mobs1;
    }

}
