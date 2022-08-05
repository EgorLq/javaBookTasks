import java.util.*;

public class variosNumber {
    void findvariosNumber (String[] sourceNumbers) {
    String variosNumber = sourceNumbers[0];
    int sizeMinCharVar = new HashSet<String> (Arrays.asList (sourceNumbers[0].split (""))).size ();
        for (String word : sourceNumbers) {
        Set<String> set = new HashSet<String>(Arrays.asList(word.split("")));
        if (set.size() > sizeMinCharVar) {
            variosNumber = word;
            sizeMinCharVar = set.size();
        }

        }
        System.out.println ("разнообразное число  " +variosNumber);
    }
}
