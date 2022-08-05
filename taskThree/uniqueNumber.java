import java.util.*;

public class uniqueNumber {
    void findUniqueNumber(String[] sourceNumbers) {
        String uniqNumber = sourceNumbers[0];
        int sizeMinCharVar = new HashSet<String> (Arrays.asList (sourceNumbers[0].split (""))).size ();
        for (String word : sourceNumbers) {
            Set<String> set = new HashSet<String>(Arrays.asList(word.split("")));
            if (set.size() < sizeMinCharVar) {
                uniqNumber = word;
                sizeMinCharVar = set.size ();
            }
        }
        System.out.println ("уникальное число  " +uniqNumber);

    }
}





