import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static int multiplyTwoNumbers(int numberOne, int numberTwo){
        int sum = numberOne * numberTwo;
        return  sum;
    }

    public static void main(String[] args) {
        int sum = multiplyTwoNumbers(3, 5);
        int sum2 = multiplyTwoNumbers(6, 9);
        int sum3 = multiplyTwoNumbers(10, 72);

        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(sum3);

        System.out.println(multiplyTwoNumbers(10, 10));

    }
    public static void getCurrentDateTime(){
        Date date = new Date();
        System.out.println(date.getTime());
    }
    public static double divisionTreeNumbers(double numberOne, double numberTwo, double numberTree){
        double division = numberOne / numberTwo / numberTree;
        return  division;
    }

}


