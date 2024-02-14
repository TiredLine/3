package plugin.server.EVENTS;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerExpChangeEvent;
import org.bukkit.event.player.PlayerLevelChangeEvent;

public class EXPevent implements Listener {
    int [] exp = new int[] {400 , 2600, 14700, 137200, 1147525, 11153012, 111204887};
    @EventHandler
    public void exp(PlayerExpChangeEvent e){
        Player player = e.getPlayer();
        int i = 0;

            if(player.getExp() == exp[i]){
                player.setExp(0);
                player.setLevel(1);
                Bukkit.broadcastMessage(ChatColor.RED+"Игрок "+ e.getPlayer() + " получил уровень 1");
            }
            if(player.getExp() == exp[i+1]){
                player.setExp(0);
                player.setLevel(2);
                Bukkit.broadcastMessage(ChatColor.RED+"Игрок "+ e.getPlayer() + " получил уровень 2");
            }
            if(player.getExp() == exp[i+2]){
                player.setExp(0);
                player.setLevel(3);
                Bukkit.broadcastMessage(ChatColor.RED+"Игрок "+ e.getPlayer() + " получил уровень 3");
            }
            if(player.getExp() == exp[i+3]){
                player.setExp(0);
                player.setLevel(4);
                Bukkit.broadcastMessage(ChatColor.RED+"Игрок "+ e.getPlayer() + " получил уровень 4");
            }
            if(player.getExp() == exp[i+4]){
                player.setExp(0);
                player.setLevel(5);
                Bukkit.broadcastMessage(ChatColor.RED+"Игрок "+ e.getPlayer() + " получил уровень 5");
            }
            if(player.getExp() == exp[i+5]){
                player.setExp(0);
                player.setLevel(6);
                Bukkit.broadcastMessage(ChatColor.RED+"Игрок "+ e.getPlayer() + " получил уровень 6");
            }
            if(player.getExp() == exp[i+6]){
                player.setExp(0);
                player.setLevel(7);
                Bukkit.broadcastMessage(ChatColor.RED+"Игрок "+ e.getPlayer() + " получил уровень 7");
            }
        if(player.getExp() == exp[i+7]){
            player.setExp(0);
            player.setLevel(8);
            Bukkit.broadcastMessage(ChatColor.RED+"Игрок "+ e.getPlayer() + " получил уровень 8");
        }




    }

}
