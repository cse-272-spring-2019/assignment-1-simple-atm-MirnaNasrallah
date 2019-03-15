package project.pkg1;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


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
        deposit1 = new Procedure();
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
        scene = new Scene (grid ,600,400);
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
             deposit1.deposit(habba);
             newBalance = deposit1.getBalance();
             result.setText("your new balance = " +deposit1.getBalance()); 
             deposit1.setBalance(newBalance);
             
            
            } 
           
                
         }); 
       next.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event){ 
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
      
}
