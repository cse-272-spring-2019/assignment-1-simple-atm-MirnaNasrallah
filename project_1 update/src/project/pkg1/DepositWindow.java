package project.pkg1;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo ideapad
 */
public class DepositWindow {
    Scene scene;
    Stage stage; 
    MainMenu mainmenu; 
    Procedure deposit1; 
    int newBalance; 
   
    
  
  public DepositWindow (Stage stage ){
       this.stage = stage;
   }
    public void design3(){ 
        //deposit1 = new Procedure();
        Label input = new Label ("enter the amount you'd like to deposit ");
        TextField amount = new TextField (); 
        Button next = new Button ("Next");
        Button back = new Button ("Back"); 
         Button confirm = new Button ("Confirm"); 
         Label result = new Label ("Result");
         
        GridPane grid= new GridPane();
        grid.add(input,0,0); 
        grid.add(amount,0,1);
        grid.add(next,0,2);
        grid.add(back,0,3); 
        grid.add(confirm,1,2);
        grid.add(result,3,5);
        scene = new Scene (grid ,600,300);
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
             if (Integer.parseInt(habba)>0)
             {
             deposit1.deposit(habba);
             newBalance = deposit1.getBalance();
             result.setText("your balance due to this transaction " +deposit1.getBalance()); 
             } else 
             {
                 result.setText("enter a positive number "); 
             }
          //this way stores the last deposit you have done with its old balance
          //once you put a new amount to be deposit it automatically saves the new one
          //which means you don't need the history button you can see every transaction you made before the new one
          
               
            } 
           
                
         }); 
       next.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event){ 
            	mainmenu.setProcedure(deposit1);
                stage.setScene(mainmenu.getScene()); 
                
            } 
           
                
         }); 
     
        
    } 
    public Scene getScene(){
       return scene;
   } 
    public void setMainMenu(MainMenu mainmenu){
        this.mainmenu = mainmenu;
    }
      
    public void setProcedure(Procedure object)
    {
 	this.deposit1 = object;  
    }
}
