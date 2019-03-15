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
public class Project1  {

 
  Scene scene;
  Procedure validation;
  MainMenu mainmenu;
  Stage stage; 
  //int balance;

   public  Project1(Stage primaryStage) {
       this.stage = primaryStage;   }
  
  
   
    public void designScene() { 
        validation = new Procedure();
      
        Label usernameLabel = new Label ("full name ");
        Label passwordLabel = new Label ("pin code ");
        TextField usernameField = new TextField();
        TextField passwordField = new TextField();
        Button btn = new Button();
        btn.setText("Submit"); 
        Label confirmLabel = new Label();
        GridPane grid = new GridPane();
        grid.add(usernameLabel,0,0);
        grid.add(passwordLabel,0,1);
        grid.add(usernameField,1,0);
        grid.add(passwordField,1,1);
        grid.add(btn,1,2); 
        grid.add(confirmLabel,3,2);
     btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                String username = usernameField.getText();
                String pinCode = passwordField.getText(); 
                
              boolean valid =  validation.validate(username , pinCode);
             
              if (valid){
                  confirmLabel.setText("welcome");
                 stage.setScene(mainmenu.getScene());
          
                  
              } else 
              {
                  confirmLabel.setText("wrong pin"); 
              }
               
            }
        }); 
    scene = new Scene (grid , 400 , 400);
     
    }


   public  Scene getScene() {
      return scene;
        
    }

  public  void setMainMenu(MainMenu mainmenu) {
        this.mainmenu = mainmenu; 
    }

   
}
