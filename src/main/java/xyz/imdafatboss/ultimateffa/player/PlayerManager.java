package xyz.imdafatboss.ultimateffa.player;

import com.google.common.collect.ImmutableList;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.*;

public class PlayerManager {

    private static final Map<String, FFAPlayer> players = new HashMap<String, FFAPlayer>();

    public static FFAPlayer addPlayer(FFAPlayer player) {

        return (FFAPlayer) players.put(player.getName(), player);

    }

    public static FFAPlayer removePlayer(FFAPlayer player) {

        return (FFAPlayer) players.remove(player.getName());

    }

    public static boolean isFFAPlayer(Player player) {

        return players.containsKey(player.getName());

    }

    public static FFAPlayer getPlayer(Player player) {

        return (FFAPlayer) players.get(player.getName());

    }

    public static FFAPlayer getPlayer(String input) {

        return (FFAPlayer) players.get(input);

    }

    public static FFAPlayer getPlayer(UUID uuid) {

        return (FFAPlayer) players.get(Bukkit.getPlayer(uuid));

    }

    public static FFAPlayer getPlayer(CommandSender sender) {

        return (sender instanceof Player) ? getPlayer((Player) sender) : null;

    }

    public static List<FFAPlayer> getPlayers(){

        return ImmutableList.copyOf(players.values());

    }

}
