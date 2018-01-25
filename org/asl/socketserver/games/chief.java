package org.asl.socketserver.games;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import org.asl.socketserver.AbstractGame;
import org.asl.socketserver.BestScore;
import org.asl.socketserver.MenuInfo;
import org.asl.socketserver.Servable;

/***
 * Interface for games that read and write across streams.
 * 
 * @author kentcollins
 * @version Fall, 2017
 */


public class chief implements Servable {
	
	public chief(){

	}
	
	public void serve(BufferedReader in, PrintWriter out) throws IOException {

		int a = 1; 

		while(a==1) { // while the person want to play the game
			out.println("I am chief number freak, the great indian math god");
			out.println("are you ready to take the test you called me out for (1 YES) or (2 NO)");

			int gamePlay = Integer.parseInt(in.readLine());// this grabs the users input and saves it as a

			out.println(gamePlay);

			if(gamePlay == 2) { // if user starts game but says they aren't ready for the test 
				out.println(" ");
				out.println("Shutup pale face with wise tounge");
				out.println("type '1' to start game or type '2' to quit");
				gamePlay = Integer.parseInt(in.readLine());
			}else if ( gamePlay == 3 ) {
				break;
			}

			while (gamePlay == 1) {// checks to make sure the user wants to play
					
				out.println("  ");
				out.println("take a number and add 3. divide this number by 5 and"); // prompts user to do equation
				out.println("multiply by 8. Divide by 5 and add the same. subtract 1.");
				out.println("what do you have"); 

				double usersNumber = Double.parseDouble(in.readLine());// saves users number
				double computerNumber = ((usersNumber + 1 - 5) * 5 / 8 * 5 - 3); // the computers number guess

				out.println("I bet your number was " + computerNumber + " was I right (1=Yes, 2=No)");// prompts user to s																	// if number is correct
				// or not
				double correct = Double.parseDouble(in.readLine());

				if (correct == 1) {
					out.println("bye!");// if user says "chief" is correct
				} else if (correct == 2) {
					out.println(" What was your original number");
					double K = Double.parseDouble(in.readLine());
					double F = K + 3;
					double G = F / 5;
					double H = G * 8;
					double I = H / 5 + 5;
					double J = I - 1;
					out.println("So you think you're so smart, eh?");
					out.println("Now watch.");
					out.println(K + "plues 3 equals " + F + ". This is Divided by 5 equals " + G);
					out.println("this times 8 equals " + H + ". If we divide by 5 and add 5,");
					out.println("we get " + I + ", which, minus 1 equals " + J);
					out.println("Now do you believe me Y=1 N=2");
					gamePlay = Integer.parseInt(in.readLine());;

					if (gamePlay == 1) {
						out.println("bye!");
					} else if (gamePlay == 2) {
						out.println(lighting());
					}
				}
			}
		}
		
	}
	private String lighting() {// if user doesn't believe chief after showing the work display lighting bolt 
		// TODO Auto-generated method stub
		String message = "";
		message += " you have made me mad!!!\n";
		message += "there must be a great lighting bolt!\n";
		message += "                    \n";
		message += "                             X X\n";
		message += "                            X X\n";
		message += "                           X X\n";
		message += "                          X X\n";
		message += "                         X X\n";
		message += "                        X X\n";
		message += "                       X X\n";
		message += "                      X X\n";
		message += "                     X X\n";
		message += "                    X XXX\n";
		message += "                   X   X\n";
		message += "                  XXX X\n";
		message += "                   X X\n";
		message += "                  X X\n";
		message += "                 X X\n";
		message += "                X X\n";
		message += "               X X\n";
		message += "              X X\n";
		message += "             X X\n";
		message += "            X X\n";
		message += "           X X\n";
		message += "          XX\n";
		message += "          X\n";
		message += "         *\n";
		message += " \n";
		message += "**************************\n";
		message += " I HOPE YOU BELIEVE ME NOW, FOR YOUR SAKE!!\n";
		
		return message;

	}
}
