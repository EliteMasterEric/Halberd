package com.mastereric.halberd.proxy;

import com.mastereric.halberd.Reference;
import com.mastereric.halberd.init.ModItems;

public class ClientProxy implements CommonProxy {
	@Override
	public void init() {
		System.out.println("Initializing client...");
		ModItems.initializeItemModels();
	}
}
