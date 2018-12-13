package com.qualogy.carribean.app;

import com.qualogy.carribean.router.UIRouter;
import com.qualogy.carribean.ui.StartUI;
import com.qualogy.carribean.ui.UI;

import java.util.Stack;

public class Application {

    private Stack<UI> uiStack = new Stack();

    public static void main(String[] args) {
        Application app = new Application();
        app.uiStack.push(new StartUI(new UIRouter()));
        app.uiStack.peek().displayUI();
    }

}
