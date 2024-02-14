package plugin.server;
import java.sql.Connection;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import plugin.server.COMMANDS.*;
import plugin.server.EVENTS.*;
import plugin.server.INVENTORYES.SellGUI;
import plugin.server.MOOBS.mob;
import plugin.server.VALUES.CountMobs;

public final class Server extends JavaPlugin {
    private CountMobs countMobs;
    private SellGUI sellGUI;
    @Override
    public void onEnable() {
        countMobs = new CountMobs();
        sellGUI = new SellGUI();
        getServer().getPluginManager().registerEvents(new JOIN(), this);
        getCommand("items").setExecutor(new CommandItems());
        getCommand("inv").setExecutor(new CommandGUI());
        getServer().getPluginManager().registerEvents(new mob(), this);
        getCommand("sp").setExecutor(new CommandMagazin());
        getServer().getPluginManager().registerEvents(new DamageMagazin(), this);
        getServer().getPluginManager().registerEvents(new GIUOPENMagazin(), this);
        getServer().getPluginManager().registerEvents(new ClickMagazinGUI(), this);
        getServer().getPluginManager().registerEvents(new ClickSellGUI(), this);
        getServer().getPluginManager().registerEvents(new ClickFoodGUI(), this);
        getServer().getPluginManager().registerEvents(new ClickPotionsGUI(), this);
        getServer().getPluginManager().registerEvents(new ClickOthersGUI(), this);
        getCommand("l0").setExecutor(new SpawnLVL0());
        getCommand("spawn").setExecutor(new SpawnCommand());
        getServer().getPluginManager().registerEvents(new ClickMobLocations(), this);
        getServer().getPluginManager().registerEvents(new DamageMobLocations(), this);
        getServer().getPluginManager().registerEvents(new DropEvent(), this);
        getServer().getPluginManager().registerEvents(new EXPevent(), this);


        getServer().getScheduler().runTaskTimer(this, () -> {
            for (Player player : Bukkit.getOnlinePlayers()) {
                Scoreboard scoreboard = Bukkit.getScoreboardManager().getNewScoreboard();


                // Создание Objective для скорборда "Скотобойня"
                Objective skotoboinya = scoreboard.registerNewObjective("skotoboinya", "dummy", ChatColor.GREEN+"Скотобойня");
                skotoboinya.setDisplaySlot(DisplaySlot.SIDEBAR);

                // Добавление данных игрока в скорборд

                 int  exp = player.getTotalExperience();
                 if(exp >= 1000 && exp <1000000){
                     int a = exp%1000;
                   String exp1 = exp/1000 + "," + a + "K";

                     skotoboinya.getScore("Опыт: " + exp1).setScore(0);

                 }
                 if(exp >= 1000000 && exp< 1000000000){
                     int a = exp%1000000;
                    String exp1 = exp/1000000 + ","+ a +"M" ;

                     skotoboinya.getScore("Опыт: " + exp1).setScore(0);
                 }
                if(exp>= 1000000000){
                    int a = exp%1000000;
                    String exp1 = exp/1000000000 + ","+ a +"B" ;

                    skotoboinya.getScore("Опыт: " + exp1).setScore(0);
                }
                 else{
                     skotoboinya.getScore("Опыт: " + exp).setScore(0);
                 }

                skotoboinya.getScore("Уровень " + player.getLevel()).setScore(0);


                skotoboinya.getScore("Убитые мобы: " + player.getStatistic(org.bukkit.Statistic.MOB_KILLS)).setScore(0);
                skotoboinya.getScore("Баланс: " + 100000).setScore(0);
                skotoboinya.getScore("Убито игроков: " +player.getStatistic(org.bukkit.Statistic.PLAYER_KILLS) ).setScore(0);

                player.setScoreboard(scoreboard);
            }
        }, 0, 1);

        getServer().getScheduler().runTaskTimer(this, () -> {
            for (Player player : Bukkit.getOnlinePlayers()) {
                int playerLevel = player.getLevel();
                if(player.getName().equals("Tired_Line")) {
                    player.setPlayerListName(ChatColor.RED + "Dev| " + player.getName() + "  " + ChatColor.GOLD + playerLevel);
                }
                if(player.getName().equals("_TiredLine_")) {
                    player.setPlayerListName(ChatColor.RED+"OWN| " +  player.getName() +"  " + ChatColor.GOLD + playerLevel);
                }
                else if(player.getName().equals("grig1630")) {
                    player.setPlayerListName(ChatColor.RED + "Dev| " + player.getName() + "  " + ChatColor.GOLD + playerLevel);
                }
                else player.setPlayerListName(ChatColor.GREEN+ "Player  " + player.getName() +"  "+ ChatColor.GOLD+ playerLevel);

            }
        }, 0L, 1); // Обновление каждую секунду (20 тиков)
    }







    @Override
    public void onDisable() {


    }
    }


