import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void printDataFromCnp(String cnp){
        System.out.println("Gender: " + getGenderFromCnp(cnp));
        System.out.println("Birth date: " + getBirthDateFromCnp(cnp));
        System.out.println("Age: " + calculateAge(parseDateToInt(getCurrentDate()),
                parseDateToInt(getBirthDateFromCnp(cnp))));
        System.out.println("County: " + getCountyFromCnp(cnp));
        System.out.println();
    }

    public static String getCountyFromCnp(String cnp) {
        int county = Integer.parseInt(cnp.substring(7,9));
        String stringCounty = "";
        switch (county) {
            case 1 -> stringCounty = "Alba";
            case 2 -> stringCounty = "Arad";
            case 3 -> stringCounty = "Arges";
            case 4 -> stringCounty = "Bacau";
            case 5 -> stringCounty = "Bihor";
            case 6 -> stringCounty = "Bistrita";
            case 7 -> stringCounty = "Botosani";
            case 8 -> stringCounty = "Brasov";
            case 9 -> stringCounty = "Braila";
            case 10 -> stringCounty = "Buzau";
        }
        return stringCounty;

    }
    public static int calculateAge(int[] currentDate, int[] birthDate) {
        int age = currentDate[0] - birthDate[0];
        if (birthDate[1] > currentDate[1]){
            --age;
        } else if (birthDate[1] == currentDate[1]) {
            if (birthDate[2] >= currentDate[2]) {
                --age;
            }
        }
        return age;
    }
    public static int[] parseDateToInt(String date) {
        int year = Integer.parseInt(date.substring(0,4));
        int month = Integer.parseInt(date.substring(5,7));
        int day = Integer.parseInt(date.substring(8,10));
        return new int[] {year, month, day};
    }

    public static String getBirthDateFromCnp(String cnp) {
        return getPrefixFromCnp(cnp) + cnp.substring(1,3) + "-"
                + cnp.substring(3,5) + "-" + cnp.substring(5,7);
    }
    public static String getCurrentDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();
        return  dtf.format(now);
    }
    public static String getPrefixFromCnp(String cnp){
        String prefix = "";
        switch (cnp.charAt(0)) {
            case '1', '2' -> prefix = "19";
            case '3', '4' -> prefix = "18";
            case '5', '6' -> prefix = "20";
        }
        return prefix;
    }

    public static char getGenderFromCnp(String cnp){
        // In Romania, the first character of the social security number
        // represents the biological sex of a person.
        // Below, we take from the social security number the first character
        // and check whether they are male or female.
        char gender = ' ';
        switch (cnp.charAt(0)){
            case '1', '3', '5', '7' -> gender = 'M';
            case '2', '4', '6', '8' -> gender = 'F';
        }
        return gender;

    }
    public static ArrayList<String> getSocialSecurityNumbersFromFile(String filename) {
        ArrayList<String> securityNumbers = new ArrayList<>();
        try {
            File myObj = new File(filename);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                securityNumbers.add(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return securityNumbers;
    }

    public static void main(String[] args) {
        ArrayList<String> socialSecurityNumbers = getSocialSecurityNumbersFromFile("CNP.txt");

        for(int i =0; i < socialSecurityNumbers.size(); i++) {
            printDataFromCnp(socialSecurityNumbers.get(i));

        }
    }
}