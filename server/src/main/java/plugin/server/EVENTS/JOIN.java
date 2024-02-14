package plugin.server.EVENTS;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JOIN implements Listener {
    @EventHandler
    public void JoinServer(PlayerJoinEvent e){
        String name = e.getPlayer().getName();
        Player player = e.getPlayer();
        Bukkit.getServer().broadcastMessage(ChatColor.YELLOW+"Игрок " + name + " зашел на сервер!");

    }
}
