import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reverseMassive {
    public static void main(String[] args) {
        List<Integer> array  = Arrays.asList(1,2,3,4,5,6,7,8);
        Collections.sort(array, Collections.reverseOrder());
        System.out.println(array);
    }
}
