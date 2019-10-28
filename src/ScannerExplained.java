import java.util.Scanner;

public class ScannerExplained {
    public ScannerExplained(){

        Scanner scanner = new Scanner(System.in); // creates a scanner object for system input

        String myString = scanner.next(); // get's a token (one word)

        scanner.nextLine(); // moves the scanner reader past the token
        String mySentance = scanner.nextLine(); //reads the whole line
        int myInt = scanner.nextInt();  //reads an int (has for double, long ect.

        System.out.println("myString is: " + myString);
        System.out.println("myString is: " + mySentance);
        System.out.println("myInt is " + myInt);
    }
}
