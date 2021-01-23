package panda.concrete.plus;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ConcretePlus implements ModInitializer {


	public static final SlabBlock white_concrete_slab = 	 new SlabBlock(FabricBlockSettings.of(Material.STONE));
	public static final SlabBlock orange_concrete_slab = 	 new SlabBlock(FabricBlockSettings.of(Material.STONE));
	public static final SlabBlock magenta_concrete_slab = 	 new SlabBlock(FabricBlockSettings.of(Material.STONE));
	public static final SlabBlock light_blue_concrete_slab = new SlabBlock(FabricBlockSettings.of(Material.STONE));
	public static final SlabBlock yellow_concrete_slab = 	 new SlabBlock(FabricBlockSettings.of(Material.STONE));
	public static final SlabBlock lime_concrete_slab = 		 new SlabBlock(FabricBlockSettings.of(Material.STONE));
	public static final SlabBlock pink_concrete_slab = 		 new SlabBlock(FabricBlockSettings.of(Material.STONE));
	public static final SlabBlock gray_concrete_slab = 		 new SlabBlock(FabricBlockSettings.of(Material.STONE));
	public static final SlabBlock light_gray_concrete_slab = new SlabBlock(FabricBlockSettings.of(Material.STONE));
	public static final SlabBlock cyan_concrete_slab = 		 new SlabBlock(FabricBlockSettings.of(Material.STONE));
	public static final SlabBlock purple_concrete_slab = 	 new SlabBlock(FabricBlockSettings.of(Material.STONE));
	public static final SlabBlock blue_concrete_slab = 		 new SlabBlock(FabricBlockSettings.of(Material.STONE));
	public static final SlabBlock brown_concrete_slab = 	 new SlabBlock(FabricBlockSettings.of(Material.STONE));
	public static final SlabBlock green_concrete_slab = 	 new SlabBlock(FabricBlockSettings.of(Material.STONE));
	public static final SlabBlock red_concrete_slab = 		 new SlabBlock(FabricBlockSettings.of(Material.STONE));
	public static final SlabBlock black_concrete_slab = 	 new SlabBlock(FabricBlockSettings.of(Material.STONE));
	
	@Override
	public void onInitialize() {
		System.out.println("Concrete Plus Started.");

		//Register blocks 
		Registry.register(Registry.BLOCK, new Identifier("pandacp", "white_concrete_slab"),  		white_concrete_slab);
		Registry.register(Registry.BLOCK, new Identifier("pandacp", "orange_concrete_slab"), 		orange_concrete_slab);
		Registry.register(Registry.BLOCK, new Identifier("pandacp", "magenta_concrete_slab"), 		magenta_concrete_slab);
		Registry.register(Registry.BLOCK, new Identifier("pandacp", "light_blue_concrete_slab"), 	light_blue_concrete_slab);
		Registry.register(Registry.BLOCK, new Identifier("pandacp", "yellow_concrete_slab"), 		yellow_concrete_slab);
		Registry.register(Registry.BLOCK, new Identifier("pandacp", "lime_concrete_slab"), 			lime_concrete_slab);
		Registry.register(Registry.BLOCK, new Identifier("pandacp", "pink_concrete_slab"), 			pink_concrete_slab);
		Registry.register(Registry.BLOCK, new Identifier("pandacp", "gray_concrete_slab"), 			gray_concrete_slab);
		Registry.register(Registry.BLOCK, new Identifier("pandacp", "cyan_concrete_slab"), 			cyan_concrete_slab);
		Registry.register(Registry.BLOCK, new Identifier("pandacp", "light_gray_concrete_slab"), 	light_gray_concrete_slab);
		Registry.register(Registry.BLOCK, new Identifier("pandacp", "purple_concrete_slab"), 	 	purple_concrete_slab);
		Registry.register(Registry.BLOCK, new Identifier("pandacp", "blue_concrete_slab"), 	     	blue_concrete_slab);
		Registry.register(Registry.BLOCK, new Identifier("pandacp", "brown_concrete_slab"), 	 	brown_concrete_slab);
		Registry.register(Registry.BLOCK, new Identifier("pandacp", "green_concrete_slab"), 	 	green_concrete_slab);
		Registry.register(Registry.BLOCK, new Identifier("pandacp", "red_concrete_slab"),        	red_concrete_slab);
		Registry.register(Registry.BLOCK, new Identifier("pandacp", "black_concrete_slab"),      	black_concrete_slab);
		//Register blocks as items
		Registry.register(Registry.ITEM, new Identifier("pandacp", "white_concrete_slab"), 			new BlockItem(white_concrete_slab, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("pandacp", "orange_concrete_slab"), 		new BlockItem(orange_concrete_slab, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("pandacp", "magenta_concrete_slab"), 		new BlockItem(magenta_concrete_slab, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("pandacp", "light_blue_concrete_slab"), 	new BlockItem(light_blue_concrete_slab, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("pandacp", "yellow_concrete_slab"), 		new BlockItem(yellow_concrete_slab, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("pandacp", "lime_concrete_slab"), 			new BlockItem(lime_concrete_slab, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("pandacp", "pink_concrete_slab"), 			new BlockItem(pink_concrete_slab, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("pandacp", "gray_concrete_slab"), 			new BlockItem(gray_concrete_slab, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("pandacp", "light_gray_concrete_slab"), 	new BlockItem(light_gray_concrete_slab, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("pandacp", "cyan_concrete_slab"), 			new BlockItem(cyan_concrete_slab, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("pandacp", "purple_concrete_slab"), 		new BlockItem(purple_concrete_slab, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("pandacp", "blue_concrete_slab"), 			new BlockItem(blue_concrete_slab, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("pandacp", "brown_concrete_slab"), 			new BlockItem(brown_concrete_slab, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("pandacp", "green_concrete_slab"), 			new BlockItem(green_concrete_slab, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("pandacp", "red_concrete_slab"), 			new BlockItem(red_concrete_slab, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("pandacp", "black_concrete_slab"), 			new BlockItem(black_concrete_slab, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	
	}
}