package panda.concrete.plus.registry;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import panda.concrete.plus.custom.CustomCarpet;
import panda.concrete.plus.custom.CustomDoor;
import panda.concrete.plus.custom.CustomPane;
import panda.concrete.plus.custom.CustomSlab;
import panda.concrete.plus.custom.CustomStairs;
import panda.concrete.plus.custom.CustomTrapDoor;
import panda.concrete.plus.custom.CustomWall;

public class ModBlocks {
    public String modId = "pandamc_concreteplus";

    public static final Settings white = AbstractBlock.Settings.of(Material.STONE, DyeColor.WHITE).requiresTool().strength(1.8F);
	public static final Settings orange = AbstractBlock.Settings.of(Material.STONE, DyeColor.ORANGE).requiresTool().strength(1.8F);
	public static final Settings magenta = AbstractBlock.Settings.of(Material.STONE, DyeColor.MAGENTA).requiresTool().strength(1.8F); 
	public static final Settings light_blue = AbstractBlock.Settings.of(Material.STONE, DyeColor.LIGHT_BLUE).requiresTool().strength(1.8F); 
	public static final Settings yellow = AbstractBlock.Settings.of(Material.STONE, DyeColor.YELLOW).requiresTool().strength(1.8F); 
	public static final Settings lime = AbstractBlock.Settings.of(Material.STONE, DyeColor.LIME).requiresTool().strength(1.8F); 
	public static final Settings pink = AbstractBlock.Settings.of(Material.STONE, DyeColor.PINK).requiresTool().strength(1.8F); 
	public static final Settings gray = AbstractBlock.Settings.of(Material.STONE, DyeColor.GRAY).requiresTool().strength(1.8F); 
	public static final Settings light_gray = AbstractBlock.Settings.of(Material.STONE, DyeColor.LIGHT_GRAY).requiresTool().strength(1.8F); 
	public static final Settings cyan = AbstractBlock.Settings.of(Material.STONE, DyeColor.CYAN).requiresTool().strength(1.8F); 
	public static final Settings purple = AbstractBlock.Settings.of(Material.STONE, DyeColor.PURPLE).requiresTool().strength(1.8F); 
	public static final Settings blue = AbstractBlock.Settings.of(Material.STONE, DyeColor.BLUE).requiresTool().strength(1.8F); 
	public static final Settings brown = AbstractBlock.Settings.of(Material.STONE, DyeColor.BROWN).requiresTool().strength(1.8F); 
	public static final Settings green = AbstractBlock.Settings.of(Material.STONE, DyeColor.GREEN).requiresTool().strength(1.8F); 
	public static final Settings red = AbstractBlock.Settings.of(Material.STONE, DyeColor.RED).requiresTool().strength(1.8F); 
	public static final Settings black = AbstractBlock.Settings.of(Material.STONE, DyeColor.BLACK).requiresTool().strength(1.8F); 

    public static final Block white_concrete_slab = register("white_concrete_slab", new CustomSlab(white));
    public static final Block orange_concrete_slab = register("orange_concrete_slab", new CustomSlab(orange));
    public static final Block magenta_concrete_slab = register("magenta_concrete_slab", new CustomSlab(magenta));
    public static final Block light_blue_concrete_slab = register("light_blue_concrete_slab", new CustomSlab(light_blue));
    public static final Block yellow_concrete_slab = register("yellow_concrete_slab", new CustomSlab(yellow));
    public static final Block lime_concrete_slab = register("lime_concrete_slab", new CustomSlab(lime));
    public static final Block pink_concrete_slab = register("pink_concrete_slab", new CustomSlab(pink));
    public static final Block gray_concrete_slab = register("gray_concrete_slab", new CustomSlab(gray));
    public static final Block light_gray_concrete_slab = register("light_gray_concrete_slab", new CustomSlab(light_gray));
    public static final Block cyan_concrete_slab = register("cyan_concrete_slab", new CustomSlab(cyan));
    public static final Block purple_concrete_slab = register("purple_concrete_slab", new CustomSlab(purple));
    public static final Block blue_concrete_slab = register("blue_concrete_slab", new CustomSlab(blue));
    public static final Block brown_concrete_slab = register("brown_concrete_slab", new CustomSlab(brown));
    public static final Block green_concrete_slab = register("green_concrete_slab", new CustomSlab(green));
    public static final Block red_concrete_slab = register("red_concrete_slab", new CustomSlab(red));
    public static final Block black_concrete_slab = register("black_concrete_slab", new CustomSlab(black));

