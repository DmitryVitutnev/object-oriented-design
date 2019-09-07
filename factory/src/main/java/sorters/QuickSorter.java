package sorters;

import java.util.Arrays;

public class QuickSorter implements ISorter {

    // Algorithm source http://www.javenue.info/post/45

    public int[] sort(int... numbers) {
        int[] result = Arrays.copyOf(numbers, numbers.length);
        recSort(result, 0, result.length-1);
        return result;
    }

    private static void recSort(int[] array, int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = (i + j) / 2;
        while (i < j) {
            while (i < cur && (array[i] <= array[cur])) {
                i++;
            }
            while (j > cur && (array[cur] <= array[j])) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        recSort(array, start, cur);
        recSort(array, cur+1, end);
    }

}
