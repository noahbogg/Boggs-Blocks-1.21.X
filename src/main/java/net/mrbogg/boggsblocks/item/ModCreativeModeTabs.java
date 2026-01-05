package net.mrbogg.boggsblocks.item;


import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.mrbogg.boggsblocks.BoggsBlocks;
import net.mrbogg.boggsblocks.block.ModBlocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BoggsBlocks.MOD_ID);

    public static final Supplier<CreativeModeTab> BOGGS_BLOCKS_ITEMS_TAB = CREATIVE_MODE_TAB.register("boggs_blocks_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STEEL.get()))
                    .title(Component.translatable("creativetab.boggsblocks.boggs_blocks_items"))
                    .displayItems((ItemDisplayParameters, output) -> {
                        // Add Items To Tab
                        output.accept(ModItems.STEEL);

                    }).build());
    public static final Supplier<CreativeModeTab> BOGGS_BLOCKS_BLOCK_TAB = CREATIVE_MODE_TAB.register("boggs_blocks_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.BLACK_WRAPPED_SLASHED))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(BoggsBlocks.MOD_ID,"boggs_blocks_items_tab"))
                    .title(Component.translatable("creativetab.boggsblocks.boggs_blocks_blocks"))
                    .displayItems((ItemDisplayParameters, output) -> {
                        // Add Blocks To Tab
                        output.accept(ModBlocks.BLACK_WRAPPED_SLASHED);

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
