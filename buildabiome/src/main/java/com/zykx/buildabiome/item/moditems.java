package com.zykx.buildabiome.item;

import com.zykx.buildabiome.util.Registration;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class moditems
{
    public static final RegistryObject<Item> strawberry =
            Registration.ITEMS.register("strawberry",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD)));
    public static void register(){}

    public static final RegistryObject<Item> silver_ingot =
            Registration.ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
//
}
