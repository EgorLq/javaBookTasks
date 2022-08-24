import java.util.Scanner;
public class matrixSum {
    void matrixSumFind (int[][] b , int d) {
        int sum = 0;
        int sumAll = 0;
        boolean firstPositive = false;
        boolean secondPositive = false;
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                if ((b[i][j] > 0) && (firstPositive))
                    secondPositive = true;
                else if ((firstPositive) && (!secondPositive)) {
                    sum += b[i][j];
                } else if ((b[i][j] > 0) && (!firstPositive))
                    firstPositive = true;
            }
            if (firstPositive && !secondPositive) {
                sum = 0;
            }
            firstPositive = false;
            secondPositive = false;
            sumAll += sum;
            sum = 0;
        }
        System.out.println ("сумма элементов между  первым и вторым положительным числом массива каждолй " + sumAll );
    }
}
