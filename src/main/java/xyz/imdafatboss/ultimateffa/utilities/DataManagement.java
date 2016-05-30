package xyz.imdafatboss.ultimateffa.utilities;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import xyz.imdafatboss.ultimateffa.*;
import xyz.imdafatboss.ultimateffa.config.*;
import xyz.imdafatboss.ultimateffa.kits.*;

public class DataManagement {

    Home plugin;
    public DataManagement(Home instance){

        this.plugin = instance;

    }
    FileManager fm;

    public void saveKits(){

        fm = new FileManager(plugin);
        for(Kit kit : KitManager.getKits()){

            YamlConfiguration cfg = fm.getConfig("kits.yml").get();
            FileManager.Config config = fm.getConfig("kits.yml");

            String name = kit.getName();
            String perm = kit.getPermission();
            Inventory inv = kit.getInventory();
            ItemStack[] armor = kit.getArmor();
            int cooldown = kit.getCooldown();

            cfg.set(name + ".name", name);
            cfg.set(name + ".perm", perm);
            cfg.set(name + ".inv", Utils.halfInv(inv));
            cfg.set(name + ".armor", Utils.armorInv(armor));
            cfg.set(name + ".cooldown", cooldown);

            config.save();

        }

    }

}
