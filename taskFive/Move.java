import java.util.Scanner;
public class Move {
     void moveToLeft(int[][] b) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сдвиг влево");
        int step = sc.nextInt();
        if (step > b.length || step < 1) {
            System.out.println("Сдвиг невозможен");
            return;
        }
        int buff, i, j;
        for (int r = 0; r < step; r++) {
            for (i = 0; i < b.length; i++) {
                buff = b[i][0];
                for (j = 0; j < b.length - 1; j++) {
                    b[i][j] = b[i][j + 1];
                }
                b[i][j] = buff;
            }
        }
    }

     void moveToRight(int[][] b) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сдвиг вправо");
        int step = sc.nextInt();
        if (step > b.length || step < 1) {
            System.out.println("Сдвиг невозможен");
            return;
        }
        int buff, i, j;
        for (int r = 0; r < step; r++) {
            for (i = 0; i < b.length; i++) {
                buff = b[i][b.length - 1];
                for (j = b.length - 1; j > 0; j--) {
                    b[i][j] = b[i][j - 1];
                }
                b[i][j] = buff;
            }
        }
    }

     void moveToDown(int[][] b) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сдвиг вниз");
        int step = sc.nextInt();
        if (step > b.length || step < 1) {
            System.out.println("Сдвиг невозможен");
            return;
        }
        int buff, i, j;
        for (int r = 0; r < step; r++) {
            for (i = 0; i < b.length; i++) {
                buff = b[b.length - 1][i];
                for (j = b.length - 1; j > 0; j--) {
                    b[j][i] = b[j - 1][i];
                }
                b[j][i] = buff;
            }
        }
    }

     void moveToUp(int[][] b) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сдвиг вверх");
        int step = sc.nextInt();
        if (step > b.length || step < 1) {
            System.out.println("Сдвиг невозможен");
            return;
        }
        int buff, i, j;
        for (int r = 0; r < step; r++) {
            for (i = 0; i < b.length; i++) {
                buff = b[0][i];
                for (j = 0; j < b.length - 1; j++) {
                    b[j][i] = b[j + 1][i];
                }
                b[j][i] = buff;
            }
        }
    }
}
