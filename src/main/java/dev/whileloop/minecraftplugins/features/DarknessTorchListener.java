package dev.whileloop.minecraftplugins.features;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public final class DarknessTorchListener implements Listener {

    @EventHandler(ignoreCancelled = true)
    public void onPlayerMove(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        Location playerLocation = player.getLocation();

        if (playerLocation.getBlock().getLightLevel() >= 2) {
            return;
        }

        Block block = playerLocation.clone().add(0, -1, 0).getBlock();
        if (!block.getType().isSolid()) {
            return;
        }

        playerLocation.getBlock().setType(Material.TORCH);
        player.sendMessage("Torch placed 🔥");
    }
}
