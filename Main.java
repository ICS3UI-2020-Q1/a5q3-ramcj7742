import java.util.Scanner;
/**
 * Calculates factoral of user number
 * @author Jaden Ramcharan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates scanner for user input
    Scanner input = new Scanner(System.in);

    //gets number from user
    System.out.println("Please enter an integer to calculate the factorial of");
    int userNum = input.nextInt();

    //declare accumulator and factorial variable
    int factorial = 0;
    int acc = userNum;

    //Start calculating factorial
    for(int i = userNum; i > 1; i--){
     factorial = acc * (i - 1);
     acc = factorial;
    
    }
    //tells user factorial
    if(userNum == 0){
      System.out.println(userNum + "! = 1");
    }else
    System.out.println(userNum + "! = " + acc);
  }
}
