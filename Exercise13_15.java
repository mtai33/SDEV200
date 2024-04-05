import java.util.Scanner;
import java.math.BigInteger;

public class Exercise13_15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first rational number: ");
        int num1 = input.nextInt();
        int den1 = input.nextInt();

        System.out.print("Enter the second rational number: ");
        int num2 = input.nextInt();
        int den2 = input.nextInt();

        Rational r1 = new Rational(new BigInteger(Integer.toString(num1)), new BigInteger(Integer.toString(den1)));
        Rational r2 = new Rational(new BigInteger(Integer.toString(num2)), new BigInteger(Integer.toString(den2)));

		System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
		System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
		System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
		System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
		System.out.println(r2 + " is " + r2.doubleValue());
	}

}
