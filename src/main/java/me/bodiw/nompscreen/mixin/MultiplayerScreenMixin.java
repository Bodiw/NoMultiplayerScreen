package me.bodiw.nompscreen.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.MainMenuScreen;
import net.minecraft.client.gui.screen.MultiplayerScreen;

@Mixin(MultiplayerScreen.class)
public class MultiplayerScreenMixin {

    @Inject(at = @At("HEAD"), method = "init()V", cancellable = true)
    private void setMainScreen(CallbackInfo ci) {
        Minecraft.getInstance().setScreen(new MainMenuScreen());
        ci.cancel();
    }

}
