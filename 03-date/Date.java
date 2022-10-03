import java.util.Scanner;

class Date {

  public static void main(String[] args) {


  Scanner s = new Scanner(System.in);

  System.out.print("Enter the Year: ");
  String year = s.nextLine();

  System.out.print("Enter the Month: ");
  String month = s.nextLine();

  System.out.print("Enter the day of the week: ");
  String week = s.nextLine();

  System.out.print("Enter the date of the month: ");
  String datemonth = s.nextLine();

  s.close();

  System.out.println("American format: " + week + ", " + month + " " + datemonth + ", " + year);
  System.out.print("European format: " + week + " " + month + " " + datemonth + " " + year);

  } //end of main method
} //end of class
