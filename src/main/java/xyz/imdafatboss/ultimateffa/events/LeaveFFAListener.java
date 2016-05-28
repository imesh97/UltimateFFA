package xyz.imdafatboss.ultimateffa.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import xyz.imdafatboss.ultimateffa.Home;
import xyz.imdafatboss.ultimateffa.arena.ArenaManager;

public class LeaveFFAListener implements Listener{

    Home plugin;
    public LeaveFFAListener(Home instance){

        this.plugin = instance;

    }
    ArenaManager mg;

    @EventHandler
    public void onLeaveFFA(PlayerChangedWorldEvent e){

        if(e.getFrom() == mg.getWorld()){



        }

        else{

            return;

        }

    }

}
