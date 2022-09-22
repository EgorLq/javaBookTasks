import java.util.*;

public class shortLongNumber {

  void findShortLongNumber(String[] sourceNumbers) {
    List<String> numbers = Arrays.asList(sourceNumbers);
    for (int i = 0; i < numbers.size(); i++) {
      sourceNumbers[i] = numbers.get(i);
    }
    for (int i = 0; i < sourceNumbers.length; i++) {
      for (int j = i + 1; j < sourceNumbers.length; j++) {
        String tempi = sourceNumbers[i];
        String tempj = sourceNumbers[j];

        if (tempj.length() < tempi.length()) {
          sourceNumbers[i] = sourceNumbers[j];
          sourceNumbers[j] = tempi;
        }
      }
    }
    System.out.println("числа в порядке возрастания длинны   " + numbers);
    Collections.reverse(numbers);
    System.out.println("числа в порядке убывания длинны   " + numbers);
  }

}