    public static final Block white_concrete_stairs = register("white_concrete_stairs", new CustomStairs(Blocks.WHITE_CONCRETE.getDefaultState(), white));
    public static final Block orange_concrete_stairs = register("orange_concrete_stairs", new CustomStairs(Blocks.ORANGE_CONCRETE.getDefaultState(), orange));
    public static final Block magenta_concrete_stairs = register("magenta_concrete_stairs", new CustomStairs(Blocks.MAGENTA_CONCRETE.getDefaultState(), magenta));
    public static final Block light_blue_concrete_stairs = register("light_blue_concrete_stairs", new CustomStairs(Blocks.LIGHT_BLUE_CONCRETE.getDefaultState(), light_blue));
    public static final Block yellow_concrete_stairs = register("yellow_concrete_stairs", new CustomStairs(Blocks.YELLOW_CONCRETE.getDefaultState(), yellow));
    public static final Block lime_concrete_stairs = register("lime_concrete_stairs", new CustomStairs(Blocks.LIME_CONCRETE.getDefaultState(), lime));
    public static final Block pink_concrete_stairs = register("pink_concrete_stairs", new CustomStairs(Blocks.PINK_CONCRETE.getDefaultState(), pink));
    public static final Block gray_concrete_stairs = register("gray_concrete_stairs", new CustomStairs(Blocks.GRAY_CONCRETE.getDefaultState(), gray));
    public static final Block light_gray_concrete_stairs = register("light_gray_concrete_stairs", new CustomStairs(Blocks.LIGHT_GRAY_CONCRETE.getDefaultState(), light_gray));
    public static final Block cyan_concrete_stairs = register("cyan_concrete_stairs", new CustomStairs(Blocks.CYAN_CONCRETE.getDefaultState(), cyan));
    public static final Block purple_concrete_stairs = register("purple_concrete_stairs", new CustomStairs(Blocks.PURPLE_CONCRETE.getDefaultState(), purple));
    public static final Block blue_concrete_stairs = register("blue_concrete_stairs", new CustomStairs(Blocks.BLUE_CONCRETE.getDefaultState(), blue));
    public static final Block brown_concrete_stairs = register("brown_concrete_stairs", new CustomStairs(Blocks.BROWN_CONCRETE.getDefaultState(), brown));
    public static final Block green_concrete_stairs = register("green_concrete_stairs", new CustomStairs(Blocks.GREEN_CONCRETE.getDefaultState(), green));
    public static final Block red_concrete_stairs = register("red_concrete_stairs", new CustomStairs(Blocks.RED_CONCRETE.getDefaultState(), red));
    public static final Block black_concrete_stairs = register("black_concrete_stairs", new CustomStairs(Blocks.BLACK_CONCRETE.getDefaultState(), black));

    public static final Block white_concrete_wall = register("white_concrete_wall", new CustomWall(white));
    public static final Block orange_concrete_wall = register("orange_concrete_wall", new CustomWall(orange));
    public static final Block magenta_concrete_wall = register("magenta_concrete_wall", new CustomWall(magenta));
    public static final Block light_blue_concrete_wall = register("light_blue_concrete_wall", new CustomWall(light_blue));
    public static final Block yellow_concrete_wall = register("yellow_concrete_wall", new CustomWall(yellow));
    public static final Block lime_concrete_wall = register("lime_concrete_wall", new CustomWall(lime));
    public static final Block pink_concrete_wall = register("pink_concrete_wall", new CustomWall(pink));
    public static final Block gray_concrete_wall = register("gray_concrete_wall", new CustomWall(gray));
    public static final Block light_gray_concrete_wall = register("light_gray_concrete_wall", new CustomWall(light_gray));
    public static final Block cyan_concrete_wall = register("cyan_concrete_wall", new CustomWall(cyan));
    public static final Block purple_concrete_wall = register("purple_concrete_wall", new CustomWall(purple));
    public static final Block blue_concrete_wall = register("blue_concrete_wall", new CustomWall(blue));
    public static final Block brown_concrete_wall = register("brown_concrete_wall", new CustomWall(brown));
    public static final Block green_concrete_wall = register("green_concrete_wall", new CustomWall(green));
    public static final Block red_concrete_wall = register("red_concrete_wall", new CustomWall(red));
    public static final Block black_concrete_wall = register("black_concrete_wall", new CustomWall(black));

