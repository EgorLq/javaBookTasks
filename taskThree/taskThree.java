
import java.util.Scanner;

public class taskThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] numbers = new  String[size];
        smollerBiggerNumber smollerBiggerNumber =new smollerBiggerNumber() ;
        shortLongNumber shortLongNumber = new shortLongNumber() ;
        avgMinMax avgMinMax = new avgMinMax() ;
        uniqueNumber variousNumber=new uniqueNumber() ;
      numberGrowth numberGrowth = new numberGrowth() ;
        variosNumber variosNumber = new variosNumber();
        pallindromeNumber pallindromeNumber = new pallindromeNumber() ;
        for (int i=0; size>i ;i++)  {
            numbers[i] = scan.next();
        }
        smollerBiggerNumber.findSmollerBiggerNumber(numbers);
        shortLongNumber.findShortLongNumber(numbers);
        avgMinMax.findAvgMinMax(numbers);
        variousNumber.findUniqueNumber(numbers);
        numberGrowth.findNumberGrowth(numbers);
           variosNumber.findvariosNumber(numbers);
        pallindromeNumber.findpallindromeNumber(numbers);
    }
}


