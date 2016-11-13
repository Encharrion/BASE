package com.teamacronymcoders.base.modules.minetweaker;

import com.teamacronymcoders.base.modulesystem.Module;
import com.teamacronymcoders.base.modulesystem.ModuleBase;
import com.teamacronymcoders.base.modulesystem.dependencies.IDependency;
import com.teamacronymcoders.base.modulesystem.dependencies.ModDependency;
import com.teamacronymcoders.base.reference.Reference;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.util.List;

@Module(Reference.MODID)
public class MinetweakerModule extends ModuleBase {
    @Override
    public String getName() {
        return "MineTweaker3";
    }

    @Override
    public List<IDependency> getDependencies(List<IDependency> dependencyList) {
        dependencyList.add(new ModDependency("minetweaker3"));
        return dependencyList;
    }

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        MineTweakerRegistration.init(this);
    }
}
