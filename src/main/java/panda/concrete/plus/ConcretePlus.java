package panda.concrete.plus;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import panda.concrete.plus.registry.ModBlocks;
import panda.concrete.plus.registry.ModItems;

public class ConcretePlus implements ModInitializer {
	
	public ModBlocks blocks = new ModBlocks();
	public ModItems items = new ModItems();

	public static final ItemGroup concrete_plus_building_group = FabricItemGroupBuilder.build(
		new Identifier("pandamc_concreteplus", "concrete_plus_building_group"), 
		() -> new ItemStack(ModItems.white_concrete_slab)
	);

	public static final ItemGroup concrete_plus_redstone_group = FabricItemGroupBuilder.build(
		new Identifier("pandamc_concreteplus", "concrete_plus_redstone_group"), 
		() -> new ItemStack(ModItems.white_concrete_door)
	);

	@Override
	public void onInitialize() {
		blocks.init();
		items.init();
	}
}