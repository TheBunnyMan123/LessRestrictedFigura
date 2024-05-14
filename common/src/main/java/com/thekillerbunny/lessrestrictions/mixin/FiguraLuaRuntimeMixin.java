package com.thekillerbunny.lessrestrictions.mixin;

import org.figuramc.figura.avatar.Avatar;
import org.figuramc.figura.lua.FiguraLuaRuntime;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.thekillerbunny.lessrestrictions.LessRestrictedFiguraPermission;

@Mixin(value = FiguraLuaRuntime.class, remap = false)
public class FiguraLuaRuntimeMixin {
    @Shadow
    public Avatar owner;

    @Inject(method = "setupFiguraSandbox", at = @At("HEAD"), cancellable = true)
    public void setupFiguraSandboxInjection(CallbackInfo ci) {
        if (owner.permissions.get(LessRestrictedFiguraPermission.UNSANDBOXPERMISSIONS) == 1) {
            ci.cancel();
        }
    }
}
