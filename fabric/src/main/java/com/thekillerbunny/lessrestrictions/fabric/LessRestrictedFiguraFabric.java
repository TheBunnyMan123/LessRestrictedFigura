package com.thekillerbunny.lessrestrictions.fabric;

import net.fabricmc.api.ModInitializer;
import com.thekillerbunny.lessrestrictions.LessRestrictedFigura;

/**
 * A mod class is not technically needed for Fabric to load the Plugin, but it's still nice to have.
 */
public class LessRestrictedFiguraFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        LessRestrictedFigura.init();
    }
}
