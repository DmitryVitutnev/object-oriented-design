package sorters;

import java.util.Arrays;

public class ShellSorter implements ISorter {

    // Algorithm source https://www.geeksforgeeks.org/shellsort/

    @Override
    public int[] sort(int... numbers) {
        int[] result = Arrays.copyOf(numbers, numbers.length);

        int n = result.length;

        // Start with a big gap, then reduce the gap
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Do a gapped insertion sort for this gap size.
            // The first gap elements a[0..gap-1] are already
            // in gapped order keep adding one more element
            // until the entire array is gap sorted
            for (int i = gap; i < n; i += 1) {
                // add a[i] to the elements that have been gap
                // sorted save a[i] in temp and make a hole at
                // position i
                int temp = result[i];

                // shift earlier gap-sorted elements up until
                // the correct location for a[i] is found
                int j;
                for (j = i; j >= gap && result[j - gap] > temp; j -= gap)
                    result[j] = result[j - gap];

                // put temp (the original a[i]) in its correct
                // location
                result[j] = temp;
            }
        }

        return result;
    }


}
