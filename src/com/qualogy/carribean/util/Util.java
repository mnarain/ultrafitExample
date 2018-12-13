package com.qualogy.carribean.util;

import com.qualogy.carribean.enums.UIEnums;

import java.io.IOException;
import java.util.Arrays;

public class Util {

    public static void clearScreen() {
        //Clears Screen in java
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}
    }

    public static boolean existsValue(String value){
        return Arrays.stream(UIEnums.values()).anyMatch(uiEnums -> value.equals(uiEnums.name()));
    }
}
