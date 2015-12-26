package euler;

/**
 The prime factors of 13195 are 5, 7, 13 and 29.

 What is the largest prime factor of the number 600851475143 ?
 */
public class LargestPrimeFactor {

    public static void main(String[] args) {
        long n = 600851475143L;
        int factor = 2; // initialize
        int largestFactor = 1;

        double maxFactor = Math.sqrt(n);
        while (n > 1) {
            if (factor > maxFactor) {
                System.out.println("========\n The largest prime factor is " + n);
                return;
            }
            if (n % factor == 0) {
                largestFactor = factor;
                n /= factor;
                while (n % factor == 0)
                    n /= factor;
                maxFactor = Math.sqrt(n);
            }

            if (factor > 2)
                factor += 2;
            else
                factor++;

            if (factor % 100 == 1) System.out.println(factor);
        }

        System.out.println("========\n The largest prime factor is " + largestFactor);
    }
}
