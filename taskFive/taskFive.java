
import java.util.Scanner;
import static java.lang.Math.random;

public class taskFive {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int matrix = scan.nextInt();

        double[][] array = new double[matrix][matrix];
        for (int i = 0; i < matrix; i++) {
            for (int j = 0; j < matrix; j++) {
                array[i][j] = -matrix + random() * matrix * 2;
            }
        }
        for (double[] anArr : array) {
            for (double anAnArr : anArr) {
                System.out.print(anAnArr + " ");
            }
            System.out.println();
        }

    }
}




