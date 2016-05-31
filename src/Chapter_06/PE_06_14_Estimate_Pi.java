package Chapter_06;

/**
 * (Estimate p) p can be computed using the following series:
 *
 *      m(i) = 4(1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ... + (-1)^(i + 1)/2i - 1)
 *
 * Write a method that returns m(i) for a given i and write a test program that displays
 * the following table:
 *
 *      i          m(i)
 *      --------------------
 *      1          4.0000
 *      101        3.1515
 *      201        3.1466
 *      301        3.1449
 *      401        3.1441
 *      501        3.1436
 *      601        3.1433
 *      701        3.1430
 *      801        3.1428
 *      901        3.1427
 */
public class PE_06_14_Estimate_Pi {
    public static void main(String[] args) {
        System.out.println("i          m(i)");
        System.out.println("--------------------");
        for (int i = 1; i <= 901; i += 100) {
            System.out.printf("%-11d%6.4f%n", i, estimatePi(i));
        }
    }

    public static double estimatePi(int number) {
        double pi = 0;
        for (int i = 1; i <= number; i++) {
            pi += Math.pow(-1, i + 1) / (2 * i - 1.0);
        }
        return 4 * pi;
    }
}
