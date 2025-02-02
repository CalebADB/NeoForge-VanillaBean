package net.lilbeanteam.vanillabeanmod.potion;

import net.lilbeanteam.vanillabeanmod.VanillaBean;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModPotions
{
    public static final DeferredRegister<Potion> POTIONS =
        DeferredRegister.create(BuiltInRegistries.POTION, VanillaBean.MOD_ID);

    public static final Holder<Potion> BEER = POTIONS.register(
            "vanillabean_beer",
            () -> new Potion(new MobEffectInstance(MobEffects.CONFUSION, 600, 0))
    );


    public static void register(IEventBus eventBus)
    {
        POTIONS.register(eventBus);
    }
}

