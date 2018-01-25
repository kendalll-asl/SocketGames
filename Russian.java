import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Russian{
  public static void main (String[] args){
    Scanner input = new Scanner(System.in); //creates the scanner to read in user tet
    int N =0; //this is the number of times a user has gone without shooting themselves
    System.out.println("This is a game of Russian Roulette");
    System.out.println("Here is a Revolver");
    System.out.println("type '1' to pull trigger again or type '2' to quit or type '3' to exit ");
    int I = Integer.parseInt(input.next());//this grabs the users input and saves it as I
    int i = 1;
    while(i ==1){//makes the game run continuously.
      while(I==1){//checks to make sure the user wants to play
        N=0;//must reset because if we have exited the next while loop that means someone had died.
        System.out.println("your trigger is being pulled");//tells them the game is happening
        while(N<10){//checks to make sure the user hasnt gone 10 rounds of winning
          if(Math.random()>.833333){
            System.out.println("Bang! you are dead. Condolences will be sent to your relatives");
            System.out.println("...Next Victim...");
            N=11; //this is so we exit this while loop and reset our number of N's for the next player
            System.out.println("type '1' to spin chamber and pull trigger or type '2' to quit");
            I=Integer.parseInt(input.next());//sets it to check if they want to play again
          }else{
            System.out.println("...click...");
            System.out.println("You are still alive!");
            N++;//counts how many times they were safe
            System.out.println("number of sucessful pulls:" + N);
            System.out.println("type '1' to pull trigger again or type '2' to quit or type '3' to exit ");//gives them the option to play again
            I = Integer.parseInt(input.next());//sets to check if they want to play again
            if(I==2){
              N=11;
            }
          } if(I==3){
            break;
          } 

        }
        if(N==10){
          System.out.println("YOU WIN!!!");
          System.out.println("Let someone else play");
          System.out.println("type '1' to pull trigger again or type '2' to quit or type '3' to exit ");//gives the next player the chance to choose to continue or not.
          I=Integer.parseInt(input.next());//reads in the response
        }
        while(I==2){
          System.out.println("CHICKEN!!!! give me my next victim");
          System.out.println("type '1' to pull trigger again or type '2' to quit or type '3' to exit ");
          I=Integer.parseInt(input.next());
        }
      }
      while(I==2){
        System.out.println("CHICKEN!!!! give me my next victim");
        System.out.println("type '1' to pull trigger again or type '2' to quit or type '3' to exit ");
        I=Integer.parseInt(input.next());
      }
    }
  }
}