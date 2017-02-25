package com.mastereric.halberd.common.items;

import com.google.common.collect.Multimap;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class ItemHalberd extends ItemAxe {
    private final Item.ToolMaterial material;
    
	public ItemHalberd(ToolMaterial material) {
		super(material);
        this.material = material;
        this.maxStackSize = 1;
        this.setCreativeTab(CreativeTabs.COMBAT);
	}
}
