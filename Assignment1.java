import java.util.Scanner;
import java.util.Random;

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
    // START OF NEXT PORTION

    // Scanner scanner = new Scanner(System.in);
    // Random random = new Random();

    // System.out.print("Enter a 5-character string: ");
    // String input = scan.nextLine();

    // String middlePart = input.substring(1, 4);
    // String reversedMiddlePart = new
    // StringBuilder(middlePart).reverse().toString();

    // int randomNumber = 32 + random.nextInt(16384 - 32 + 1);

    // System.out.println("Reversed middle part of the string: " + reversedMiddlePart);
    // System.out.println("Random number between 32 and 16,384: " + randomNumber);

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    System.out.print("Enter a 5-character string: ");
    String input = scanner.nextLine();

    String middlePart = input.substring(1, 4);
    String reversedMiddlePart = new StringBuilder(middlePart).reverse().toString();

    int randomNumber = 32 + random.nextInt(16384 - 32 + 1);

    System.out.println("Reversed middle part of the string: " + reversedMiddlePart);
    System.out.println("Random number between 32 and 16,384: " + randomNumber);

    // end result

    System.out.println("Combined output: " + celsius + reversedMiddlePart + randomNumber);

  }
}
