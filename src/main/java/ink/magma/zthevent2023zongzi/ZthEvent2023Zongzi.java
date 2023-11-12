package ink.magma.zthevent2023zongzi;

import org.bukkit.plugin.java.JavaPlugin;

public final class ZthEvent2023Zongzi extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new EntityDiedListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
