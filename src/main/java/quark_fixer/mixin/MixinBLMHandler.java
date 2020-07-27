package quark_fixer.mixin;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import vazkii.quark.base.client.BLMHandler;

@Mixin(BLMHandler.class)
public class MixinBLMHandler {
    private static boolean isEnglish(Minecraft mc) {
        return false;
    }
}
