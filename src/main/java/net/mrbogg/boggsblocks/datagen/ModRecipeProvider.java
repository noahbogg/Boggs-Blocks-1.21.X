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

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NORMAL_WRAPPED_SLASHED.get(), 4)
                .pattern("SSS")
                .pattern("S S")
                .pattern("SSS")
                .define('S', ModItems.STEEL.get())
                .unlockedBy("has_steel", has(ModItems.STEEL)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLACK_WRAPPED_SLASHED.get(), 4)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .define('S', ModItems.STEEL.get())
                .define('D', Items.BLACK_DYE)
                .unlockedBy("has_steel", has(ModItems.STEEL)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLUE_WRAPPED_SLASHED.get(), 4)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .define('S', ModItems.STEEL.get())
                .define('D', Items.BLUE_DYE)
                .unlockedBy("has_steel", has(ModItems.STEEL)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BROWN_WRAPPED_SLASHED.get(), 4)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .define('S', ModItems.STEEL.get())
                .define('D', Items.BROWN_DYE)
                .unlockedBy("has_steel", has(ModItems.STEEL)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CYAN_WRAPPED_SLASHED.get(), 4)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .define('S', ModItems.STEEL.get())
                .define('D', Items.CYAN_DYE)
                .unlockedBy("has_steel", has(ModItems.STEEL)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GRAY_WRAPPED_SLASHED.get(), 4)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .define('S', ModItems.STEEL.get())
                .define('D', Items.GRAY_DYE)
                .unlockedBy("has_steel", has(ModItems.STEEL)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GREEN_WRAPPED_SLASHED.get(), 4)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .define('S', ModItems.STEEL.get())
                .define('D', Items.GREEN_DYE)
                .unlockedBy("has_steel", has(ModItems.STEEL)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_WRAPPED_SLASHED.get(), 4)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .define('S', ModItems.STEEL.get())
                .define('D', Items.LIGHT_BLUE_DYE)
                .unlockedBy("has_steel", has(ModItems.STEEL)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_WRAPPED_SLASHED.get(), 4)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .define('S', ModItems.STEEL.get())
                .define('D', Items.LIGHT_GRAY_DYE)
                .unlockedBy("has_steel", has(ModItems.STEEL)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIME_WRAPPED_SLASHED.get(), 4)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .define('S', ModItems.STEEL.get())
                .define('D', Items.LIME_DYE)
                .unlockedBy("has_steel", has(ModItems.STEEL)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAGENTA_WRAPPED_SLASHED.get(), 4)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .define('S', ModItems.STEEL.get())
                .define('D', Items.MAGENTA_DYE)
                .unlockedBy("has_steel", has(ModItems.STEEL)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ORANGE_WRAPPED_SLASHED.get(), 4)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .define('S', ModItems.STEEL.get())
                .define('D', Items.ORANGE_DYE)
                .unlockedBy("has_steel", has(ModItems.STEEL)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PINK_WRAPPED_SLASHED.get(), 4)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .define('S', ModItems.STEEL.get())
                .define('D', Items.PINK_DYE)
                .unlockedBy("has_steel", has(ModItems.STEEL)).save(recipeOutput);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PURPLE_WRAPPED_SLASHED.get(), 4)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .define('S', ModItems.STEEL.get())
                .define('D', Items.PURPLE_DYE)
                .unlockedBy("has_steel", has(ModItems.STEEL)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RED_WRAPPED_SLASHED.get(), 4)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .define('S', ModItems.STEEL.get())
                .define('D', Items.RED_DYE)
                .unlockedBy("has_steel", has(ModItems.STEEL)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WHITE_WRAPPED_SLASHED.get(), 4)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .define('S', ModItems.STEEL.get())
                .define('D', Items.WHITE_DYE)
                .unlockedBy("has_steel", has(ModItems.STEEL)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.YELLOW_WRAPPED_SLASHED.get(), 4)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .define('S', ModItems.STEEL.get())
                .define('D', Items.YELLOW_DYE)
                .unlockedBy("has_steel", has(ModItems.STEEL)).save(recipeOutput);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.STEEL.get(), 4)
                .requires(Items.IRON_INGOT,4)
                .requires(Items.COAL,4)
                .unlockedBy("has_iron_ingot",has(Items.IRON_INGOT)).save(recipeOutput);

    }
}
