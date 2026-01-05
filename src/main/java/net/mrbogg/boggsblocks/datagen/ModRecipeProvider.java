package net.mrbogg.boggsblocks.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.mrbogg.boggsblocks.block.ModBlocks;
import net.mrbogg.boggsblocks.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLACK_WRAPPED_SLASHED.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("SSS")
                .define('S', ModItems.STEEL.get())
                .unlockedBy("has_steel", has(ModItems.STEEL)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.STEEL.get(), 4)
                .requires(Items.IRON_INGOT,4)
                .requires(Items.COAL,4)
                .unlockedBy("has_iron_ingot",has(Items.IRON_INGOT)).save(recipeOutput);
    }
}
