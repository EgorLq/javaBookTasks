import java.util.Scanner;

public class taskTwo {
    public static void  main (String args []){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt(); // вводим переменную
        Integer[] numbers = new  Integer[size];//  обозначаем переменую
        oddEven numbersOddEven= new oddEven() ; // инициализируем класс
        biggerSmoller biggerSmollerNumber= new biggerSmoller() ; // инициализируем класс
        divisibility3and9 divisibility3or9Number= new divisibility3and9() ; // инициализируем класс
        divisibility5or7 divisibility5or7Number=new divisibility5or7() ; // инициализируем класс
        notTheSameNumbers notTheSameNumber = new notTheSameNumbers() ; // инициализируем класс
        simpleNumber simpleNumber = new simpleNumber() ; // инициализируем класс
        numberSotredBigSmall numberSotredBigSmall = new numberSotredBigSmall() ; // инициализируем класс
        numbersDecider numbersDecider = new numbersDecider() ; // инициализируем класс
        palindrome palindrome= new palindrome() ; // инициализируем класс
        elementsHalfScrip elementsHalfScrip = new elementsHalfScrip() ; // инициализируем класс

        for (int i=0; size>i ;i++) { // цикл ввода чисел
            numbers[i] = scan.nextInt();
        }

        numbersOddEven.findEvenAndOddNumbers(numbers); // выводим  чет нечет число
        biggerSmollerNumber.findMAXandMinNumbers(numbers); // выводим  максимальное и минимальное число
        divisibility3or9Number.findDivisibility3and9(numbers); // выводим числа которые делятся на 3 или 9
        divisibility5or7Number.findDivisibility5or7(numbers); // выводим числа  которые делятся на 5 и на 7
        notTheSameNumber.findnotTheSameNumbers(numbers); // выводим  трехзначные числа в которых нет одинаковых цифр
        simpleNumber.findSimpleNumbers(numbers); // выводим  простые числа
        numberSotredBigSmall.findNumberSortedBigSmall(numbers); // выводим  числа в порядке убывания и возрастания
        numbersDecider.findNumbersDecider(numbers); // выводим  числа в порядке убывания частоты встреч чисел
        palindrome.findPalindrome(numbers); // выводим число паллиндром
        elementsHalfScrip.findElementsHalfScrip(numbers); // выводим число равнное полусумме

    }
}

