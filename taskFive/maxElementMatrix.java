import java.util.ArrayList;

public class maxElementMatrix {
    void findMaxElementMatrix(int matrix[][], int size) {
        ArrayList<Integer> rows = new ArrayList<Integer>();
        ArrayList<Integer> column = new ArrayList<Integer>();
        int max = -size;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (max == matrix[i][j]) {
                    if (rows.indexOf(j) == -1)
                        rows.add(j);
                    if (column.indexOf(i) == -1)
                        column.add(i);
                }
            }
        }
        int newArrI = 0;
        int newArrJ = 0;
        int[][] newArr = new int[size - rows.size()][size - column.size()];
        for (int i = 0; i < size; i++) {
            if (rows.indexOf(i) == -1) {
                newArrJ = 0;
                for (int j = 0; j < size; j++) {
                    if (column.indexOf(j) == -1) {
                        newArr[newArrI][newArrJ] = matrix[j][i];
                        newArrJ++;
                    }
                }
                newArrI++;
            }
        }
        System.out.println();
        // Печать результатата
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[i].length; j++) {

                System.out.print(newArr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
