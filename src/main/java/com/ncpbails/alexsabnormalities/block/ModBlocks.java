package com.ncpbails.alexsabnormalities.block;

import com.github.alexthe666.alexsmobs.AlexsMobs;
import com.ncpbails.alexsabnormalities.AlexsAbnormalities;
import com.ncpbails.alexsabnormalities.item.ModItems;
import com.teamabnormals.upgrade_aquatic.core.UpgradeAquatic;
import com.teamabnormals.upgrade_aquatic.core.registry.UABlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AlexsAbnormalities.MOD_ID);

    public static final RegistryObject<Block> SHARK_TOOTH_BLOCK = registerBlock("shark_tooth_block",
            () -> new Block(BlockBehaviour.Properties.copy(UABlocks.TOOTH_BLOCK.get()).noOcclusion()), AlexsMobs.TAB, false, 0);

    public static final RegistryObject<Block> SHARK_TOOTH_BRICKS = registerBlock("shark_tooth_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(UABlocks.TOOTH_BRICKS.get()).noOcclusion()), AlexsMobs.TAB, false, 0);

    public static final RegistryObject<Block> SHARK_TOOTH_TILES = registerBlock("shark_tooth_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(UABlocks.TOOTH_TILES.get()).noOcclusion()), AlexsMobs.TAB, false, 0);

    public static final RegistryObject<Block> CHISELED_SHARK_TOOTH_BRICKS = registerBlock("chiseled_bone_serpent_tooth_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(UABlocks.CHISELED_TOOTH_BRICKS.get()).noOcclusion()), AlexsMobs.TAB, false, 0);

    public static final RegistryObject<Block> SHARK_TOOTH_BRICK_SLAB = registerBlock("shark_tooth_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(UABlocks.TOOTH_BRICKS.get()).noOcclusion()), AlexsMobs.TAB, false, 0);

    public static final RegistryObject<Block> SHARK_TOOTH_BRICK_STAIRS = registerBlock("shark_tooth_brick_stairs",
            () -> new StairBlock(() -> UABlocks.TOOTH_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(UABlocks.TOOTH_BRICKS.get()).noOcclusion()), AlexsMobs.TAB, false, 0);


    public static final RegistryObject<Block> CACHALOT_WHALE_TOOTH_BLOCK = registerBlock("cachalot_whale_tooth_block",
            () -> new Block(BlockBehaviour.Properties.copy(UABlocks.TOOTH_BLOCK.get()).noOcclusion()), AlexsMobs.TAB, false, 0);

    public static final RegistryObject<Block> CACHALOT_WHALE_TOOTH_BRICKS = registerBlock("cachalot_whale_tooth_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(UABlocks.TOOTH_BRICKS.get()).noOcclusion()), AlexsMobs.TAB, false, 0);

    public static final RegistryObject<Block> CACHALOT_WHALE_TOOTH_TILES = registerBlock("cachalot_whale_tooth_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(UABlocks.TOOTH_TILES.get()).noOcclusion()), AlexsMobs.TAB, false, 0);

    public static final RegistryObject<Block> CHISELED_CACHALOT_WHALE_TOOTH_BRICKS = registerBlock("chiseled_cachalot_whale_tooth_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(UABlocks.CHISELED_TOOTH_BRICKS.get()).noOcclusion()), AlexsMobs.TAB, false, 0);


    public static final RegistryObject<Block> BONE_SERPENT_TOOTH_BLOCK = registerBlock("bone_serpent_tooth_block",
            () -> new Block(BlockBehaviour.Properties.copy(UABlocks.TOOTH_BLOCK.get()).noOcclusion()), AlexsMobs.TAB, false, 0);

    public static final RegistryObject<Block> BONE_SERPENT_TOOTH_BRICKS = registerBlock("bone_serpent_tooth_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(UABlocks.TOOTH_BRICKS.get()).noOcclusion()), AlexsMobs.TAB, false, 0);

    public static final RegistryObject<Block> BONE_SERPENT_TOOTH_TILES = registerBlock("bone_serpent_tooth_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(UABlocks.TOOTH_TILES.get()).noOcclusion()), AlexsMobs.TAB, false, 0);

    public static final RegistryObject<Block> CHISELED_BONE_SERPENT_TOOTH_BRICKS = registerBlock("chiseled_bone_serpent_tooth_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(UABlocks.CHISELED_TOOTH_BRICKS.get()).noOcclusion()), AlexsMobs.TAB, false, 0);


    public static final RegistryObject<Block> CROCODILE_SCUTE_BLOCK = registerBlock("crocodile_scute_block",
            () -> new Block(BlockBehaviour.Properties.copy(UABlocks.SCUTE_BLOCK.get()).noOcclusion()), AlexsMobs.TAB, false, 0);

    public static final RegistryObject<Block> CROCODILE_SCUTE_PAVEMENT = registerBlock("crocodile_scute_pavement",
            () -> new Block(BlockBehaviour.Properties.copy(UABlocks.SCUTE_PAVEMENT.get()).noOcclusion()), AlexsMobs.TAB, false, 0);

    public static final RegistryObject<Block> CROCODILE_SCUTE_SHINGLES = registerBlock("crocodile_scute_shingles",
            () -> new Block(BlockBehaviour.Properties.copy(UABlocks.SCUTE_SHINGLES.get()).noOcclusion()), AlexsMobs.TAB, false, 0);


    public static final RegistryObject<Block> SPIKED_SCUTE_BLOCK = registerBlock("spiked_scute_block",
            () -> new Block(BlockBehaviour.Properties.copy(UABlocks.SCUTE_BLOCK.get()).noOcclusion()), AlexsMobs.TAB, false, 0);

    public static final RegistryObject<Block> SPIKED_SCUTE_PAVEMENT = registerBlock("spiked_scute_pavement",
            () -> new Block(BlockBehaviour.Properties.copy(UABlocks.SCUTE_PAVEMENT.get()).noOcclusion()), AlexsMobs.TAB, false, 0);

    public static final RegistryObject<Block> SPIKED_SCUTE_SHINGLES = registerBlock("spiked_scute_shingles",
            () -> new Block(BlockBehaviour.Properties.copy(UABlocks.SCUTE_SHINGLES.get()).noOcclusion()), AlexsMobs.TAB, false, 0);



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab, Boolean isFuel, Integer fuelAmount) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab, isFuel, fuelAmount);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab, Boolean isFuel, Integer fuelAmount) {
        if(isFuel == false) {
            return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                    new Item.Properties().tab(tab)));
        } else {
            return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                    new Item.Properties().tab(tab)){
                @Override public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {return fuelAmount;}});
        }
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
