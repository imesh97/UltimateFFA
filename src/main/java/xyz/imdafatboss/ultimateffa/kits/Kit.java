package xyz.imdafatboss.ultimateffa.kits;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import xyz.imdafatboss.ultimateffa.player.FFAPlayer;

public class Kit {

    private final String name;
    private final String permission;
    private Inventory inv;
    private ItemStack[] armor;
    private int cooldown;

    public Kit(String name, Inventory inv, ItemStack[] armor, int cooldown){

        this.name = name;
        this.permission = "ultimateffa.kit." + name.toLowerCase();
        this.inv = inv;
        this.armor = armor;
        this.cooldown = cooldown;

    }

    public final String getName(){

        return this.name;

    }

    public final String getPermission(){

        return this.permission;

    }

    public Inventory getInventory(){

        return this.inv;

    }

    public void setInventory(Inventory inventory){

        this.inv = inventory;

    }

    public ItemStack[] getArmor(){

        return this.armor;

    }

    public int getCooldown(){

        return this.cooldown;

    }

    public void setCooldown(int i){

        this.cooldown = i;

    }

    public void setArmor(ItemStack[] newArmor){

        this.armor = newArmor;

    }

    public void giveKit(FFAPlayer player){

        player.clearInventory();
        player.clearArmor();

        player.giveInventory(this.getInventory());
        player.giveArmor(this.getArmor());

    }

}
