package com.zykx.buildabiome.item;

import com.zykx.buildabiome.buildabiome;
import com.zykx.buildabiome.util.Registration;
import net.minecraft.client.Minecraft;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

public class moditems
{
    public static final RegistryObject<Item> strawberry =
            Registration.ITEMS.register("strawberry",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD)));


    public static final RegistryObject<Item> silver_ingot =
            Registration.ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> SHRIMP =
            Registration.ITEMS.register("shrimp",
                    () -> new shrimp());

    public static final RegistryObject<Item> SILVER_SHOVEL =
            Registration.ITEMS.register("silver_shovel",
                    () -> new ShovelItem(ModItemTier.SILVER, 0f, 0f,
                            new Item.Properties()
                                    .defaultMaxDamage(150)
                                    .addToolType(ToolType.SHOVEL, 2)
                                    .group(ItemGroup.TOOLS)));

    public static final RegistryObject<Item> SILVER_SWORD =
            Registration.ITEMS.register("silver_sword",
                    ()-> new SwordItem(ModItemTier.SILVER, 2, 2f,
                            new Item.Properties()
                                    .defaultMaxDamage(300)
                                    .group(ItemGroup.TOOLS)));
    public static void register(){}

    public enum ModItemTier implements IItemTier
    {
        SILVER(2, 150, 2.5f, 0f, 15,
                Ingredient.fromStacks(new ItemStack(moditems.silver_ingot.get())));

        private final int harvestLevel;
        private final int maxUses;
        private final float efficiency;
        private final float attackDamage;
        private final int enchantability;
        private final Ingredient repairMaterial;

        ModItemTier(int harvestLevel, int maxUses, float efficiency,
                    float attackDamage, int enchantability, Ingredient repairMaterial) {
            this.harvestLevel = harvestLevel;
            this.maxUses = maxUses;
            this.efficiency = efficiency;
            this.attackDamage = attackDamage;
            this.enchantability = enchantability;
            this.repairMaterial = repairMaterial;
        }

        @Override
        public int getMaxUses()
        {
            return maxUses;
        }

        @Override
        public float getEfficiency()
        {
            return efficiency;
        }

        @Override
        public float getAttackDamage()
        {
            return attackDamage;
        }

        @Override
        public int getHarvestLevel()
        {
            return harvestLevel;
        }

        @Override
        public int getEnchantability()
        {
            return enchantability;
        }

        @Override
        public Ingredient getRepairMaterial()
        {
            return repairMaterial;
        }
 //
}}
