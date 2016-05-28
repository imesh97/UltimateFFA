package xyz.imdafatboss.ultimateffa.arena;

import org.bukkit.Location;
import xyz.imdafatboss.ultimateffa.Home;
import xyz.imdafatboss.ultimateffa.config.*;
import xyz.imdafatboss.ultimateffa.player.*;

import java.util.*;

public class ArenaManager {

    Home plugin;
    FileManager fm;
    Arena arena = new Arena(plugin);

    public Location getSpawn(){

        return arena.spawn;

    }

    public void setSpawn(Location loc){

        arena.spawn = loc;

    }

    public List<FFAPlayer> getPlayers(){

        return arena.players;

    }

    public List<FFAPlayer> getSpectators(){

        return arena.spectators;

    }

    public void addPlayer(FFAPlayer player){

        this.getPlayers().add(player);

    }

    public void removePlayer(FFAPlayer player){

        this.getPlayers().remove(player);

    }

    public void addSpectator(FFAPlayer player){

        this.getSpectators().add(player);

    }

    public void removeSpectator(FFAPlayer player){

        this.getSpectators().remove(player);

    }

    public int getTotalPlayers(){

        return arena.totalplayers;

    }

    public void setTotalPlayers(){

        arena.totalplayers = this.getPlayers().size();

    }

    public boolean hasStarted(){

        return arena.started;

    }

}
