import java.util.Scanner;

public class Move {

  void moveToLeft(int[][] matrix) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите сдвиг влево");
    int step = sc.nextInt();
    if (step > matrix.length || step < 1) {
      System.out.println("Сдвиг невозможен");
      return;
    }
    int buff, i, j;
    for (int r = 0; r < step; r++) {
      for (i = 0; i < matrix.length; i++) {
        buff = matrix[i][0];
        for (j = 0; j < matrix.length - 1; j++) {
          matrix[i][j] = matrix[i][j + 1];
        }
        matrix[i][j] = buff;
      }
    }
  }

  void moveToRight(int[][] matrix) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите сдвиг вправо");
    int step = sc.nextInt();
    if (step > matrix.length || step < 1) {
      System.out.println("Сдвиг невозможен");
      return;
    }
    int buff, i, j;
    for (int r = 0; r < step; r++) {
      for (i = 0; i < matrix.length; i++) {
        buff = matrix[i][matrix.length - 1];
        for (j = matrix.length - 1; j > 0; j--) {
          matrix[i][j] = matrix[i][j - 1];
        }
        matrix[i][j] = buff;
      }
    }
  }

  void moveToDown(int[][] matrix) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите сдвиг вниз");
    int step = sc.nextInt();
    if (step > matrix.length || step < 1) {
      System.out.println("Сдвиг невозможен");
      return;
    }
    int buff, i, j;
    for (int r = 0; r < step; r++) {
      for (i = 0; i < matrix.length; i++) {
        buff = matrix[matrix.length - 1][i];
        for (j = matrix.length - 1; j > 0; j--) {
          matrix[j][i] = matrix[j - 1][i];
        }
        matrix[j][i] = buff;
      }
    }
  }

  void moveToUp(int[][] matrix) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите сдвиг вверх");
    int step = sc.nextInt();
    if (step > matrix.length || step < 1) {
      System.out.println("Сдвиг невозможен");
      return;
    }
    int buff, i, j;
    for (int r = 0; r < step; r++) {
      for (i = 0; i < matrix.length; i++) {
        buff = matrix[0][i];
        for (j = 0; j < matrix.length - 1; j++) {
          matrix[j][i] = matrix[j + 1][i];
        }
        matrix[j][i] = buff;
      }
    }
  }
}
