
import java.util.Scanner;

public class HomeWorkDay3 {
    /**
     * Fahrenheit to Celsius
     * @author Gor Aleksanyan
     * */
    public static void fahrenheitToCelsius(float f) {

        float c = (f-32)/1.8f;
        System.out.println("Temperature: "+c);

    }

    /**
     * Narrowing primitive Conversion(Explicit)
     * @author Gor Aleksanyan
     * */
    public static void explicit() {
            Scanner num = new Scanner(System.in);
            System.out.print("Enter double number: ");
            double number = num.nextDouble();
            System.out.println("double: "+number);
            float number1 = (float) number;
            System.out.println("float: "+number1);
            long number2 = (long) number1;
            System.out.println("long: "+number2);
            int number3 = (int) number2;
            System.out.println("int: "+number3);
            short number4 = (short) number3;
            System.out.println("short: "+number4);
            byte number5 = (byte) number4;
        System.out.println("short: "+number5);


    }

    /**
     * Widening primitive Conversion(Implicit)
     * @author Gor Aleksanyan
     * */
    public static void implicit() {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter byte number: ");
        byte number = num.nextByte();
        System.out.println("byte: "+number);
        short number1 = number;
        System.out.println("short: "+number1);
        int number2 = number1;
        System.out.println("int: "+number2);
        long number3 = number2;
        System.out.println("long: "+number3);
        float number4 = number3;
        System.out.println("float: "+number4);
        double number5 = number4;
        System.out.println("double: "+number5);

    }
    public static void main(String[] args) {
        implicit();
        explicit();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Fahrenheit: ");
        float num = sc.nextFloat();

        fahrenheitToCelsius(num);
    }
}
