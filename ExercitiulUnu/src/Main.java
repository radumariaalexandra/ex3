import java.util.ArrayList;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<>();
        int expectedSum = 0;
        int actualSum = 0;

        for (int i = 1; i <=100; i++){
            numbersList.add(i);
            expectedSum+= i;
        }


        Random random = new Random();
        int x = random.nextInt(100);
        numbersList.remove(x);

        for (int i = 0; i <numbersList.size(); i++){
            actualSum+= numbersList.get(i);
        }

        System.out.println("Expected sum: " + expectedSum);
        System.out.println("Actual sum: " + actualSum);
        System.out.println("Missing number: " + (expectedSum - actualSum));
    }
}