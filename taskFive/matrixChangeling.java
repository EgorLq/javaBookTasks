public class matrixChangeling {

  void matrixChangeling90(int matrix[][], int size) {
    System.out.println("Поворт матрицы на 90 градусов против часовой стрелки");
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        System.out.print(matrix[j][i] + "\t");
      }
      System.out.println();
    }
  }

  void matrixChangeling180(int matrix[][], int size) {
    System.out.println("Поворт матрицы на 180 градусов против часовой стрелки");
    for (int i = size - 1; i >= 0; i--) {
        for (int j = size - 1; j >= 0; j--) {
            System.out.print(matrix[i][j] + "\t");
        }

      System.out.println();
    }
  }

  void matrixChangling270(int[][] matrix, int size) {
    System.out.println("Поворт матрицы на 270 градусов против часовой стрелки");
    int[][] result = new int[matrix.length][matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        result[i][j] = matrix[matrix.length - 1 - j][i];
        System.out.print(result[i][j] + "\t");
      }
      System.out.println();

    }

  }
}



