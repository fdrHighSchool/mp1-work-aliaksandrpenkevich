import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);
    
    // get String input from user
    System.out.println("Are you teacher or student?"); 
    String role = s.nextLine();
    System.out.print("Enter your first name: ");
    String firstName = s.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = s.nextLine();
    System.out.print("Your favorite number: ");
    int favNum = s.nextInt();

    if(role.equals("student")){
    System.out.println((firstName) + 
    initialize(lastName) + (favNum) + "@nycstudents.net");
    }
    else {
    System.out.println((firstName) + initialize(lastName) + (favNum) + "@schools.nyc.gov");
    }

    s.close();
  } // end main method

  /*
   * Name: initialize
   * Purpose: send back the first character (inital) of a name
   * Input: a name (String)
   * Return: a single character (String)
   */
  public static String initialize(String n) {
    return n.substring(0, 1);
  } // end initialize method

} // end class
