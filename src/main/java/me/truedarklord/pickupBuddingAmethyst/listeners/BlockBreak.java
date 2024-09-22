package me.truedarklord.pickupBuddingAmethyst.listeners;

import me.truedarklord.pickupBuddingAmethyst.PickupBuddingAmethyst;
import org.bukkit.Material;
import org.bukkit.block.BlockState;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDropItemEvent;
import org.bukkit.inventory.ItemStack;

public class BlockBreak implements Listener {

    public BlockBreak(PickupBuddingAmethyst plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler(ignoreCancelled = true)
    public void onBlockBreak(BlockDropItemEvent event) {
        BlockState blockState = event.getBlockState();
        if (blockState.getType() != Material.BUDDING_AMETHYST) return;

        ItemStack tool = event.getPlayer().getInventory().getItemInMainHand();
        if (!tool.getType().toString().endsWith("PICKAXE") || !tool.containsEnchantment(Enchantment.SILK_TOUCH)) return;

        Item drop = blockState.getWorld().dropItem(blockState.getLocation(), new ItemStack(Material.BUDDING_AMETHYST));
        event.getItems().add(drop);

    }

}
