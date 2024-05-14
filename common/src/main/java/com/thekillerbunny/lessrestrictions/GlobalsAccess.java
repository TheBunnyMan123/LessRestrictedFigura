package com.thekillerbunny.lessrestrictions;

import org.luaj.vm2.LuaTable;

public interface GlobalsAccess {
    public LuaTable lessRestrictedFigura$getBuiltInDebugLib();

    public void lessRestrictedFigura$setBuiltInDebugLib(LuaTable table);
}
