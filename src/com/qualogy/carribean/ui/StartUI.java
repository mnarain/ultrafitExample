package com.qualogy.carribean.ui;

import com.qualogy.carribean.enums.UIEnums;
import com.qualogy.carribean.router.UIRouter;

import java.util.Scanner;

public class StartUI implements UI{
    private UIRouter uiRouter;

    public StartUI(UIRouter uiRouter) {
        this.uiRouter = uiRouter;
    }

    @Override
    public void displayUI() {
        System.out.println("*** Welcome bij de ultrafit CRM ***");
        System.out.println("Kies een menu optie:");
        System.out.println("1. Login");
        System.out.println("2. Register een nieuwe gebruiker");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        int selectedOption = scanner.nextInt();
        processSelectedOption(selectedOption);
    }

     private void processSelectedOption(int selectedOption){
        boolean repeat = true;
         while (repeat) {
             switch(selectedOption){
                 case 1:
                     repeat = false;
                     uiRouter.loadUI(UIEnums.LOGIN).displayUI();
                     break;
                 case 2:
                     repeat = false;
                     uiRouter.loadUI(UIEnums.REGISTRATION).displayUI();
                     break;
                 default:
                     System.out.println("Kies a.u.b. optie 1 of 2");
             }
         }
     }

}
