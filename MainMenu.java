/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Lenovo ideapad
 */
public class MainMenu {
   Scene scene ;
   Stage stage;
   Project1 login; 
   DepositWindow deposit;
   WithdrawWindow withdraw; 
   Procedure balance ;
   
  


   public MainMenu(Stage stage) {
       this.stage = stage; 
    }
   

    public void designScene2() {
        deposit = new DepositWindow (stage);
        withdraw = new WithdrawWindow(stage);
        balance = new Procedure();
        
      Label label = new Label ("Welcome baby!");
      Label inquiry = new Label("your balance");
        Button Withdraw = new Button ("Withdraw");
        Button Deposit = new Button ("Deposit");
        Button balanceInquiry = new Button ("BalanceInquiry");
        Button LogOut = new Button ("Logout!"); 
        GridPane grid = new GridPane();
        grid.add(label, 22, 14); 
        grid.add(Withdraw, 20, 20); 
        grid.add(Deposit, 21, 20); 
        grid.add(balanceInquiry, 22, 20);  
        grid.add(LogOut, 21, 22);
        grid.add(inquiry, 24, 22);
       
        LogOut.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event){ 
                stage.setScene(login.getScene()); 
                
            } 
           
                
         }); 
          Deposit.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event){ 
                stage.setScene(deposit.getScene()); 
                
            } 
      });
           Withdraw.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event){ 
                stage.setScene(withdraw.getScene()); 
                
            } 
           
                
         });  
            balanceInquiry.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event){ 
                inquiry.setText("your new balance = " +balance.getBalance());
                
                
            } 
           
                
         }); 
           
        scene = new Scene (grid , 400 , 400); 
    }   
     public Scene getScene(){
       return scene;
   } 
     
   public void setLogin (Project1 login){
       this.login = login;
   } 
   public void setDepositWindow(DepositWindow deposit){
       this.deposit = deposit;
   } 
   public void setWithdrawWindow(WithdrawWindow withdraw){
       this.withdraw = withdraw;
   }
}

    
   
    
