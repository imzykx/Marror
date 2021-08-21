package com.zykx.buildabiome.block;

import com.zykx.buildabiome.util.Registration;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.extensions.IForgeBlockState;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class modblocks {
    public static final RegistryObject<Block> MARESTONE = register("marestone",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .hardnessAndResistance(30f, 1200)
                    .setLightLevel((lightLevel) -> 10)));

    public static final RegistryObject<Block> VERITE = register("verite",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .hardnessAndResistance(30f, 10)));

    public static final RegistryObject<Block> SILVER_BLOCK = register("silver_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.IRON)
            .hardnessAndResistance(4f, 6)));

    public static final RegistryObject<Block> NEW_WOOD = register("new_wood",
            ()-> new Block(AbstractBlock.Properties.create(Material.WOOD)
            .hardnessAndResistance(2f, 1)));

    public static void register(){}

    private static <T extends Block>RegistryObject<T>register(String name, Supplier<T> block){
        RegistryObject<T> toReturn = Registration.BLOCKS.register(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(toReturn.get(),
                new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
        return toReturn;
    }
}
