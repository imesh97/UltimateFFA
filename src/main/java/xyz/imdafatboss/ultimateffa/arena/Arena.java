package xyz.imdafatboss.ultimateffa.arena;

import org.bukkit.*;
import org.bukkit.configuration.file.YamlConfiguration;
import xyz.imdafatboss.ultimateffa.Home;
import xyz.imdafatboss.ultimateffa.player.FFAPlayer;
import xyz.imdafatboss.ultimateffa.utilities.Locations;

import java.util.*;

public class Arena {

    Home plugin;
    public Arena(Home instance){

        this.plugin = instance;

    }

    public Location spawn;
    public List<FFAPlayer> players;
    public List<FFAPlayer> spectators;
    public int totalplayers;
    public boolean started;
    public World world;

    public void newArena(){

        this.spawn = null;
        this.players = new ArrayList<FFAPlayer>();
        this.spectators = new ArrayList<FFAPlayer>();
        this.totalplayers = 0;
        this.world = null;

    }

    public void loadArena(YamlConfiguration file){

        this.spawn = Locations.stringToLocation(file.getString("arena.loc"));
        this.players = new ArrayList<FFAPlayer>();
        this.spectators = new ArrayList<FFAPlayer>();
        this.totalplayers = 0;
        this.world = this.spawn.getWorld();

    }

}
