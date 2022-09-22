import java.util.ArrayList;
import java.util.List;

public class elementsHalfScrip {

  void findElementsHalfScrip(Integer[] sourceNumbers) {
    Integer[] numbers = sourceNumbers.clone(); // клонируем обьект
    List<Integer> halfScripNumber = new ArrayList<Integer>(); // обозначаем число равное полусумее
    for (int i = 1; i < numbers.length - 1; i++) { //  цикл для подсчета
      if (numbers.length < 3) { //  если чисел меньше 3 то не имеет смысла искать полусумму
        break;
      }
      if (numbers[i] == (numbers[i - 1] + numbers[i + 1])
          / 2) { //  ставим условие что если полусумма равна нашему числу то
        halfScripNumber.add(numbers[i]); //  добавляем число
      }
    }
    System.out.println("Элементы, которые равны полусумме соседних  элементов "
        + halfScripNumber); //  выводим число
  }
}


