package euler;

/**
 A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

 Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class LongestPalindromicProduct {

    public static void main(String[] args) {
        faster();
//        slower();
    }

    private static void slower() {
        int largest = 0;
        int largest_i = 0, largest_j = 0;
        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > i; j--) {
                int product = i * j;
                if ((product > largest) && (product == reverse(product))) {
                    largest = product;
                    largest_i = i;
                    largest_j = j;
                }
            }
        }

        System.out.println("Largest palindrome: " + largest_i + " * " + largest_j + " = "  + largest);
    }

    private static int reverse(int n) {
        int reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + (n % 10);
            n /= 10;
        }
        return reversed;
    }

    private static void faster() {
        int largest = 0, largest_i = 0, largest_j = 0;
        for (int i = 999; i > 99; i--) {
            int j, divisor;
            if (i % 11 == 0) {
                j = 999;
                divisor = 1;
            } else {
                j = 990;
                divisor = 11;
            }

            while (j >= i) {
                int product = i * j;
                if (product <= largest) break;

                if (product == reverse(product)) {
                    largest = product;
                    largest_i = i;
                    largest_j = j;
                }

                j -= divisor;
            }
        }

        System.out.println("Largest palindrome: " + largest_i + " * " + largest_j + " = "  + largest);
    }
}
