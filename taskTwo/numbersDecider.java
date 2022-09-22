import java.util.*;
import java.util.List;

public class numbersDecider {

  static int findNumbersDecider(Integer[] sourceNumbers) {
    List<Integer> number = new ArrayList<>(); // обозначаем переменную  в виде  integer массива
    Map<Integer, Integer> countNumber = new LinkedHashMap<>();  //  переменная счетчик чисел в массиве

    for (int i = 0; i < sourceNumbers.length; i++) { //  цикл счетчика чисел в массиве
      countNumber.put(sourceNumbers[i], countNumber.getOrDefault(sourceNumbers[i], 0) + 1);

    }
    List<Map.Entry<Integer, Integer>> toSort = new ArrayList<>(); // сортировка в массиве
    for (Map.Entry<Integer, Integer> record : countNumber.entrySet()) {
      toSort.add(
          record);                                                    // запись в массиве отсортированных чисел
    }
    toSort.sort(
        Map.Entry.<Integer, Integer>comparingByValue().reversed()); // сортировка в обратном порядке
    for (Map.Entry<Integer, Integer> record : toSort) {
      int key = record.getKey();                       // переменная ключ
      int value = record.getValue();                // переменная ценность
      for (int i = 0; i < value; i++) {           // цикл на подсчет кол во
        number.add(
            key);                                               // добавление кол -во раз встреч того или иного числа
      }

    }
    System.out.println(
        "Числа в порядке убывания частоты встречаемости чисел: " + number); //  вывод числа
    return 0;
  }
}

