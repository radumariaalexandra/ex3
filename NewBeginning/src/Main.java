import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your username: ");
        String username = scanner.nextLine();

        Scanner secondScanner = new Scanner(System.in);
        System.out.print("Hello, " + username +" what is your age?");
        int age = secondScanner.nextInt();

        System.out.println("Your name is " + username + " and you are " + age + " years old.");
        }
    }