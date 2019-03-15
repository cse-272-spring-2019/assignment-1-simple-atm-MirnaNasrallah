
package project.pkg1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

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
    
       //withdraw1 = new Procedure(); 
       Label input = new Label ("Enter the amount you'd like to withdraw");
       Label result = new Label ("result"); 
       Label error = new Label("please be sure that the amount doesn't exceed your balance");
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
        scene = new Scene (grid , 600, 300);
         back.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event){ 
            	mainmenu.setProcedure(withdraw1);
                stage.setScene(mainmenu.getScene()); 
             
                
            } 
           
                
         }); 
          confirm.setOnAction(new EventHandler<ActionEvent>(){
            
            @Override
            public void handle(ActionEvent event){ 
             String habba =  amount.getText(); 
            if (Integer.parseInt(habba) > withdraw1.getBalance() || Integer.parseInt(habba)<0 )
             {
                 error.setText("Try again");
                 
             } else{ 
             error.setText("thank you");
             withdraw1.withdraw(habba);
             newBalance = withdraw1.getBalance();
             result.setText("your balance due to this transaction = " +withdraw1.getBalance()); 
             //same as deposit
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

      public void setProcedure(Procedure object)
      {
   	this.withdraw1 = object;
      }
    
    
}
