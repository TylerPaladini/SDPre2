public class Objective6Lab3 {
  public static void main(String[] args) {
    int counter = 1;

    while ( counter >= 1 && counter <= 20 ) {
      if ( counter % 2 == 0) {
        System.out.println( counter + " is even " );
      counter = counter + 1;
      }
      else {
        System.out.println( counter + " is odd" );
        counter = counter + 1;
      }
    }
  }
}
