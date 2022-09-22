import java.util.List;
import java.util.Arrays;

public class smollerBiggerNumber {

  void findSmollerBiggerNumber(String[] sourceNumbers) {

    List<String> numbers = Arrays.asList(sourceNumbers);
    String longestNumber = "";
    for (String number : numbers) {
      if (number.length() > longestNumber.length()) {
        longestNumber = number;
      }
    }

    String shortNumber = longestNumber;
    for (String number : numbers) {
      if (number.length() < shortNumber.length()) {
        shortNumber = number;
      }
    }

    System.out.println(
        "Самое длинное число  " + longestNumber + "  длинна  " + longestNumber.length());
    System.out.println(
        "Самое короткое число  " + shortNumber + "  длинна  " + +shortNumber.length());
  }

}


