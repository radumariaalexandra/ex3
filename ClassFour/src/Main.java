// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
     String cnp = "5000513080097";

     System.out.println(cnp.charAt(0));
     // In Romania, the first character of social security number
     //represents the biological sex of a person.
     //Below, we take from social security number the first character
     //and check whether they are male or female.
     switch (cnp.charAt(0)){
         case '1', '3', '5', '7' -> System.out.println('M');
     }

    }
}