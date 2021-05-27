package net.adventurez.entity.render;

import net.adventurez.entity.nonliving.FireBreathEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class FireBreathRenderer extends EntityRenderer<FireBreathEntity> {

    public FireBreathRenderer(EntityRenderDispatcher dispatcher) {
        super(dispatcher);
    }

    @Override
    public Identifier getTexture(FireBreathEntity entity) {
        return null;
    }

}