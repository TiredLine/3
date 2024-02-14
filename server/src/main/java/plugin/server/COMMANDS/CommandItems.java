package plugin.server.COMMANDS;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import plugin.server.INVENTORYES.CUIitems;

public class CommandItems implements CommandExecutor {
    private CUIitems cuIitems;
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        cuIitems = new CUIitems();
        Player player =(Player) sender;
        if(player.isOp() ) {
            player.openInventory(cuIitems.MenuItems());
        }
        return true;
    }
}
