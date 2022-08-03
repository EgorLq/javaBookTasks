import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
public class numberSotredBigSmall {
    void findNumberSortedBigSmall (Integer[] sourceNumbers) {
        List<Integer> biggerNumber  = Arrays.asList(sourceNumbers); // обозначаем переменную  в виде  integer массива
        List<Integer> smollerNumber  = Arrays.asList(sourceNumbers); // обозначаем переменную  в виде  integer массива
        Collections.sort(biggerNumber); // сортируем коллекцией

        System.out.println("числа в порядке возрастания : " +  biggerNumber ) ; //  вывод числа
        Collections.sort(smollerNumber, Collections.reverseOrder()); // сортируем коллекцией
        System.out.println("числа в порядке убывания: " +  smollerNumber ) ; //  вывод числа

    }
}

