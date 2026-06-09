package com.multiapi;

import com.multiapi.scanner.ModScanner;
import net.neoforged.fml.common.Mod;

@Mod("multiapi")
public class MultiApi {

    public MultiApi() {
        System.out.println("[MultiApi] Starting...");
        ModScanner.scan();
    }
}
