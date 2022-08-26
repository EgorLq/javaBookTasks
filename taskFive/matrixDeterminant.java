import java.util.* ;
public class matrixDeterminant {
    void findMatrixDeterminant(int matrix[][], int size) {
        if (matrix.length == 1) {
            System.out.println(matrix[0][0]);
        } else if (matrix.length == 2) {
            System.out.println((matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]));
        } else {
            int l;
            double d;
            double sum11 = 1, sum12 = 0, sum21 = 1, sum22 = 0;
            for (int i = 0; i < size; i++) {
                sum11 = 1;
                l = 2 * size - 1 - i;
                sum21 = 1;
                for (int j = 0; j < size; j++) {
                    sum21 *= matrix[j][l % size];
                    l--;
                    sum11 *= matrix[j][(j + i) % (size)];
                }
                sum22 += sum21;
                sum12 += sum11;
            }
            d = sum12 - sum22;
            System.out.println(d);
        }
    }
}






