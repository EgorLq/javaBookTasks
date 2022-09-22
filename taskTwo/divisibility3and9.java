import java.util.ArrayList;
import java.util.List;

public class divisibility3and9 {

  void findDivisibility3and9(Integer[] sourceNumbers) {
    List<Integer> divisiblity = new ArrayList<Integer>(); // обозначаем переменную делимости в виде  integer массива

    for (Integer sourceNumber : sourceNumbers) { // используем foreach имеет вид  for(тип итер_пер : коллекция) блок_операторов

      if (sourceNumber % 3 == 0 | sourceNumber % 9 == 0) {     // условия делимости
        divisiblity.add(
            sourceNumber);                      // добавляем число которое соответсвует условиям
      } else {

      }
    }
    System.out.println("Числа которые делятся на 3 или на 9: " + divisiblity); // вывод числа

  }


}

