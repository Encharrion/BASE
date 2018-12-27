package com.teamacronymcoders.base.registrysystem;

import java.util.List;

import com.teamacronymcoders.base.IBaseMod;
import com.teamacronymcoders.base.registrysystem.pieces.IRegistryPiece;

import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

public class PotionRegistry extends ModularRegistry<Potion> {

	public PotionRegistry(IBaseMod mod, List<IRegistryPiece> registryPieces) {
		super("POTION", mod, registryPieces);
	}
	
	public void register(Potion potion) {
		ResourceLocation name = new ResourceLocation(this.mod.getID(), potion.getName());
		register(name, potion);
	}

}