    public static final Block white_concrete_carpet = register("white_concrete_carpet", new CustomCarpet(DyeColor.WHITE, white));
    public static final Block orange_concrete_carpet = register("orange_concrete_carpet", new CustomCarpet(DyeColor.ORANGE, orange));
    public static final Block magenta_concrete_carpet = register("magenta_concrete_carpet", new CustomCarpet(DyeColor.MAGENTA, magenta));
    public static final Block light_blue_concrete_carpet = register("light_blue_concrete_carpet", new CustomCarpet(DyeColor.LIGHT_BLUE, light_blue));
    public static final Block yellow_concrete_carpet = register("yellow_concrete_carpet", new CustomCarpet(DyeColor.YELLOW, yellow));
    public static final Block lime_concrete_carpet = register("lime_concrete_carpet", new CustomCarpet(DyeColor.LIME, lime));
    public static final Block pink_concrete_carpet = register("pink_concrete_carpet", new CustomCarpet(DyeColor.PINK, pink));
    public static final Block gray_concrete_carpet = register("gray_concrete_carpet", new CustomCarpet(DyeColor.GRAY, gray));
    public static final Block light_gray_concrete_carpet = register("light_gray_concrete_carpet", new CustomCarpet(DyeColor.LIGHT_GRAY, light_gray));
    public static final Block cyan_concrete_carpet = register("cyan_concrete_carpet", new CustomCarpet(DyeColor.CYAN, cyan));
    public static final Block purple_concrete_carpet = register("purple_concrete_carpet", new CustomCarpet(DyeColor.PURPLE, purple));
    public static final Block blue_concrete_carpet = register("blue_concrete_carpet", new CustomCarpet(DyeColor.BLUE, blue));
    public static final Block brown_concrete_carpet = register("brown_concrete_carpet", new CustomCarpet(DyeColor.BROWN, brown));
    public static final Block green_concrete_carpet = register("green_concrete_carpet", new CustomCarpet(DyeColor.GREEN, green));
    public static final Block red_concrete_carpet = register("red_concrete_carpet", new CustomCarpet(DyeColor.RED, red));
    public static final Block black_concrete_carpet = register("black_concrete_carpet", new CustomCarpet(DyeColor.BLACK, black));

    public static final Block white_concrete_pane = register("white_concrete_pane", new CustomPane(white));
    public static final Block orange_concrete_pane = register("orange_concrete_pane", new CustomPane(orange));
    public static final Block magenta_concrete_pane = register("magenta_concrete_pane", new CustomPane(magenta));
    public static final Block light_blue_concrete_pane = register("light_blue_concrete_pane", new CustomPane(light_blue));
    public static final Block yellow_concrete_pane = register("yellow_concrete_pane", new CustomPane(yellow));
    public static final Block lime_concrete_pane = register("lime_concrete_pane", new CustomPane(lime));
    public static final Block pink_concrete_pane = register("pink_concrete_pane", new CustomPane(pink));
    public static final Block gray_concrete_pane = register("gray_concrete_pane", new CustomPane(gray));
    public static final Block light_gray_concrete_pane = register("light_gray_concrete_pane", new CustomPane(light_gray));
    public static final Block cyan_concrete_pane = register("cyan_concrete_pane", new CustomPane(cyan));
    public static final Block purple_concrete_pane = register("purple_concrete_pane", new CustomPane(purple));
    public static final Block blue_concrete_pane = register("blue_concrete_pane", new CustomPane(blue));
    public static final Block brown_concrete_pane = register("brown_concrete_pane", new CustomPane(brown));
    public static final Block green_concrete_pane = register("green_concrete_pane", new CustomPane(green));
    public static final Block red_concrete_pane = register("red_concrete_pane", new CustomPane(red));
    public static final Block black_concrete_pane = register("black_concrete_pane", new CustomPane(black));

