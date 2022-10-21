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


    
    System.out.print("Your password is: " + generatePassword(10)); 
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



  public static String generatePassword(int length) {
    String password = "";

    for (int i = 0; i < length; i++) {
    // generate a random number
    // 65 - 90 capital letter
    // 97 - 122 lower case
    // 33 - 47 special symbols
    
    int randcl = (int)(Math.random()*(122-33+1) + 33);
    // convert the int ---> character c =(char)i;
    char a = (char)randcl;
    password += a;
    // add the char to the password String
    } // end for loop 
    return password;
  } // end generatePassword method
}