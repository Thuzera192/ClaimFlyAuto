package me.thuzera.claimflyauto;

import org.bukkit.plugin.java.JavaPlugin;

public class ClaimFlyAuto extends JavaPlugin {

    private static ClaimFlyAuto instance;

    @Override
    public void onEnable() {
        instance = this;

        getServer().getPluginManager().registerEvents(new FlyListener(), this);

        getLogger().info("ClaimFlyAuto ativado!");
    }

    @Override
    public void onDisable() {
        getLogger().info("ClaimFlyAuto desativado!");
    }

    public static ClaimFlyAuto getInstance() {
        return instance;
    }
}
