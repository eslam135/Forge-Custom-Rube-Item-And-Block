package com.end.firstmod.item;

import com.end.firstmod.FirstMod;
import com.end.firstmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FirstMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> rubies_items = CREATIVE_MOD_TAB.register("titanium_tab",
            () -> CreativeModeTab.builder().title(Component.translatable("creativetab.titanium_tab")).
                    icon(() -> new ItemStack(NewItems.TITANIUM_INGOT.get()))
                    .displayItems(((pParameters, pOutput) -> {
                        pOutput.accept(NewItems.TITANIUM_INGOT.get());
                        pOutput.accept(NewItems.RAW_TITANIUM.get());
                        pOutput.accept(ModBlocks.TITANIUM_BLOCK.get());
                        pOutput.accept(ModBlocks.TITANIUM_ORE.get());
                    }))
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MOD_TAB.register(eventBus);
    }
}
