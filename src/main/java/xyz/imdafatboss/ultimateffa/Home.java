package xyz.imdafatboss.ultimateffa;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.imdafatboss.ultimateffa.config.*;
import xyz.imdafatboss.ultimateffa.player.FFAPlayer;
import xyz.imdafatboss.ultimateffa.player.PlayerManager;

import java.util.UUID;

public class Home extends JavaPlugin implements Listener{

    FileManager fm = new FileManager(this);

    @Override
    public void onEnable(){

        this.getLogger().info("Created by imdafatboss");
        fm.getConfig("config.yml").saveDefaultConfig();
        fm.getConfig("data.yml").saveDefaultConfig();

        for(Player player : Bukkit.getOnlinePlayers()){

            newFFAPlayer(player);

        }

    }

    @Override
    public void onDisable(){

        this.savePlayerData();

    }

    public static void newFFAPlayer(Player player){

        FFAPlayer p = new FFAPlayer(player);
        PlayerManager.addPlayer(p);

    }

    public void savePlayerData(){

        for(FFAPlayer p : PlayerManager.getPlayers()){

            FileManager.Config config = fm.getConfig("data.yml");
            YamlConfiguration cfg = config.get();
            UUID uuid = p.getUUID();

            cfg.set(uuid + ".kills", p.getKills());
            cfg.set(uuid + ".assists", p.getAssists());
            cfg.set(uuid + ".deaths", p.getDeaths());
            cfg.set(uuid + ".kda", p.getKDA());
            cfg.set(uuid + ".kdr", p.getKDR());

            config.save();

        }

    }

}
