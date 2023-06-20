import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
     Bottle aquaCarpatica = new Bottle("Water", 1.00, 1.00, "Plastic", false);

     Bottle olimpus  = new Bottle("Pomgrade Juice" , 1.00, 1.00, "Plastic", false);


     System.out.println(aquaCarpatica);
     aquaCarpatica.drinkFromBottle(0.250);
     System.out.println(aquaCarpatica);
     System.out.println(aquaCarpatica);
     aquaCarpatica.emptyBottle();
     System.out.println(aquaCarpatica);
     aquaCarpatica.fillBottle();
     System.out.println(aquaCarpatica);


    }
}