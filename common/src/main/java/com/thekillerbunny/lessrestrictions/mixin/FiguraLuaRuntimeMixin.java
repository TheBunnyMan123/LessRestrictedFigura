package com.thekillerbunny.lessrestrictions.mixin;

import org.figuramc.figura.lua.FiguraLuaRuntime;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = FiguraLuaRuntime.class, remap = false)
public class FiguraLuaRuntimeMixin {
    @Inject(method = "setupFiguraSandbox()V", at = @At("HEAD"), cancellable = true)
    public void setupFiguraSandboxInjection(CallbackInfoReturnable<Void> ci) {
        ci.cancel();
    }
}
