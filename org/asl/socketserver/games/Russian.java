package org.asl.socketserver.games;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import org.asl.socketserver.AbstractGame;
import org.asl.socketserver.MenuInfo;
import org.asl.socketserver.Servable;

@MenuInfo(authors = {
"Kendall Lubkeman" }, version = "winter, 2018", title = "", description = "Russian roulette.")
public class Russian implements Servable {
	public Russian(){

	}

	public void serve(BufferedReader in, PrintWriter out) throws IOException {


		int N =0; //this is the number of times a user has gone without shooting themselves
		out.println("This is a game of Russian Roulette");
		out.println("Here is a Revolver");
		out.println("type '1' to pull trigger again or type '2' to quit or type '3' to exit");
		int I = Integer.parseInt(in.readLine());//this grabs the users input and saves it as I
		int i = 1;
		while(i ==1){//makes the game run continuously.
			while(I==1){//checks to make sure the user wants to play
				N=0;//must reset because if we have exited the next while loop that means someone had died.
				System.out.println("your trigger is being pulled");//tells them the game is happening
				while(N<10){//checks to make sure the user hasn't gone 10 rounds of winning
					if(Math.random()>.833333){
						System.out.println("Bang! you are dead. Condolences will be sent to your relatives");
						System.out.println("...Next Victim...");
						N=11; //this is so we exit this while loop and reset our number of N's for the next player
						System.out.println("type '1' to pull trigger again or type '2' to quit or type '3' to exit");
						I=Integer.parseInt(in.readLine());//sets it to check if they want to play again
					}else{
						System.out.println("...click...");
						System.out.println("You are still alive!");
						N++;//counts how many times they were safe
						System.out.println("number of sucessful pulls: " + N);
						System.out.println("type '1' to pull trigger again or type '2' to quit or type '3' to exit");//gives them the option to play again
						I = Integer.parseInt(in.readLine());//sets to check if they want to play again
						if(I==2){
							N=11;
						}

					}
				}
				if(N==10){
					out.println("YOU WIN!!!");
					out.println("Let someone else play");
					out.println("type '1' to pull trigger again or type '2' to quit or type '3' to exit");//gives the next player the chance to choose to continue or not.
					I=Integer.parseInt(in.readLine());//reads in the response
				}
				while(I==2){
					out.println("CHICKEN!!!! give me my next victim");
					out.println("type '1' to pull trigger again or type '2' to quit or type '3' to exit");
					I=Integer.parseInt(in.readLine());
				}
			}
			while(I==2){
				out.println("CHICKEN!!!! give me my next victim");
				out.println("type '1' to pull trigger again or type '2' to quit or type '3' to exit");
				I=Integer.parseInt(in.readLine());
			}
		}
	}
}


