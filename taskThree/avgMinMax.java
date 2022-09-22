import java.util.*;


public class avgMinMax {

    void findAvgMinMax(String[] sourceNumbers) {
        List<String> numbersBig = new ArrayList<String>();
        List<String> numbersSmall = new ArrayList<String>();
        int count = 0;
        double countedLength = 0.0;

        for (int i = 0; i < sourceNumbers.length; i++) {
            countedLength += sourceNumbers[i].length();
            count++;
        }
        Double avg = (double) countedLength / count;

        for (String numberMoreAvg : sourceNumbers) {
            if (numberMoreAvg.length() > avg) {
                numbersBig.add(numberMoreAvg);
            }
        }
        for (String numberLessAvg : sourceNumbers) {
            if (numberLessAvg.length() < avg) {
                numbersSmall.add(numberLessAvg);
            }
        }

        System.out.println("числа больше средней длины  " + numbersBig + "  длинна  ");
        System.out.println("числа меньше средней длины  " + numbersSmall + "  длинна  ");

    }
}





