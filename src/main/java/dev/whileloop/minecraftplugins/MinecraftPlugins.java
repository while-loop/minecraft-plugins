package dev.whileloop.minecraftplugins;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class MinecraftPlugins extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler(ignoreCancelled = true)
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        player.sendMessage(String.format("Welcome to da club, %s", player.getName()));
    }

    @EventHandler(ignoreCancelled = true)
    public void onPlayerMove(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        Location playerLocation = player.getLocation();

        if (playerLocation.getBlock().getLightLevel() >= 2) {
            return;
        }

        Block block = player.getLocation().add(0, -1, 0).getBlock(); // Target block below the player

        if (!block.getType().isSolid()) { // Ensure the block can support a torch
            return;
        }

        playerLocation.getBlock().setType(Material.TORCH);
        player.sendMessage("Torch placed \uD83D\uDD25");
    }
}
