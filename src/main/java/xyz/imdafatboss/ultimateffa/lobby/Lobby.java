package xyz.imdafatboss.ultimateffa.lobby;

import org.bukkit.Location;

public class Lobby {

    private static Location lobby;

    public static Location getLocation(){

        return lobby;

    }

    public static void setLocation(Location loc){

        lobby = loc;

    }

}
