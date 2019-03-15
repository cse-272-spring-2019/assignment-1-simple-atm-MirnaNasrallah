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
   Procedure mainmenu; 
  


   public MainMenu(Stage stage) {
       this.stage = stage; 
    }
   

    public void designScene2() {
        deposit = new DepositWindow (stage);
        withdraw = new WithdrawWindow(stage);
   //linking the classes to the mainmenu
        
       Label label = new Label ("Welcome!");
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
            	deposit.setProcedure(mainmenu); 
                //preparing deposit scene with the updated balance
                stage.setScene(deposit.getScene()); 
                
            } 
      });
           Withdraw.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event){ 
            	withdraw.setProcedure(mainmenu); 
                //same as deposit
            	stage.setScene(withdraw.getScene()); 
                
            } 
           
                
         });  
            balanceInquiry.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event){ 
                inquiry.setText("your current balance = " +mainmenu.getBalance());
                //shows updated balances anytime
                
            } 
           
                
         }); 
           
        scene = new Scene (grid , 600 , 300); 
    }   
     public Scene getScene(){
       return scene;
   } 
    //all setters to smoothly link the mainmenu to anything inside other class 
   public void setLogin (Project1 login){
       this.login = login;
   } 
   public void setDepositWindow(DepositWindow deposit){
       this.deposit = deposit;
   } 
   public void setWithdrawWindow(WithdrawWindow withdraw){
       this.withdraw = withdraw;
   }
   
   public void setProcedure(Procedure object)
   {
	this.mainmenu = object;  
   }
}

    
   
    
