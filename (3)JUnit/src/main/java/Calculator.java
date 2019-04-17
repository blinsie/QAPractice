import java.lang.Math.*;

public class Calculator {

    public int Division(int a, int b) {
        if (b == 0) {
            System.out.println("Invalid input.");
            System.exit(0);
        }
        return a/b;
    }

    public int Multiplication(int a, int b) {
        return a*b;
    }

    public int Substraction(int a, int b) {
        return a-b;
    }

    public int Sum(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) throws Throwable {
        java.util.Scanner in = new java.util.Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.println("Input number a: ");
        int a = in.nextInt();
        System.out.println("Input number b: ");
        int b = in.nextInt();
        System.out.println("Choose operation 1. \"+\", 2. \"-\"," +
                " 3. \"*\", 4. \"/\", 5. \"pow(a,b)\": ");
        int operator = in.nextInt();
        switch (operator) {
            case 1:
                System.out.println(calc.Sum(a,b));
                break;
            case 2:
                System.out.println(calc.Substraction(a,b));
                break;
            case 3:
                System.out.println(calc.Multiplication(a,b));
                break;
            case 4:
                System.out.println(calc.Division(a,b));
                break;
            case 5:
                System.out.println(Math.pow(a,b));
                break;
            default:
                System.exit(0);
        }
    }

}
