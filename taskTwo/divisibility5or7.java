import java.util.ArrayList;
import java.util.List;

public class divisibility5or7 {

  void findDivisibility5or7(Integer[] sourceNumbers) {
    List<Integer> divisiblity = new ArrayList<Integer>(); // обозначаем переменную делимости в виде  integer массива

    for (Integer sourceNumber : sourceNumbers) { // используем foreach имеет вид  for(тип итер_пер : коллекция) блок_операторов
      if (sourceNumber % 5 == 0 & sourceNumber % 7 == 0) { // условия делимости
        divisiblity.add(sourceNumber);   // добавляем число которое соответсвует условиям
      } else {

      }
    }
    System.out.println("Числа которые делятся на 5 и на 7: " + divisiblity); // вывод числа

  }
}

