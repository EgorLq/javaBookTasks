import java.util.Collections;
import java.util.Arrays;


public class biggerSmoller {

  void findMAXandMinNumbers(Integer[] sourceNumbers) {
    Integer numbersmin = Collections.min(Arrays.asList(
        sourceNumbers)); // используем коллекцию  что бы сделать число в массиве минимальным
    Integer numbersmax = Collections.max(Arrays.asList(
        sourceNumbers)); // используем коллекцию  что бы сделать число в массиве максимальным

    System.out.println("Наименьшее число: " + numbersmin); //вывод числа
    System.out.println("Наибольшее число: " + numbersmax); //  вывод числа


  }
}
