import java.util.ArrayList;
import java.util.List;

public class simpleNumber {

  void findSimpleNumbers(Integer[] sourceNumbers) {
    List<Integer> simpleNumbers = new ArrayList<Integer>(); // обозначаем переменную  в виде  integer массива

    for (Integer sourceNumber : sourceNumbers) { // используем foreach имеет вид  for(тип итер_пер : коллекция) блок_операторов
      if (sourceNumber % sourceNumber == 0 & sourceNumber % 2 != 0 & sourceNumber % 3 != 0
          & sourceNumber % 5 != 0 & sourceNumber % 7 != 0)  // условия того что это простое число
      {
        simpleNumbers.add(sourceNumber);  // добавляем число которое соответсвует условиям
      } else if (sourceNumber == 2 || sourceNumber == 3 || sourceNumber == 5
          || sourceNumber == 7) { // условия того что это простое число
        simpleNumbers.add(sourceNumber);  // добавляем число которое соответсвует условиям
      } else
        ;


    }

    System.out.println("Простые числа : " + simpleNumbers); // вывод числа


  }
}


