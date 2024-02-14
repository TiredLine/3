package plugin.server.COMMANDS;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import plugin.server.NPC.Location0;

public class SpawnLVL0 implements CommandExecutor {
    private Location0 location0;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        Player player = (Player) sender;
        location0 = new Location0();
        location0.lc01();

        return true;
    }
}
