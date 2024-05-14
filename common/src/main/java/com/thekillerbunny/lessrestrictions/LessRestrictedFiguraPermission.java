package com.thekillerbunny.lessrestrictions;

import org.figuramc.figura.entries.FiguraPermissions;
import org.figuramc.figura.entries.annotations.FiguraPermissionsPlugin;
import org.figuramc.figura.permissions.Permissions;

import java.util.Collection;
import java.util.List;

@FiguraPermissionsPlugin
public class LessRestrictedFiguraPermission implements FiguraPermissions {
    /**
     * Example for a permission, available constructors are as follows:
     *  Toggleable Permission: Permissions(name {String}, blocked {0, 1}, low {0, 1}, default {0, 1}, high {0,1 }, maximum {0,1})
     *  Slider Permission : Permissions(name {String}, sliderMin {int}, sliderMax {int}, blocked {int}, low {int}, default {int}, high {int}, maximum {int})
     */
    public static final Permissions UNSANDBOXPERMISSIONS = new Permissions("unsandbox", 0, 0, 0, 0, 1);
    @Override
    public String getTitle() {
        return LessRestrictedFigura.PLUGIN_ID;
    }

    @Override
    public Collection<Permissions> getPermissions() {
        return List.of(UNSANDBOXPERMISSIONS);
    }
}
