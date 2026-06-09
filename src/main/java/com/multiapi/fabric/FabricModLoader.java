package com.multiapi.fabric;

public class FabricModLoader {

    public void load(FabricModMetadata metadata) {

        System.out.println(
            "[MultiApi] Loading Fabric mod: "
            + metadata.name()
        );
    }
}
