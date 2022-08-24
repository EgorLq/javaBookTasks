
import java.util.Random;
public class random {
    void findRandom(int matrix [][], int size) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][i] = random.nextInt(2 * size + 1) - size;
            }
        }

    }
}
