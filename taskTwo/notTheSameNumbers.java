import java.util.ArrayList;
import java.util.List;

public class notTheSameNumbers {
    void findnotTheSameNumbers (Integer[] sourceNumbers){
        List<Integer> notTheNumbers = new ArrayList<Integer>();   // обозначаем переменную  в виде  integer массива
        for (Integer sourceNumber : sourceNumbers) { // используем foreach имеет вид  for(тип итер_пер : коллекция) блок_операторов
            String  number = sourceNumber.toString(); // обозначаем переменную  строки
            if (number.length() == 3 && number.charAt(0) != number.charAt(1)
                    && number.charAt(1) != number.charAt(2)
                    && number.charAt(0) != number.charAt(2))  // условия того что все трехзначные числа не имеют одинаковых цифр
            {
                notTheNumbers.add(sourceNumber);  // добавляем число которое соответсвует условиям
            }
        }
        System.out.println("Все трехзначные числа, "
                + "в десятичной записи которых нет одинаковых цифр: " + notTheNumbers); // вывод числа

    }
}
