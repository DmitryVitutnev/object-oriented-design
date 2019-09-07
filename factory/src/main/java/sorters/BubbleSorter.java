package sorters;

import java.util.Arrays;

public class BubbleSorter implements ISorter {

    public int[] sort(int... numbers) {
        int[] result = Arrays.copyOf(numbers, numbers.length);
        for (int i = 0; i < result.length - 1; i++) {
            for (int j = result.length - 1; j > i; j--) {
                if (result[j] < result[j - 1]) {
                    int x = result[j];
                    result[j] = result[j - 1];
                    result[j - 1] = x;
                }
            }
        }
        return result;
    }
}
