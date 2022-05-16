package odessa;

public class Fraction {
        private int numerator;
        private int denominator;

        Fraction(int numerator) {
            this.numerator = numerator;
            this.denominator = denominator;
        }

        int getNumerator() {
            return numerator;
        }

        int getDenominator() {
            return denominator;
        }

        @Override
        public String toString() {
        return "numerator=" + numerator + ", denominator=" + denominator + "]";
        }


        public static void reduceFraction(int numerator, int denominator) {
            int smaller;
            if (numerator < denominator) {
                smaller = numerator;
            } else {
                smaller = denominator;
            }
            for (int i = smaller; i > 0; --i) {
                if (numerator % i == 0 && denominator % i == 0) {
                    System.out.print("Reduced form: " + (numerator / gcd(numerator, denominator)) + "/" + (denominator / gcd(numerator, denominator)));
                    break;
                }
            }
        }

        public static int gcd(int numerator, int denominator) {
            if (numerator % denominator == 0) {
                return denominator;
            }
            return gcd(denominator, numerator % denominator);
        }
    public static Fraction addFraction(Fraction a, Fraction b, Fraction c) {
        return new Fraction(a.numerator / b.denominator + a.denominator / b.numerator * a.numerator / a.denominator - c.numerator / c.denominator);
    }
}

