package com.qualogy.carribean.enums;

import java.util.Arrays;

public enum UIEnums {
    START,
    LOGIN,
    REGISTRATION;

    public boolean existsValue(String value){
        return Arrays.stream(UIEnums.values()).anyMatch(uiEnums -> value.equals(uiEnums.name()));
    }
}
