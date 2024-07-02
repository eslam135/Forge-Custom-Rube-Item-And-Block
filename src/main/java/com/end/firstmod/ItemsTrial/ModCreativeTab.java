package com.end.firstmod.ItemsTrial;

import com.end.firstmod.FirstMod;
import com.end.firstmod.blockTrial.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FirstMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> rubies_items = CREATIVE_MOD_TAB.register("rubiestab",
            () -> CreativeModeTab.builder().title(Component.translatable("creativetab.rubies_items")).
                    icon(() -> new ItemStack(NewItems.RUBIES.get()))
                    .displayItems(((pParameters, pOutput) -> {
                        pOutput.accept(NewItems.RUBIES.get());
                        pOutput.accept(NewItems.RAW_RUBIES.get());
                        pOutput.accept(ModBlocks.RUBY_BLOCK.get());
                    }))
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MOD_TAB.register(eventBus);
    }
}
