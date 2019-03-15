/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg1; 
import java.util.HashMap;

/**
 *
 * @author Lenovo ideapad
 */
public class Procedure {  
    //logic class
    HashMap client;
    int balance ;
    String amount;
    int newBalance; 
    DepositWindow deposit2; 
    WithdrawWindow withdraw2;
    MainMenu mainmenu;
   
    public Procedure(){
        client = new HashMap();
        client.put("Mirna nasrallah", "5500"); 
        
    } 
    
   
    //validation method 
    public boolean validate (String username , String pinCode){
        boolean result=false;
         String fetchedPassword = (String) client.get(username);
         if (fetchedPassword != null){
           result = fetchedPassword.equals(pinCode);
           } 
         return result;
     
    } 
    //deposit method
    public void deposit (String amount){ 
        
        this.amount = amount;
        newBalance  = balance + Integer.parseInt(amount);
        balance = newBalance; 
        this.balance = balance;
        
       
    } 
    //withdraw method
    public void withdraw (String amount){
        this.amount = amount; 
        newBalance  = balance - Integer.parseInt(amount);
        balance = newBalance; 
        this.newBalance = balance;
       
    }  
    
  //getters and setters to the balance and new balance 
   
     public int getBalance(){
        return balance;
    } 
   
     public int getNewBalance(){
        return newBalance;
    } 
     public void setNewBalance(int newBalance){
         this.newBalance = newBalance;
     }
    
     public void setBalance(int balance){
       this.balance = balance;
        
     }
    
        
    }
   
    
    
    
    

