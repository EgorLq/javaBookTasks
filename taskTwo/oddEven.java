import java.util.List;
import java.util.ArrayList;

public class oddEven {

  void findEvenAndOddNumbers(Integer[] sourceNumbers) {

    List<Integer> evens = new ArrayList<Integer>();
    List<Integer> odds = new ArrayList<Integer>();
    for (Integer sourceNumber : sourceNumbers) {
      if (sourceNumber % 2 == 0) {
        evens.add(sourceNumber);
      } else {
        odds.add(sourceNumber);
      }
    }
    System.out.println("Чётные числа: " + evens);
    System.out.println("Нечётные числа: " + odds);
  }


}

