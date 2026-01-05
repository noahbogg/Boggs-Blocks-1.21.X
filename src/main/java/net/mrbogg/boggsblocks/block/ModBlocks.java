package net.mrbogg.boggsblocks.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.mrbogg.boggsblocks.BoggsBlocks;
import net.mrbogg.boggsblocks.item.ModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(BoggsBlocks.MOD_ID);
    // Block instead of RotatedPillarBlock if it doesnt need it...
    public static final DeferredBlock<Block> BLACK_WRAPPED_SLASHED = registerBlock("black_wrapped_slashed",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> LIME_IRON_WRAPPED_SLASHED = registerBlock("lime_iron_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> PURPLE_SHEETING = registerBlock("purple_sheeting",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> GREEN_ANNEXED_RIVETED = registerBlock("green_annexed_riveted",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> LIGHT_GRAY_IRON_WRAPPED_SLASHED = registerBlock("light_gray_iron_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> YELLOW_ANNEXED_RIVETED = registerBlock("yellow_annexed_riveted",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> BLACK_ANNEXED_SLASHED = registerBlock("black_annexed_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> GREEN_SHEETING = registerBlock("green_sheeting",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> NORMAL_SLASHED = registerBlock("normal_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> GREEN_SLASHED = registerBlock("green_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> WHITE_ANNEXED_RIVETED = registerBlock("white_annexed_riveted",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> PINK_IRON_WRAPPED_SLASHED = registerBlock("pink_iron_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> BLUE_ANNEXED_SLASHED = registerBlock("blue_annexed_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> RED_IRON_WRAPPED_SLASHED = registerBlock("red_iron_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> PURPLE_IRON_WRAPPED_SLASHED = registerBlock("purple_iron_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> GRAY_SHEETING = registerBlock("gray_sheeting",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> ORANGE_RIVETED = registerBlock("orange_riveted",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> LIME_SLASHED = registerBlock("lime_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> GREEN_IRON_WRAPPED_SLASHED = registerBlock("green_iron_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> ORANGE_COPPER_WRAPPED_SLASHED = registerBlock("orange_copper_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> WHITE_SHEETING = registerBlock("white_sheeting",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> LIGHT_GRAY_SLASHED = registerBlock("light_gray_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> RED_WRAPPED_SLASHED = registerBlock("red_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> LIGHT_GRAY_COPPER_WRAPPED_SLASHED = registerBlock("light_gray_copper_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> GRAY_SLASHED = registerBlock("gray_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> CYAN_IRON_WRAPPED_SLASHED = registerBlock("cyan_iron_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> NORMAL_ANNEXED_RIVETED = registerBlock("normal_annexed_riveted",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> LIME_SHEETING = registerBlock("lime_sheeting",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> PURPLE_RIVETED = registerBlock("purple_riveted",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> PINK_WRAPPED_SLASHED = registerBlock("pink_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> BLUE_IRON_WRAPPED_SLASHED = registerBlock("blue_iron_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> YELLOW_IRON_WRAPPED_SLASHED = registerBlock("yellow_iron_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> LIME_ANNEXED_SLASHED = registerBlock("lime_annexed_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> ORANGE_ANNEXED_SLASHED = registerBlock("orange_annexed_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> CYAN_WRAPPED_SLASHED = registerBlock("cyan_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> PURPLE_COPPER_WRAPPED_SLASHED = registerBlock("purple_copper_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> BROWN_SHEETING = registerBlock("brown_sheeting",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> LIGHT_BLUE_ANNEXED_SLASHED = registerBlock("light_blue_annexed_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> RED_ANNEXED_SLASHED = registerBlock("red_annexed_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> CYAN_SLASHED = registerBlock("cyan_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> MAGENTA_ANNEXED_RIVETED = registerBlock("magenta_annexed_riveted",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> PURPLE_ANNEXED_RIVETED = registerBlock("purple_annexed_riveted",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> PINK_RIVETED = registerBlock("pink_riveted",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> BLUE_RIVETED = registerBlock("blue_riveted",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> BROWN_RIVETED = registerBlock("brown_riveted",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> LIGHT_BLUE_RIVETED = registerBlock("light_blue_riveted",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> LIGHT_BLUE_WRAPPED_SLASHED = registerBlock("light_blue_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> ORANGE_WRAPPED_SLASHED = registerBlock("orange_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> YELLOW_COPPER_WRAPPED_SLASHED = registerBlock("yellow_copper_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> GRAY_ANNEXED_RIVETED = registerBlock("gray_annexed_riveted",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> BLUE_COPPER_WRAPPED_SLASHED = registerBlock("blue_copper_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> CYAN_ANNEXED_SLASHED = registerBlock("cyan_annexed_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> NORMAL_SHEETING = registerBlock("normal_sheeting",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> WHITE_RIVETED = registerBlock("white_riveted",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> LIME_WRAPPED_SLASHED = registerBlock("lime_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> CYAN_COPPER_WRAPPED_SLASHED = registerBlock("cyan_copper_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> PINK_ANNEXED_SLASHED = registerBlock("pink_annexed_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> ORANGE_IRON_WRAPPED_SLASHED = registerBlock("orange_iron_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> RED_SLASHED = registerBlock("red_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> LIME_COPPER_WRAPPED_SLASHED = registerBlock("lime_copper_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> BLACK_COPPER_WRAPPED_SLASHED = registerBlock("black_copper_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> MAGENTA_SLASHED = registerBlock("magenta_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> LIGHT_GRAY_ANNEXED_RIVETED = registerBlock("light_gray_annexed_riveted",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> BLUE_SHEETING = registerBlock("blue_sheeting",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> BROWN_ANNEXED_RIVETED = registerBlock("brown_annexed_riveted",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> MAGENTA_SHEETING = registerBlock("magenta_sheeting",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> BLUE_WRAPPED_SLASHED = registerBlock("blue_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> YELLOW_SLASHED = registerBlock("yellow_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> CYAN_SHEETING = registerBlock("cyan_sheeting",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> BLACK_SLASHED = registerBlock("black_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> PINK_COPPER_WRAPPED_SLASHED = registerBlock("pink_copper_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> ORANGE_ANNEXED_RIVETED = registerBlock("orange_annexed_riveted",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> WHITE_IRON_WRAPPED_SLASHED = registerBlock("white_iron_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> GRAY_WRAPPED_SLASHED = registerBlock("gray_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> RED_SHEETING = registerBlock("red_sheeting",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> LIGHT_BLUE_ANNEXED_RIVETED = registerBlock("light_blue_annexed_riveted",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> GREEN_COPPER_WRAPPED_SLASHED = registerBlock("green_copper_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> LIGHT_BLUE_SHEETING = registerBlock("light_blue_sheeting",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> BLACK_IRON_WRAPPED_SLASHED = registerBlock("black_iron_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> NORMAL_ANNEXED_SLASHED = registerBlock("normal_annexed_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> PURPLE_SLASHED = registerBlock("purple_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> BLACK_SHEETING = registerBlock("black_sheeting",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> ORANGE_SHEETING = registerBlock("orange_sheeting",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> LIME_ANNEXED_RIVETED = registerBlock("lime_annexed_riveted",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> MAGENTA_WRAPPED_SLASHED = registerBlock("magenta_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> MAGENTA_COPPER_WRAPPED_SLASHED = registerBlock("magenta_copper_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> LIGHT_GRAY_RIVETED = registerBlock("light_gray_riveted",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> GRAY_RIVETED = registerBlock("gray_riveted",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> ORANGE_SLASHED = registerBlock("orange_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> LIME_RIVETED = registerBlock("lime_riveted",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> PURPLE_WRAPPED_SLASHED = registerBlock("purple_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> NORMAL_IRON_WRAPPED_SLASHED = registerBlock("normal_iron_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> BROWN_WRAPPED_SLASHED = registerBlock("brown_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> BLUE_ANNEXED_RIVETED = registerBlock("blue_annexed_riveted",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> LIGHT_GRAY_WRAPPED_SLASHED = registerBlock("light_gray_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> LIGHT_BLUE_COPPER_WRAPPED_SLASHED = registerBlock("light_blue_copper_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> BLACK_ANNEXED_RIVETED = registerBlock("black_annexed_riveted",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> RED_COPPER_WRAPPED_SLASHED = registerBlock("red_copper_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> YELLOW_ANNEXED_SLASHED = registerBlock("yellow_annexed_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> NORMAL_RIVETED = registerBlock("normal_riveted",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> NORMAL_COPPER_WRAPPED_SLASHED = registerBlock("normal_copper_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> WHITE_ANNEXED_SLASHED = registerBlock("white_annexed_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> GREEN_RIVETED = registerBlock("green_riveted",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> GREEN_ANNEXED_SLASHED = registerBlock("green_annexed_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> YELLOW_RIVETED = registerBlock("yellow_riveted",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> BROWN_IRON_WRAPPED_SLASHED = registerBlock("brown_iron_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> WHITE_WRAPPED_SLASHED = registerBlock("white_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> BLACK_RIVETED = registerBlock("black_riveted",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> YELLOW_WRAPPED_SLASHED = registerBlock("yellow_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> LIGHT_GRAY_ANNEXED_SLASHED = registerBlock("light_gray_annexed_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> BROWN_ANNEXED_SLASHED = registerBlock("brown_annexed_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> WHITE_COPPER_WRAPPED_SLASHED = registerBlock("white_copper_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> GRAY_IRON_WRAPPED_SLASHED = registerBlock("gray_iron_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> LIGHT_GRAY_SHEETING = registerBlock("light_gray_sheeting",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> GREEN_WRAPPED_SLASHED = registerBlock("green_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> MAGENTA_RIVETED = registerBlock("magenta_riveted",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> RED_RIVETED = registerBlock("red_riveted",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> GRAY_COPPER_WRAPPED_SLASHED = registerBlock("gray_copper_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> LIGHT_BLUE_IRON_WRAPPED_SLASHED = registerBlock("light_blue_iron_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> WHITE_SLASHED = registerBlock("white_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> NORMAL_WRAPPED_SLASHED = registerBlock("normal_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> PINK_ANNEXED_RIVETED = registerBlock("pink_annexed_riveted",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> BROWN_COPPER_WRAPPED_SLASHED = registerBlock("brown_copper_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> YELLOW_SHEETING = registerBlock("yellow_sheeting",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> GRAY_ANNEXED_SLASHED = registerBlock("gray_annexed_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> CYAN_ANNEXED_RIVETED = registerBlock("cyan_annexed_riveted",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> PURPLE_ANNEXED_SLASHED = registerBlock("purple_annexed_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> PINK_SLASHED = registerBlock("pink_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> MAGENTA_IRON_WRAPPED_SLASHED = registerBlock("magenta_iron_wrapped_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> BROWN_SLASHED = registerBlock("brown_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> BLUE_SLASHED = registerBlock("blue_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> LIGHT_BLUE_SLASHED = registerBlock("light_blue_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> RED_ANNEXED_RIVETED = registerBlock("red_annexed_riveted",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> PINK_SHEETING = registerBlock("pink_sheeting",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> MAGENTA_ANNEXED_SLASHED = registerBlock("magenta_annexed_slashed",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> CYAN_RIVETED = registerBlock("cyan_riveted",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));


    public static final DeferredBlock<Block> BLACK_RIVETED_PILLAR = registerBlock("black_riveted_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)));


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
