package me.timof121.pearlfix;
import me.daaz.vapor.VaporAPI;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public void onEnable() {
        Bukkit.getLogger().info("PearlFix enabled!");
        getServer().getPluginManager().registerEvents(new ListenerPearl(), this);
        ListenerPearl.vaporAPI = new VaporAPI();
    }

    public void onDisable() {
        Bukkit.getLogger().info("PearlFix disabled!");
    }

}
