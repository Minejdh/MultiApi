package com.multiapi.scanner;

import java.io.File;

public class ModScanner {

    public static void scan() {

        File modsFolder = new File("mods");

        File[] files = modsFolder.listFiles();

        if (files == null) {
            return;
        }

        for (File file : files) {

            if (!file.getName().endsWith(".jar")) {
                continue;
            }

            System.out.println("[MultiApi] Found mod: " + file.getName());
        }
    }
}
