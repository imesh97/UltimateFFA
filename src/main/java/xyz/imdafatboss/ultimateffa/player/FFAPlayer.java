package xyz.imdafatboss.ultimateffa.player;

import org.bukkit.entity.Player;
import xyz.imdafatboss.ultimateffa.Home;
import xyz.imdafatboss.ultimateffa.config.*;

import java.util.UUID;

public class FFAPlayer {

    Home plugin;
    FileManager fm;

    private final FileManager.Config file;
    private final Player player;
    private final String name;
    private final UUID uuid;
    private int kills;
    private int deaths;
    private int assists;
    private double kdr;
    private double kda;

    public FFAPlayer(Player player){

        fm = new FileManager(plugin);

        this.file = fm.getConfig("data.yml");
        this.player = player;
        this.name = player.getName();
        this.uuid = player.getUniqueId();

        String path = this.uuid + ".";

        if(this.file.get().isConfigurationSection(path)){

            this.kills = this.file.get().getInt(path + "kills");
            this.deaths = this.file.get().getInt(path + "deaths");
            this.deaths = this.file.get().getInt(path + "assists");
            this.kda = this.file.get().getDouble(path + "kda");
            this.kdr = this.file.get().getDouble(path + "kdr");

            return;

        }

        else{

            this.kills = 0;
            this.deaths = 0;
            this.assists = 0;
            this.kda = 0.0;
            this.kdr = 0.0;

        }

    }

    public final FileManager.Config getConfig(){

        return this.file;

    }

    public final Player getPlayer(){

        return this.player;

    }

    public final String getName(){

        return this.name;

    }

    public final UUID getUUID(){

        return this.uuid;

    }

    public int getKills(){

        return this.kills;

    }

    public void setKills(int i){

        this.kills = i;

    }

    public int getDeaths(){

        return this.deaths;

    }

    public void setDeaths(int i){

        this.deaths = i;

    }

    public int getAssists(){

        return this.assists;

    }

    public void setAssists(int i){

        this.assists = i;

    }

    public double getKDA(){

        return this.kda;

    }

    public void setKDA(double i){

        this.kda = i;

    }

    public double getKDR(){

        return this.kdr;

    }

    public void setKDR(double i){

        this.kdr = i;

    }

}
