package plugin.server.COMMANDS;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import plugin.server.NPC.Location0;
import plugin.server.NPC.Magazin;

public class CommandMagazin implements CommandExecutor {
    private Magazin magazin;
    private Location0 location0;
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        Player player =(Player) sender;
        magazin = new Magazin();
        location0 = new Location0();
        magazin.Magazin();
        location0.lc01();
        location0.lc02();


        return true;
    }
}
