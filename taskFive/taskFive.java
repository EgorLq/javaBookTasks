import java.util.Arrays;
import static java.lang.Math.random;
import java.util.Scanner;

public class taskFive {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int matrix = scan.nextInt();
          random random =new random() ;
          printArray printArray =new printArray() ;
        int[][] array = new int[matrix][matrix];
        random.findRandom(array,matrix);
        printArray.findPrintArray(array);

        }

    }






  /*   for (int i = 0; i < matrix; i++) {
        for (int j = 0; j < matrix; j++) {
        array[i][j] = -matrix + random() * matrix * 2;
        }
        }
     for (double[] anArr : array) {
               for (double anAnArr : anArr) {
               System.out.print(anAnArr + " ");
               }
               System.out.println(); */

