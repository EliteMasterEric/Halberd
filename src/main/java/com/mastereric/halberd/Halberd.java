package com.mastereric.halberd;

import com.mastereric.halberd.init.ModRecipes;
import com.mastereric.halberd.proxy.CommonProxy;
import com.mastereric.halberd.init.ModItems;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, version = Reference.MOD_VERSION, acceptedMinecraftVersions = Reference.MC_VERSION)
public class Halberd {
    
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
	public static CommonProxy proxy;
	
    @EventHandler
    public void preInit(FMLInitializationEvent event) {
        System.out.println("Initializing " + Reference.MOD_ID + "...");
        
        // Do common initialization.
        // Add items.
		ModItems.initializeItems();
		// Add recipes.
		ModRecipes.initializeCraftingRecipes();
		
		// Do sided initialization.
		System.out.println("Performing sided initialization...");
		proxy.init();
    }
    
}
