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
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Lenovo ideapad
 */
public class WithdrawWindow { 
    Stage stage;
    Scene scene;
    MainMenu mainmenu;
    int balance; 
    int newBalance;
    Procedure withdraw1; 
    

   public WithdrawWindow(Stage stage) {
         this.stage = stage;
    }
    
   
    public void design4(){ 
    
        withdraw1 = new Procedure(); 
       Label input = new Label ("Enter the amount you'd like to withdraw");
       Label result = new Label ("result"); 
       Label error = new Label("ew3a tkoon 3ayez floos aktr mn elly m3ak ha!");
       TextField amount =  new TextField();
       Button next = new Button ("Next");
       Button back = new Button ("back");
       Button confirm = new Button ("confirm");
       GridPane grid= new GridPane();
        grid.add(input,0,0); 
        grid.add(amount,0,1);
        grid.add(next,0,2);
        grid.add(back,0,3); 
        grid.add(confirm,1,4); 
        grid.add(error,1,6); 
        grid.add(result, 3, 7);
        scene = new Scene (grid , 600, 400);
         back.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event){ 
                stage.setScene(mainmenu.getScene()); 
             
                
            } 
           
                
         }); 
          confirm.setOnAction(new EventHandler<ActionEvent>(){
            
            @Override
            public void handle(ActionEvent event){ 
             String habba =  amount.getText(); 
            if (Integer.parseInt(habba) > withdraw1.getNewBalance())
             {
                 error.setText("oltelak balash !");
             } else{ 
         
             withdraw1.withdraw(habba);
             newBalance = withdraw1.getBalance();
             result.setText("your new balance = " +withdraw1.getBalance()); 
            }
          
                
            } 
           }); 
        next.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event){ 
                stage.setScene(mainmenu.getScene()); 
             
                
            } 
           
                
         }); 
          
    } 
       
           
                
        
     public void setMainMenu(MainMenu mainmenu){
        this.mainmenu = mainmenu;
    } 
      public Scene getScene(){
       return scene;
   } 

   
    
    
}
