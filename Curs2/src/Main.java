import java.lang.reflect.Array;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] listNumbers = {0,1,5,7,9};
        for (int i =0; i < listNumbers.length; i++){
            System.out.println(listNumbers[i]);
        }

        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(0);
        listOfNumbers.add(1);
        listOfNumbers.add(5);
        listOfNumbers.add(7);
        listOfNumbers.add(9);


        System.out.println(listOfNumbers);
    }
}