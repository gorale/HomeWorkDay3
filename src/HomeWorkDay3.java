
import java.util.Scanner;

public class HomeWorkDay3 {

    /**
     * Swap Numbers
     * @author Gor Aleksanyan
     * */
    public static void swapNumbers(int a,int c){
        System.out.println("a: "+a);
        System.out.println("b: "+c);
        c = c+a;
        a=c-a;
        c = c-a;
        System.out.println("a after swapping: "+a);
        System.out.println("b after swapping: "+c);
    }
    /**
     * Sting problem
     * @author Gor Aleksanyan
     * */
    public static void stringProblem(){
//        String text = "Vikings";
        String txt = "We are the\r so-called \"Vikings\" \n from the";
        System.out.println(txt);
    }
    /**
     * Unification Integer And String
     * @author Gor Aleksanyan
     * */
    public static void unificationIntegerAndString(){
        int num1 = 8;
        int num2 = 2;
        int sum = num1+num2;
        System.out.println("unification integer and string: "+num1+"+"+num2+"="+sum);
    }
    /**
     * String initialize
     * @author Gor Aleksanyan
     * */
    public static void stringInitialize(){
        String text1 = "Gor";
        String text2 = " ";
        String text3 = "Aleksanyan";
        System.out.println("Strings initialize: "+text1+text2+text3);
    }
    /**
     * Int Corresponding Char
     * @author Gor Aleksanyan
     * */
    public static void intCorrespondingChar(int number){
        char sim = (char)number;
        System.out.println("char: "+sim);

    }
    /**
     * Average letters
     * @author Gor Aleksanyan
     * */
    public static void averageLetters(){
        char g = 'G';
        char o = 'o';
        char r = 'r';
        float av = (g+o+r)/3f;
        System.out.println("Average letters: "+av);
    }
    /**
     * Cast char to int
     * @author Gor Aleksanyan
     * */
    public static void charToInt(){
        char a = '5';
        int b = (int)a;
        System.out.println(b);
    }
    /**
     *  Name and year of birth using only
     * char primitive and int types
     * @author Gor Aleksanyan
     * */
    public static void nameAndYearOfBirth(){
        char g = 71;
        char o = 111;
        char r = 114;
        int year = 1997;
        System.out.println(g+""+o+""+r+" "+year);

    }
    /**
     * Expression 1/3
     * @author Gor Aleksanyan
     * */
    public static void expression(){
        double a = 1/3d;
        System.out.println("Double 1/3: "+a);
        float e =  1/3f; //need to ask
        System.out.println("Float 1/3: "+e);

    }
    /**
     * Circle area and perimeter
     * @author Gor Aleksanyan
     * */
    public static void circle(double r){
        Scanner num = new Scanner(System.in);

        double pi = 3.14159;
        double area = pi*r*r;
        double perimeter = 2*pi*r;
        System.out.println("Circle area: "+area);
        System.out.println("Circle perimeter: "+perimeter);
    }
    /**
     * Fahrenheit to Celsius
     * @author Gor Aleksanyan
     * */
    public static void fahrenheitToCelsius(float f) {

        float a = (f-32)/1.8f;
        int c = (int) a;
        System.out.println("Temperature: "+c);

    }

    /**
     * Narrowing primitive Conversion(Explicit)
     * @author Gor Aleksanyan
     * */
    public static void explicit(double number) {

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
    public static void implicit(byte b) {


        System.out.println("byte: "+b);
        short number1 = b;
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
        Scanner num = new Scanner(System.in);
        System.out.print("Enter byte number: ");
        byte b = num.nextByte();
        implicit(b);

        System.out.print("Enter double number: ");
        double number = num.nextDouble();
        explicit(number);

        System.out.print("Enter Fahrenheit: ");
        float number1 = num.nextFloat();
        fahrenheitToCelsius(number1);

        System.out.print("Enter circle radius: ");
        double r = num.nextDouble();
        circle(r);

        expression();

        nameAndYearOfBirth();

        charToInt();

        averageLetters();

        System.out.print("Enter int number(range 32 to 127 ): ");
        int number2 = num.nextInt();
        intCorrespondingChar(number2);

        stringInitialize();

        unificationIntegerAndString();

        stringProblem();

        System.out.print("Enter number a: ");
        int a = num.nextInt();
        System.out.print("Enter number b: ");
        int c = num.nextInt();
        swapNumbers(a,c);
    }
}
