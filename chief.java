import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/***
 * Interface for games that read and write across streams.
 * 
 * @author kentcollins
 * @version Fall, 2017
 */
//public interface Servable {

  //void serve(BufferedReader input, PrintWriter output)
  //    throws IOException;

//}



public class chief{
  public static void main (String[] args){
    int a = 1; 
    Scanner in = new Scanner(System.in);

    while(a==1) { // while the person want to play the game
      System.out.println("I am chief number freak, the great indian math god");
      System.out.println("are you ready to take the test you called me out for (1 YES) or (2 NO) or Type '3' to exit");

      int gamePlay = Integer.parseInt(in.nextLine());// this grabs the users input and saves it as a
    if (gamePlay == 3 ){
        break;
      }
      System.out.println(gamePlay);

    if(gamePlay == 2) { // if user starts game but says they aren't ready for the test 
        System.out.println("Shutup pale face with wise tounge");
        System.out.println("type '1' to start game or type '2' to quit or Type '3' to exit");
        gamePlay = Integer.parseInt(in.nextLine());
      }

      while (gamePlay == 1) {// checks to make sure the user wants to play
        System.out.println("take a number and add 3. divide this number by 5 and"); // prompts user to do equation
        System.out.println("multiply by 8. Divide by 5 and add the same. subtract 1.");
        System.out.println("what do you have"); 

        double usersNumber = Double.parseDouble(in.nextLine());// saves users number
        double computerNumber = ((usersNumber + 1 - 5) * 5 / 8 * 5 - 3); // the computers number guess

        System.out.println("I bet your number was " + computerNumber + " was I right (1=Yes, 2=No)");// prompts user to s                                  // if number is correct
        // or not
        double correct = Double.parseDouble(in.nextLine());

        if (correct == 1) {
          System.out.println("bye!");// if user says "chief" is correct
        } else if (correct == 2) {
          System.out.println(" What was your original number");
          double K = Double.parseDouble(in.nextLine());
          double F = K + 3;
          double G = F / 5;
          double H = G * 8;
          double I = H / 5 + 5;
          double J = I - 1;
          System.out.println("So you think you're so smart, eh?");
          System.out.println("Now watch.");
          System.out.println(K + "plues 3 equals " + F + ". This is Divided by 5 equals " + G);
          System.out.println("this times 8 equals " + H + ". If we divide by 5 and add 5,");
          System.out.println("we get " + I + ", which, minus 1 equals " + J);
          System.out.println("Now do you believe me Y=1 N=2");
          gamePlay = Integer.parseInt(in.nextLine());;

          if (gamePlay == 1) {
            System.out.println("bye!");
          } else if (gamePlay == 2) {
            lighting();

          }else
            break;

        }


      }

    }
  }

  private static void lighting() {// if user doesn't believe chief after showing the work display lighting bolt 
    // TODO Auto-generated method stub
    System.out.println(" you have made me mad!!!");
    System.out.println("there must be a great lighting bolt!");
    System.out.println("                    ");
    System.out.println("                             X X");
    System.out.println("                            X X");
    System.out.println("                           X X");
    System.out.println("                          X X");
    System.out.println("                         X X");
    System.out.println("                        X X");
    System.out.println("                       X X");
    System.out.println("                      X X");
    System.out.println("                     X X");
    System.out.println("                    X XXX");
    System.out.println("                   X   X");
    System.out.println("                  XXX X");
    System.out.println("                   X X");
    System.out.println("                  X X");
    System.out.println("                 X X");
    System.out.println("                X X");
    System.out.println("               X X");
    System.out.println("              X X");
    System.out.println("             X X");
    System.out.println("            X X");
    System.out.println("           X X");
    System.out.println("          XX");
    System.out.println("          X");
    System.out.println("         *");
    System.out.println(" ");
    System.out.println("**************************");
    System.out.println(" I HOPE YOU BELIEVE ME NOW, FOR YOUR SAKE!!");

  }
}