package dev.whileloop.minecraftplugins;

import dev.whileloop.minecraftplugins.features.DarknessTorchListener;
import dev.whileloop.minecraftplugins.features.WelcomeListener;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public final class MinecraftPlugins extends JavaPlugin {

    private final List<Listener> features = List.of(
        new WelcomeListener(),
        new DarknessTorchListener()
    );

    @Override
    public void onEnable() {
        features.forEach(feature ->
            getServer().getPluginManager().registerEvents(feature, this)
        );
    }
}
