package odessa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first fraction's numerator and denominator: ");
        Fraction myFraction1 = new Fraction(input.nextInt());
        System.out.print("Enter the second fraction's numerator and denominator: ");
        Fraction myFraction2 = new Fraction(input.nextInt());
        System.out.print("Enter the third fraction's numerator and denominator: ");
        Fraction myFraction3 = new Fraction(input.nextInt());

        Fraction fraction = Fraction.addFraction(myFraction1, myFraction2, myFraction3);
        System.out.println( String.format("numerator=%d, denominator=%d", fraction.getNumerator(), fraction.getDenominator()) );

        System.out.print(Fraction.gcd(myFraction1.getNumerator(), myFraction1.getDenominator()));
        System.out.println();
        System.out.print(Fraction.gcd(myFraction2.getNumerator(), myFraction2.getDenominator()));
        System.out.println();
        System.out.print(Fraction.gcd(myFraction3.getNumerator(), myFraction3.getDenominator()));
        System.out.println();

        Fraction.reduceFraction(myFraction1.getNumerator(), myFraction1.getDenominator());

        System.out.println();
        System.out.println(Fraction.addFraction(myFraction1, myFraction2, myFraction3));
    }
}
