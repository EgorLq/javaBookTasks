import java.util.*;

public class luckyNumber {

  public static int findLucky(Integer[] sourceNumbers) {
    Arrays.sort(sourceNumbers);
    int ans = 0;
    for (int i = sourceNumbers.length - 1; i >= 0; i--) {
      ans++;
      if (i == 0 || sourceNumbers[i] != sourceNumbers[i - 1]) {
        if (ans == sourceNumbers[i]) {
          return ans;
        }
        ans = 0;
      }
    }
    System.out.println("Счасливые числа  " + ans);
    return ans;
  }
}
