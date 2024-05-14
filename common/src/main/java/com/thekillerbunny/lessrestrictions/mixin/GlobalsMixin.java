package com.thekillerbunny.lessrestrictions.mixin;

import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaTable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

import com.thekillerbunny.lessrestrictions.GlobalsAccess;

@Mixin(value = Globals.class, remap = false)
public class GlobalsMixin implements GlobalsAccess {
    @Unique
    LuaTable luaBuiltInDebugLib;

    @Override
    public LuaTable lessRestrictedFigura$getBuiltInDebugLib() {
        return luaBuiltInDebugLib;
    }

    @Override
    public void lessRestrictedFigura$setBuiltInDebugLib(LuaTable table) {
        luaBuiltInDebugLib = table;
    }
}
