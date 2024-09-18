import java.util.Scanner;

public class Assignment1 {
  public static void main(String[] args) {
    System.out.println("   CCCCCCC     HHHH    HHHH") ;
    System.out.println(" CCCC          HHHH    HHHH") ;
    System.out.println(" CC            HHHH    HHHH") ;
    System.out.println(" CC            HHHHHHHHHHHH") ;
    System.out.println(" CC            HHHHHHHHHHHH") ;
    System.out.println(" CC            HHHH    HHHH") ;
    System.out.println(" CCCC          HHHH    HHHH") ;
    System.out.println("   CCCCCCC     HHHH    HHHH") ;

    Scanner scan = new Scanner(System.in);

    // Formula: F = (9/5) * C + 32

    // int BASE = fahrenheit;
    // double celsius;

    System.out.print("Enter the number in Fahrenheit: ");
    double fahrenheit = scan.nextDouble();

    // (ORIGINAL) final double CONVERSION_FACTOR = 9.0 / 5.0;

    double celsius = (fahrenheit - 32) * 5 / 9;

    System.out.println("Celsius Temperature: " + celsius);
    System.out.println("Fahrenheit Equivalent: " + fahrenheit);
  }
}