    public static final Block white_concrete_door = register("white_concrete_door", new CustomDoor(white));
	public static final Block orange_concrete_door = register("orange_concrete_door", new CustomDoor(orange));
	public static final Block magenta_concrete_door = register("magenta_concrete_door", new CustomDoor(magenta));
	public static final Block light_blue_concrete_door = register("light_blue_concrete_door", new CustomDoor(light_blue));
	public static final Block yellow_concrete_door = register("yellow_concrete_door", new CustomDoor(yellow));
	public static final Block lime_concrete_door = register("lime_concrete_door", new CustomDoor(lime));
	public static final Block pink_concrete_door = register("pink_concrete_door", new CustomDoor(pink));
	public static final Block gray_concrete_door = register("gray_concrete_door", new CustomDoor(gray));
	public static final Block light_gray_concrete_door = register("light_gray_concrete_door", new CustomDoor(light_gray));
	public static final Block cyan_concrete_door = register("cyan_concrete_door", new CustomDoor(cyan));
	public static final Block purple_concrete_door = register("purple_concrete_door", new CustomDoor(purple));
	public static final Block blue_concrete_door = register("blue_concrete_door", new CustomDoor(blue));
	public static final Block brown_concrete_door = register("brown_concrete_door", new CustomDoor(brown));
	public static final Block green_concrete_door = register("green_concrete_door", new CustomDoor(green));
	public static final Block red_concrete_door = register("red_concrete_door", new CustomDoor(red));
    public static final Block black_concrete_door = register("black_concrete_door", new CustomDoor(black));
    
    public static final Block white_concrete_trapdoor = register("white_concrete_trapdoor", new CustomTrapDoor(white));
    public static final Block orange_concrete_trapdoor = register("orange_concrete_trapdoor", new CustomTrapDoor(orange));
    public static final Block magenta_concrete_trapdoor = register("magenta_concrete_trapdoor", new CustomTrapDoor(magenta));
    public static final Block light_blue_concrete_trapdoor = register("light_blue_concrete_trapdoor", new CustomTrapDoor(light_blue));
    public static final Block yellow_concrete_trapdoor = register("yellow_concrete_trapdoor", new CustomTrapDoor(yellow));
    public static final Block lime_concrete_trapdoor = register("lime_concrete_trapdoor", new CustomTrapDoor(lime));
    public static final Block pink_concrete_trapdoor = register("pink_concrete_trapdoor", new CustomTrapDoor(pink));
    public static final Block gray_concrete_trapdoor = register("gray_concrete_trapdoor", new CustomTrapDoor(gray));
    public static final Block light_gray_concrete_trapdoor = register("light_gray_concrete_trapdoor", new CustomTrapDoor(light_gray));
    public static final Block cyan_concrete_trapdoor = register("cyan_concrete_trapdoor", new CustomTrapDoor(cyan));
    public static final Block purple_concrete_trapdoor = register("purple_concrete_trapdoor", new CustomTrapDoor(purple));
    public static final Block blue_concrete_trapdoor = register("blue_concrete_trapdoor", new CustomTrapDoor(blue));
    public static final Block brown_concrete_trapdoor = register("brown_concrete_trapdoor", new CustomTrapDoor(brown));
    public static final Block green_concrete_trapdoor = register("green_concrete_trapdoor", new CustomTrapDoor(green));
    public static final Block red_concrete_trapdoor = register("red_concrete_trapdoor", new CustomTrapDoor(red));
    public static final Block black_concrete_trapdoor = register("black_concrete_trapdoor", new CustomTrapDoor(black));
    
