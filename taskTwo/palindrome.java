import java.util.*;
public class palindrome {
    void findPalindrome (Integer[] sourceNumbers) {
        List<StringBuilder> result = new ArrayList<StringBuilder>(); // обозначаем переменную  в виде  стринг билдера
        for (Integer sourceNumber : sourceNumbers) {
            StringBuilder s = new StringBuilder(sourceNumber.toString());
            if (s.toString().equals(s.reverse().toString())) { // сравниваем изначальное число  и перевернутое
                result.add(s); // добавляем число
            }
        }
        System.out.println("Числа-палиндромы: " + result); // выводим число
    }
}


