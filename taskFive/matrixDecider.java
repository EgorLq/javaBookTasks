import java.util.Arrays;

public class matrixDecider {

  void inDecrease(int[][] b) {
    int[] f = new int[b.length * b.length];//преобразую в одномерный массив
    int c = 0, r = 0, max = 0, h = 0, m = 0, min = 0, h1 = 0;
    for (int[] x : b) {
      for (int z : x) {
        f[c++] = z;
      }
    }

    for (int g = 0; g < f.length - 1; g++) {
      if (f[g] < f[g + 1]) {//если последующий элемент больше
        r += 1;
        if (r > max) {
          max = r;
          h = g + 1;
        }//запоминаем количество возрастаний и индекс последнего возрастающего элем
      } else {
        r = 0;
      }//возрастание прервалась
      if (f[g] > f[g + 1]) {
        m += 1;
        if (m > min) {
          min = m;
          h1 = g + 1;
        }//запоминаем количество возрастаний и индекс последнего убыв элем
      } else {
        m = 0;
      }

    }
    System.out.println("Максимальная последовательность возрастающих чисел:");
    int[] l = new int[max + 1];
    System.arraycopy(f, (h - max), l, 0,
        (max + 1));//копирую последовательность возр элем в новый массив
    System.out.println(Arrays.toString(l) + " " + (max + 1));
    System.out.println("Максимальная последовательность убывающих чисел:");
    int[] t = new int[min + 1];
    System.arraycopy(f, (h1 - min), t, 0,
        (min + 1));//копирую последовательность убыв элем в новый массив
    System.out.println(Arrays.toString(t) + " " + (min + 1));
  }

}


