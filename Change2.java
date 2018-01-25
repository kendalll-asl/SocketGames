package org.asl.socketserver.games;
import java.io.BufferedReader;

import java.io.IOException;

import java.io.PrintWriter;

import org.asl.socketserver.AbstractGame;

import org.asl.socketserver.BestScore;

import org.asl.socketserver.Dictionary;

import org.asl.socketserver.MenuInfo;

import org.asl.socketserver.Servable;




public class ChangeServerr implements Servable {
    private String menuText = " ------------------------ \n I, your friendly microcomputer, will determine the correct change for items costing up to $100./n 0 - run /n change /n 1 - Exit \n ------------------------ ";
    private double thePrice; 
    private double payment;
    private message;

	public void serve(BufferedReader in, PrintWriter out) throws IOException {
        boolean run = true;
        out.println(menuText);
        int run = in.read(); //readLine() reads a string, read() reads an int
        // run a "while" statement to find amount of change to be given if the customer
           while(run == true){
               if(input == 0){
                   out.println("cost of item?");
                   double price = in.read();
                   while(price > 100){
                        out.println("Price of product can not be over 100");
                        double price = in.read();
                   }
                   double thePrice = getPrice(price);
                    out.println("Amount of payment?");
                  double payment = in.read();
                     while(payment < thePrice){
            out.println("sorry, you have short-changed me (" + (price - payment) + ")");
            payment = in.read();
        }
                   
                   double payment = getPayment(payment);
                 double change = calculateChange(thePrice, payment);
                  message = runChange(change);
                   out.println(message);
                   
               } else {
                //if no change to be given return false 
                   run = false;
               }
           }
    } 
 
    //see how  much is given and then find the amount of change 
    public double calculateChange(double price, double payment){
     return payment - price;
    }
    
    //have user input what they are buying under 100, if over return message that its too big 
    public double getPrice(input){
        return input;
    }
    //have user input how much money they are using to pay for the item
    public double getPayment(input){

        return input;
    }
    //find the amount of change due and return in dollars or coins. 
    public void runChange(double change){
        double change = 0;
        double count = 0;
        String message = "";
        change = printChange(change, 50);
        count = printCount(change, 50);
        message = "you will get " + count + " of $" + change + " bills";
        change = printChange(change, 20);
        count = printCount(change, 20);
        message += " \n you will get " + count + " of $" + change + " bills";
        change = printChange(change, 10);
        count = printCount(change, 10);
        message += " \n you will get " + count + " of $" + change + " bills";
        change = printChange(change, 5);
        count = printCount(change, 5);
        message += " \n you will get " + count + " of $" + change + " bills";
        change = printChange(change, 1);
        count = printCount(change, 1);
        message += " \n you will get " + count + " of $" + change + " bills";
        change = printChange(change, 0.25);
        count = printCount(change, 0.25);
        message += " \n you will get " + count + " of $" + change + " bills";
        change = printChange(change, 0.10);
        count = printCount(change, 0.10);
        message += " \n you will get " + count + " of $" + change + " bills";
        change = printChange(change, 0.01);
        count = printCount(change, 0.01);
        message += " \n you will get " + count + " of $" + change + " bills";
        return message;
        
    }
    //print the amount of change given in bills and in coins 
    public double printChange(double change, double bill){
        int count = 0;
        while(change >= bill){
           count++;
           change = change - bill;
            
        } 
        // need to add change IE quarters 
       
        return (change);
    }
}
   public double printCount(double change, double bill){
        int count = 0;
        while(change >= bill){
           count++;
           change = change - bill;
            
        } 
        // need to add change IE quarters 
       
        return (count);
    }
}          
    