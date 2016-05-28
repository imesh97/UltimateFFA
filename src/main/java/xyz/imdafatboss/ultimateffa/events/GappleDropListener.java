package xyz.imdafatboss.ultimateffa.events;

import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import xyz.imdafatboss.ultimateffa.Home;
import xyz.imdafatboss.ultimateffa.config.ConfigYML;
import xyz.imdafatboss.ultimateffa.utilities.ItemStacks;

public class GappleDropListener implements Listener{

    Home plugin;
    public GappleDropListener(Home instance){

        this.plugin = instance;

    }
    ConfigYML cfg;

    @EventHandler
    public void onGappleDrop(PlayerDeathEvent e){

        cfg = new ConfigYML(plugin);

        if(cfg.gappleDrop() == true){

            e.getDrops().add(ItemStacks.deathGapple());

        }

    }

    @EventHandler
    public void onActivate(PlayerPickupItemEvent e){

        Item item = e.getItem();
        ItemStack i = item.getItemStack();

        if(i != null){

            if(i.getType() == Material.GOLDEN_APPLE){

                if(i.hasItemMeta()){

                    if(i.getItemMeta().hasDisplayName()){

                        String d = i.getItemMeta().getDisplayName();
                        if(d.equals("Death Gapple - REGEN")){

                            Player p = e.getPlayer();

                            p.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 20 * 5, 1));
                            p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 20 * 3, 1));

                            p.getInventory().remove(i);

                        }

                    }

                }

            }

        }

    }

}
