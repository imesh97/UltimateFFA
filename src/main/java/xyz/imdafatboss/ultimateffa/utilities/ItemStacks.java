package xyz.imdafatboss.ultimateffa.utilities;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemStacks {

    public static ItemStack deathGapple(){

        ItemStack i = new ItemStack(Material.GOLDEN_APPLE);
        ItemMeta im = i.getItemMeta();

        im.setDisplayName("Death Gapple - REGEN");
        i.setItemMeta(im);

        return i;
    }



}
