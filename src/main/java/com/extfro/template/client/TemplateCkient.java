package com.extfro.template.client;

import com.extfro.template.Template;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.javafmlmod.FMLModContainer;

@Mod(value = Template.MOD_ID, dist = Dist.CLIENT)
public class TemplateCkient {

    public TemplateCkient(IEventBus modBus, FMLModContainer container) {
        ClientProxy.init(modBus);
    }
}
