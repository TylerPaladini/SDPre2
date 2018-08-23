import java.util.Scanner;


public class Objective7Lab3 {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int selection;

      while ( true ) {
        printMenu();
        selection = scanner.nextInt();

        if (selection ==1 ) {
          System.out.println("Hello Human");
        }
        else if (selection ==2 ) {
          System.out.println("Bananas, apples, pears");
        }
        else if ( selection == 3 ){
          System.out.println("Goodbye");
          break;
        }
        else {
          System.out.println(" You must choose 1, 2, or 3");
        }
      }
  }
  public static void printMenu() {
    System.out.println("___Menu___");
    System.out.println("1. Say Hello");
    System.out.println("2. List my favorite foods");
    System.out.println("3. Exit");
    System.out.println("Make a selection");
    
  }
}
