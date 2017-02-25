package com.mastereric.halberd.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModRecipes {
    public static void initializeCraftingRecipes() {
		GameRegistry.addRecipe(new ItemStack(ModItems.itemHalberdWood),
				" II", " SI", "S  ",
				'I', new ItemStack(Blocks.PLANKS, 1),
				'S', new ItemStack(Items.STICK, 1));
		GameRegistry.addRecipe(new ItemStack(ModItems.itemHalberdStone),
				" II", " SI", "S  ",
				'I', new ItemStack(Blocks.STONE, 1),
				'S', new ItemStack(Items.STICK, 1));
		GameRegistry.addRecipe(new ItemStack(ModItems.itemHalberdIron),
				" II", " SI", "S  ",
				'I', new ItemStack(Items.IRON_INGOT, 1),
				'S', new ItemStack(Items.STICK, 1));
		GameRegistry.addRecipe(new ItemStack(ModItems.itemHalberdGold),
				" II", " SI", "S  ",
				'I', new ItemStack(Items.GOLD_INGOT, 1),
				'S', new ItemStack(Items.STICK, 1));
		GameRegistry.addRecipe(new ItemStack(ModItems.itemHalberdDiamond),
				" II", " SI", "S  ",
				'I', new ItemStack(Items.DIAMOND, 1),
				'S', new ItemStack(Items.STICK, 1));
	}
}