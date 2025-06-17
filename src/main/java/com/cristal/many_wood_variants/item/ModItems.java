package com.cristal.many_wood_variants.item;

import com.cristal.many_wood_variants.Manywood;
import net.minecraft.item.Item;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;

public class ModItems {

    // ===== Vanilla Lumbers ===== //

    public static final Item OAK_LUMBER = registerItem("oak_lumber",new Item(new Item.Settings()));
    public static final Item SPRUCE_LUMBER = registerItem("spruce_lumber",new Item(new Item.Settings()));
    public static final Item BIRCH_LUMBER = registerItem("birch_lumber",new Item(new Item.Settings()));
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Manywood.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Manywood.LOGGER.info("Registering items from "+Manywood.MOD_ID);
    }

}
