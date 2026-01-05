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
                        output.accept(ModBlocks.LIME_IRON_WRAPPED_SLASHED);
                        output.accept(ModBlocks.PURPLE_SHEETING);
                        output.accept(ModBlocks.GREEN_ANNEXED_RIVETED);
                        output.accept(ModBlocks.LIGHT_GRAY_IRON_WRAPPED_SLASHED);
                        output.accept(ModBlocks.YELLOW_ANNEXED_RIVETED);
                        output.accept(ModBlocks.BLACK_ANNEXED_SLASHED);
                        output.accept(ModBlocks.GREEN_SHEETING);
                        output.accept(ModBlocks.NORMAL_SLASHED);
                        output.accept(ModBlocks.GREEN_SLASHED);
                        output.accept(ModBlocks.WHITE_ANNEXED_RIVETED);
                        output.accept(ModBlocks.PINK_IRON_WRAPPED_SLASHED);
                        output.accept(ModBlocks.BLUE_ANNEXED_SLASHED);
                        output.accept(ModBlocks.RED_IRON_WRAPPED_SLASHED);
                        output.accept(ModBlocks.PURPLE_IRON_WRAPPED_SLASHED);
                        output.accept(ModBlocks.GRAY_SHEETING);
                        output.accept(ModBlocks.ORANGE_RIVETED);
                        output.accept(ModBlocks.LIME_SLASHED);
                        output.accept(ModBlocks.GREEN_IRON_WRAPPED_SLASHED);
                        output.accept(ModBlocks.ORANGE_COPPER_WRAPPED_SLASHED);
                        output.accept(ModBlocks.WHITE_SHEETING);
                        output.accept(ModBlocks.LIGHT_GRAY_SLASHED);
                        output.accept(ModBlocks.RED_WRAPPED_SLASHED);
                        output.accept(ModBlocks.LIGHT_GRAY_COPPER_WRAPPED_SLASHED);
                        output.accept(ModBlocks.GRAY_SLASHED);
                        output.accept(ModBlocks.CYAN_IRON_WRAPPED_SLASHED);
                        output.accept(ModBlocks.NORMAL_ANNEXED_RIVETED);
                        output.accept(ModBlocks.LIME_SHEETING);
                        output.accept(ModBlocks.PURPLE_RIVETED);
                        output.accept(ModBlocks.PINK_WRAPPED_SLASHED);
                        output.accept(ModBlocks.BLUE_IRON_WRAPPED_SLASHED);
                        output.accept(ModBlocks.YELLOW_IRON_WRAPPED_SLASHED);
                        output.accept(ModBlocks.LIME_ANNEXED_SLASHED);
                        output.accept(ModBlocks.ORANGE_ANNEXED_SLASHED);
                        output.accept(ModBlocks.CYAN_WRAPPED_SLASHED);
                        output.accept(ModBlocks.PURPLE_COPPER_WRAPPED_SLASHED);
                        output.accept(ModBlocks.BROWN_SHEETING);
                        output.accept(ModBlocks.LIGHT_BLUE_ANNEXED_SLASHED);
                        output.accept(ModBlocks.RED_ANNEXED_SLASHED);
                        output.accept(ModBlocks.CYAN_SLASHED);
                        output.accept(ModBlocks.MAGENTA_ANNEXED_RIVETED);
                        output.accept(ModBlocks.PURPLE_ANNEXED_RIVETED);
                        output.accept(ModBlocks.PINK_RIVETED);
                        output.accept(ModBlocks.BLUE_RIVETED);
                        output.accept(ModBlocks.BROWN_RIVETED);
                        output.accept(ModBlocks.LIGHT_BLUE_RIVETED);
                        output.accept(ModBlocks.LIGHT_BLUE_WRAPPED_SLASHED);
                        output.accept(ModBlocks.ORANGE_WRAPPED_SLASHED);
                        output.accept(ModBlocks.YELLOW_COPPER_WRAPPED_SLASHED);
                        output.accept(ModBlocks.GRAY_ANNEXED_RIVETED);
                        output.accept(ModBlocks.BLUE_COPPER_WRAPPED_SLASHED);
                        output.accept(ModBlocks.CYAN_ANNEXED_SLASHED);
                        output.accept(ModBlocks.NORMAL_SHEETING);
                        output.accept(ModBlocks.WHITE_RIVETED);
                        output.accept(ModBlocks.LIME_WRAPPED_SLASHED);
                        output.accept(ModBlocks.CYAN_COPPER_WRAPPED_SLASHED);
                        output.accept(ModBlocks.PINK_ANNEXED_SLASHED);
                        output.accept(ModBlocks.ORANGE_IRON_WRAPPED_SLASHED);
                        output.accept(ModBlocks.RED_SLASHED);
                        output.accept(ModBlocks.LIME_COPPER_WRAPPED_SLASHED);
                        output.accept(ModBlocks.BLACK_COPPER_WRAPPED_SLASHED);
                        output.accept(ModBlocks.MAGENTA_SLASHED);
                        output.accept(ModBlocks.LIGHT_GRAY_ANNEXED_RIVETED);
                        output.accept(ModBlocks.BLUE_SHEETING);
                        output.accept(ModBlocks.BROWN_ANNEXED_RIVETED);
                        output.accept(ModBlocks.MAGENTA_SHEETING);
                        output.accept(ModBlocks.BLUE_WRAPPED_SLASHED);
                        output.accept(ModBlocks.YELLOW_SLASHED);
                        output.accept(ModBlocks.CYAN_SHEETING);
                        output.accept(ModBlocks.BLACK_SLASHED);
                        output.accept(ModBlocks.BLACK_WRAPPED_SLASHED);
                        output.accept(ModBlocks.PINK_COPPER_WRAPPED_SLASHED);
                        output.accept(ModBlocks.ORANGE_ANNEXED_RIVETED);
                        output.accept(ModBlocks.WHITE_IRON_WRAPPED_SLASHED);
                        output.accept(ModBlocks.GRAY_WRAPPED_SLASHED);
                        output.accept(ModBlocks.RED_SHEETING);
                        output.accept(ModBlocks.LIGHT_BLUE_ANNEXED_RIVETED);
                        output.accept(ModBlocks.GREEN_COPPER_WRAPPED_SLASHED);
                        output.accept(ModBlocks.LIGHT_BLUE_SHEETING);
                        output.accept(ModBlocks.BLACK_IRON_WRAPPED_SLASHED);
                        output.accept(ModBlocks.NORMAL_ANNEXED_SLASHED);
                        output.accept(ModBlocks.PURPLE_SLASHED);
                        output.accept(ModBlocks.BLACK_SHEETING);
                        output.accept(ModBlocks.ORANGE_SHEETING);
                        output.accept(ModBlocks.LIME_ANNEXED_RIVETED);
                        output.accept(ModBlocks.MAGENTA_WRAPPED_SLASHED);
                        output.accept(ModBlocks.MAGENTA_COPPER_WRAPPED_SLASHED);
                        output.accept(ModBlocks.LIGHT_GRAY_RIVETED);
                        output.accept(ModBlocks.GRAY_RIVETED);
                        output.accept(ModBlocks.ORANGE_SLASHED);
                        output.accept(ModBlocks.LIME_RIVETED);
                        output.accept(ModBlocks.PURPLE_WRAPPED_SLASHED);
                        output.accept(ModBlocks.NORMAL_IRON_WRAPPED_SLASHED);
                        output.accept(ModBlocks.BROWN_WRAPPED_SLASHED);
                        output.accept(ModBlocks.BLUE_ANNEXED_RIVETED);
                        output.accept(ModBlocks.LIGHT_GRAY_WRAPPED_SLASHED);
                        output.accept(ModBlocks.LIGHT_BLUE_COPPER_WRAPPED_SLASHED);
                        output.accept(ModBlocks.BLACK_ANNEXED_RIVETED);
                        output.accept(ModBlocks.RED_COPPER_WRAPPED_SLASHED);
                        output.accept(ModBlocks.YELLOW_ANNEXED_SLASHED);
                        output.accept(ModBlocks.NORMAL_RIVETED);
                        output.accept(ModBlocks.NORMAL_COPPER_WRAPPED_SLASHED);
                        output.accept(ModBlocks.WHITE_ANNEXED_SLASHED);
                        output.accept(ModBlocks.GREEN_RIVETED);
                        output.accept(ModBlocks.GREEN_ANNEXED_SLASHED);
                        output.accept(ModBlocks.YELLOW_RIVETED);
                        output.accept(ModBlocks.BROWN_IRON_WRAPPED_SLASHED);
                        output.accept(ModBlocks.WHITE_WRAPPED_SLASHED);
                        output.accept(ModBlocks.BLACK_RIVETED);
                        output.accept(ModBlocks.YELLOW_WRAPPED_SLASHED);
                        output.accept(ModBlocks.LIGHT_GRAY_ANNEXED_SLASHED);
                        output.accept(ModBlocks.BROWN_ANNEXED_SLASHED);
                        output.accept(ModBlocks.WHITE_COPPER_WRAPPED_SLASHED);
                        output.accept(ModBlocks.GRAY_IRON_WRAPPED_SLASHED);
                        output.accept(ModBlocks.LIGHT_GRAY_SHEETING);
                        output.accept(ModBlocks.GREEN_WRAPPED_SLASHED);
                        output.accept(ModBlocks.MAGENTA_RIVETED);
                        output.accept(ModBlocks.RED_RIVETED);
                        output.accept(ModBlocks.GRAY_COPPER_WRAPPED_SLASHED);
                        output.accept(ModBlocks.LIGHT_BLUE_IRON_WRAPPED_SLASHED);
                        output.accept(ModBlocks.WHITE_SLASHED);
                        output.accept(ModBlocks.NORMAL_WRAPPED_SLASHED);
                        output.accept(ModBlocks.PINK_ANNEXED_RIVETED);
                        output.accept(ModBlocks.BROWN_COPPER_WRAPPED_SLASHED);
                        output.accept(ModBlocks.YELLOW_SHEETING);
                        output.accept(ModBlocks.GRAY_ANNEXED_SLASHED);
                        output.accept(ModBlocks.CYAN_ANNEXED_RIVETED);
                        output.accept(ModBlocks.PURPLE_ANNEXED_SLASHED);
                        output.accept(ModBlocks.PINK_SLASHED);
                        output.accept(ModBlocks.MAGENTA_IRON_WRAPPED_SLASHED);
                        output.accept(ModBlocks.BROWN_SLASHED);
                        output.accept(ModBlocks.BLUE_SLASHED);
                        output.accept(ModBlocks.LIGHT_BLUE_SLASHED);
                        output.accept(ModBlocks.RED_ANNEXED_RIVETED);
                        output.accept(ModBlocks.PINK_SHEETING);
                        output.accept(ModBlocks.MAGENTA_ANNEXED_SLASHED);
                        output.accept(ModBlocks.CYAN_RIVETED);


                        output.accept(ModBlocks.BLACK_RIVETED_PILLAR);

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
