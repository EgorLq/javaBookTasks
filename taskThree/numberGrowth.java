import java.util.*;

public class numberGrowth {

  void findNumberGrowth(String[] sourceNumbers) {
    for (int i = 0; i < sourceNumbers.length; i++) {
      String str = String.valueOf(sourceNumbers[i]);
      char[] arraySplit = str.toCharArray();
      int j = 0;
      while (j < arraySplit.length - 1) {
        if (arraySplit[j] >= arraySplit[j + 1]) {
          break;
        } else if (j == arraySplit.length - 2) {
          System.out.println("Число в порядке возрастания" + Arrays.toString(arraySplit));
          return;
        } else {
          j++;
          continue;
        }
      }
    }


  }
}
