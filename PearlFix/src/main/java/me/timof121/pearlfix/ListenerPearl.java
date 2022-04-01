package me.timof121.pearlfix;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;

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