    public static final Block white_concrete_door_powered = register("white_concrete_door_powered", new CustomDoor(white.of(Material.METAL)));
	public static final Block orange_concrete_door_powered = register("orange_concrete_door_powered", new CustomDoor(orange.of(Material.METAL)));
	public static final Block magenta_concrete_door_powered = register("magenta_concrete_door_powered", new CustomDoor(magenta.of(Material.METAL)));
	public static final Block light_blue_concrete_door_powered = register("light_blue_concrete_door_powered", new CustomDoor(light_blue.of(Material.METAL)));
	public static final Block yellow_concrete_door_powered = register("yellow_concrete_door_powered", new CustomDoor(yellow.of(Material.METAL)));
	public static final Block lime_concrete_door_powered = register("lime_concrete_door_powered", new CustomDoor(lime.of(Material.METAL)));
	public static final Block pink_concrete_door_powered = register("pink_concrete_door_powered", new CustomDoor(pink.of(Material.METAL)));
	public static final Block gray_concrete_door_powered = register("gray_concrete_door_powered", new CustomDoor(gray.of(Material.METAL)));
	public static final Block light_gray_concrete_door_powered = register("light_gray_concrete_door_powered", new CustomDoor(light_gray.of(Material.METAL)));
	public static final Block cyan_concrete_door_powered = register("cyan_concrete_door_powered", new CustomDoor(cyan.of(Material.METAL)));
	public static final Block purple_concrete_door_powered = register("purple_concrete_door_powered", new CustomDoor(purple.of(Material.METAL)));
	public static final Block blue_concrete_door_powered = register("blue_concrete_door_powered", new CustomDoor(blue.of(Material.METAL)));
	public static final Block brown_concrete_door_powered = register("brown_concrete_door_powered", new CustomDoor(brown.of(Material.METAL)));
	public static final Block green_concrete_door_powered = register("green_concrete_door_powered", new CustomDoor(green.of(Material.METAL)));
	public static final Block red_concrete_door_powered = register("red_concrete_door_powered", new CustomDoor(red.of(Material.METAL)));
    public static final Block black_concrete_door_powered = register("black_concrete_door_powered", new CustomDoor(black.of(Material.METAL)));
    
    public static final Block white_concrete_trapdoor_powered = register("white_concrete_trapdoor_powered", new CustomTrapDoor(white.of(Material.METAL)));
	public static final Block orange_concrete_trapdoor_powered = register("orange_concrete_trapdoor_powered", new CustomTrapDoor(orange.of(Material.METAL)));
	public static final Block magenta_concrete_trapdoor_powered = register("magenta_concrete_trapdoor_powered", new CustomTrapDoor(magenta.of(Material.METAL)));
	public static final Block light_blue_concrete_trapdoor_powered = register("light_blue_concrete_trapdoor_powered", new CustomTrapDoor(light_blue.of(Material.METAL)));
	public static final Block yellow_concrete_trapdoor_powered = register("yellow_concrete_trapdoor_powered", new CustomTrapDoor(yellow.of(Material.METAL)));
	public static final Block lime_concrete_trapdoor_powered = register("lime_concrete_trapdoor_powered", new CustomTrapDoor(lime.of(Material.METAL)));
	public static final Block pink_concrete_trapdoor_powered = register("pink_concrete_trapdoor_powered", new CustomTrapDoor(pink.of(Material.METAL)));
	public static final Block gray_concrete_trapdoor_powered = register("gray_concrete_trapdoor_powered", new CustomTrapDoor(gray.of(Material.METAL)));
	public static final Block light_gray_concrete_trapdoor_powered = register("light_gray_concrete_trapdoor_powered", new CustomTrapDoor(light_gray.of(Material.METAL)));
	public static final Block cyan_concrete_trapdoor_powered = register("cyan_concrete_trapdoor_powered", new CustomTrapDoor(cyan.of(Material.METAL)));
	public static final Block purple_concrete_trapdoor_powered = register("purple_concrete_trapdoor_powered", new CustomTrapDoor(purple.of(Material.METAL)));
	public static final Block blue_concrete_trapdoor_powered = register("blue_concrete_trapdoor_powered", new CustomTrapDoor(blue.of(Material.METAL)));
	public static final Block brown_concrete_trapdoor_powered = register("brown_concrete_trapdoor_powered", new CustomTrapDoor(brown.of(Material.METAL)));
	public static final Block green_concrete_trapdoor_powered = register("green_concrete_trapdoor_powered", new CustomTrapDoor(green.of(Material.METAL)));
	public static final Block red_concrete_trapdoor_powered = register("red_concrete_trapdoor_powered", new CustomTrapDoor(red.of(Material.METAL)));
    public static final Block black_concrete_trapdoor_powered = register("black_concrete_trapdoor_powered", new CustomTrapDoor(black.of(Material.METAL)));

    private static Block register(String path, Block entry) {
        return Registry.register(Registry.BLOCK, new Identifier("pandamc_concreteplus", path), entry);
    }

	public void init() {
	}
}
