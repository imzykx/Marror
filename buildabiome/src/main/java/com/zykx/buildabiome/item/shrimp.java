package com.zykx.buildabiome.item;

import com.zykx.buildabiome.buildabiome;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class shrimp extends Item
{
    public shrimp()
    {
        super(new Properties()
                .group(ItemGroup.FOOD)
                .food(new Food.Builder()
                        .hunger(5)
                        .saturation(0.2f)
                        .build()));
    }
}
