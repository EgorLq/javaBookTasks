
public class matrixNew {
    void findNewMatrix (int matrix) {

        int neo = (int) Math.sqrt(matrix);
  int a=0  ;
        int[][] newMatrix = new int[neo][neo];
        for (int i = 0; i < neo; i++) {
            for (int j = 0; j < neo; j++) {
                 a++;
                newMatrix[i][j]= a ;
                System.out.print(newMatrix[i][j] +" ");
            }
            System.out.println();
        }
    }
}
