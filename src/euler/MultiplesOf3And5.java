package euler;

/**
 *  If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *  Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class MultiplesOf3And5 {

    private static int maximum = 999; //inclusive

    public static void main(String[] args) {
        int first = 3, second = 5;
        int sum = sumDivisbleBy(first) + sumDivisbleBy(second) - sumDivisbleBy(first*second);

        System.out.println("The sum of all the multiples of " + first + " or " + second + " below " + maximum + " = " + sum);
    }

    private static int sumDivisbleBy(int value) {
        int n = maximum/value;
        return (value * n * (n+1)) / 2;
    }
}
