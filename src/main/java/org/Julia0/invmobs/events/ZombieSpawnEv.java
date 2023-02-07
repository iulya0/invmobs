package org.Julia0.invmobs.events;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class ZombieSpawnEv implements Listener {

    @EventHandler
    public void onZombiSpawn(EntitySpawnEvent event){
        if (event.getEntity().getType() == EntityType.ZOMBIE){
            Random random = new Random();

            if (Math.abs(random.nextDouble()) % 100 >= 50) {
                Zombie zombie = (Zombie) event.getEntity();

                ItemStack itemStack = new ItemStack(Material.DIAMOND_SWORD, 1);
                zombie.getEquipment().setItemInMainHand(itemStack);

                ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET);
                ItemStack chestPlate = new ItemStack(Material.DIAMOND_CHESTPLATE);
                ItemStack leggings = new ItemStack(Material.DIAMOND_LEGGINGS);
                ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS);

                zombie.getEquipment().setHelmet(helmet);
                zombie.getEquipment().setChestplate(chestPlate);
                zombie.getEquipment().setLeggings(leggings);
                zombie.getEquipment().setBoots(boots);
            }
        }
    }
}
