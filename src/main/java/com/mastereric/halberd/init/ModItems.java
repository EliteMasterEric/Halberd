package com.mastereric.halberd.init;

import com.mastereric.halberd.Halberd;
import com.mastereric.halberd.Reference;
import com.mastereric.halberd.common.items.ItemHalberd;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.resources.Language;
import net.minecraft.client.resources.LanguageManager;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {
	public static Item itemHalberdWood;
	public static Item itemHalberdStone;
	public static Item itemHalberdIron;
	public static Item itemHalberdGold;
	public static Item itemHalberdDiamond;
	
    public static void initializeItems() {
		itemHalberdWood = new ItemHalberd(Item.ToolMaterial.WOOD);
		registerItem(itemHalberdWood, Reference.NAME_ITEM_HALBERD_WOOD);
		
		itemHalberdStone = new ItemHalberd(Item.ToolMaterial.STONE);
		registerItem(itemHalberdStone, Reference.NAME_ITEM_HALBERD_STONE);
		
		itemHalberdIron = new ItemHalberd(Item.ToolMaterial.IRON);
		registerItem(itemHalberdIron, Reference.NAME_ITEM_HALBERD_IRON);
		
		itemHalberdGold = new ItemHalberd(Item.ToolMaterial.GOLD);
		registerItem(itemHalberdGold, Reference.NAME_ITEM_HALBERD_GOLD);
		
		itemHalberdDiamond = new ItemHalberd(Item.ToolMaterial.DIAMOND);
		registerItem(itemHalberdDiamond, Reference.NAME_ITEM_HALBERD_DIAMOND);
	}
    
    public static void initializeItemModels() {
    	// Run this on the ClientProxy after running initializeItems.
    	registerItemModel(itemHalberdWood);
    	registerItemModel(itemHalberdStone);
    	registerItemModel(itemHalberdIron);
    	registerItemModel(itemHalberdGold);
    	registerItemModel(itemHalberdDiamond);
    }
    
    public static void registerItem(Item item, String unlocalizedName) {
    	// Set the registry name.
    	item.setRegistryName(Reference.MOD_ID, unlocalizedName);
    	// Add to the game registry.
    	GameRegistry.register(item.setUnlocalizedName(item.getRegistryName().toString()));
    	
    	System.out.println("Registered item~"+item.getRegistryName()+"~"+item.getUnlocalizedName());

    }
    
    public static void registerItemModel(Item item) {
    	// Function overloads make everything simpler.
    	registerItemModel(item, 0);
    }
    
    public static void registerItemModel(Item item, int metadata) {
    	// Register the item model.
    	ModelLoader.setCustomModelResourceLocation(item, metadata,
    			new ModelResourceLocation(new ResourceLocation(Reference.MOD_ID, item.getRegistryName().toString()), "inventory"));
    	
    	System.out.println("Registered item model ~ " + item.getRegistryName() + " ~ " + item.getUnlocalizedName());
    }
}