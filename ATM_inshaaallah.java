/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Lenovo ideapad
 */
public class ATM_inshaaallah extends Application{ 
   

     public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
         primaryStage.setTitle("ATM"); 
        
         int balance = 0;
         
         Project1 login = new Project1 (primaryStage);
         MainMenu mainmenu = new MainMenu (primaryStage);
         DepositWindow deposit = new DepositWindow (primaryStage); 
         WithdrawWindow withdraw = new WithdrawWindow (primaryStage);
         
         login.designScene(); 
         mainmenu.designScene2();
         deposit.design3();
         withdraw.design4();
         
          login.setMainMenu(mainmenu);
          mainmenu.setLogin (login);
          mainmenu.setDepositWindow(deposit); 
          deposit.setMainMenu(mainmenu); 
          mainmenu.setWithdrawWindow(withdraw); 
          withdraw.setMainMenu(mainmenu);
          
        primaryStage.setScene(login.getScene());
        primaryStage.show(); 
        
        
    } 
    
     
    
}
