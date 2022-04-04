package me.timof121.pearlfix;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class ListenerPearl implements Listener {

    @EventHandler
    public void onPearl(org.bukkit.event.player.PlayerTeleportEvent e) {
        if (e.getCause() == org.bukkit.event.player.PlayerTeleportEvent.TeleportCause.ENDER_PEARL) {
            Location location = e.getTo();
            location.setX(location.getBlockX() + 0.5D);
            location.setY(location.getBlockY());
            location.setZ(location.getBlockZ() + 0.5D);
            e.setTo(location);
        }
        Location to = e.getTo();
        if (to.getBlock().getType() == Material.FENCE_GATE) {
            Player player = e.getPlayer();
            player.sendMessage(ChatColor.RED + "(Server) Please don't pearl glitch!");
            e.setCancelled(true);
            e.getPlayer().getInventory().addItem(new org.bukkit.inventory.ItemStack(Material.ENDER_PEARL));
        }
    }

    //@EventHandler
    //public void onClick(org.bukkit.event.player.PlayerInteractEvent e) {
        //if (e.getPlayer().getItemInHand().getType() == org.bukkit.Material.ENDER_PEARL) {
            //if (e.getAction() == Action.RIGHT_CLICK_BLOCK) {
                //e.setCancelled(true);
            //}
        //}
    //}

}
