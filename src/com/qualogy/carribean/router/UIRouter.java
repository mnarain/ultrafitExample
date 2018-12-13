package com.qualogy.carribean.router;

import com.qualogy.carribean.enums.UIEnums;
import com.qualogy.carribean.ui.LoginUI;
import com.qualogy.carribean.ui.RegistrationUI;
import com.qualogy.carribean.ui.UI;

import java.util.HashMap;
import java.util.Map;

public class UIRouter {
    private Map<UIEnums, UI> uiMap;

    public UI loadUI(UIEnums ui) {
        if (uiMap == null) {
            uiMap = new HashMap<>();
            uiMap.put(UIEnums.LOGIN, new LoginUI());
            uiMap.put(UIEnums.REGISTRATION, new RegistrationUI());
        }
        return uiMap.get(ui);
    }

}
