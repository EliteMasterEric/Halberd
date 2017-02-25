package com.mastereric.halberd.proxy;

import com.mastereric.halberd.Reference;
import com.mastereric.halberd.init.ModItems;

public class ServerProxy implements CommonProxy {
	@Override
	public void init() {
		System.out.println("Initializing server...");
	}
}
