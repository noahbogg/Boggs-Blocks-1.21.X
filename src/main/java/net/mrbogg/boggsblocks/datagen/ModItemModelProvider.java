package net.mrbogg.boggsblocks.datagen;

import net.minecraft.data.PackOutput;
import net.mrbogg.boggsblocks.BoggsBlocks;
import net.mrbogg.boggsblocks.item.ModItems;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, BoggsBlocks.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.STEEL.get());
    }
}
