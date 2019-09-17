package ru.omsu.imit.strategy;

import ru.omsu.imit.strategy.ISortStrategy;

import java.util.Arrays;

public class ShellSortStrategy implements ISortStrategy {

    @Override
    public int[] sort(int... numbers) {
        int[] result = Arrays.copyOf(numbers, numbers.length);

        int n = result.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i += 1) {
                int temp = result[i];

                int j;
                for (j = i; j >= gap && result[j - gap] > temp; j -= gap)
                    result[j] = result[j - gap];

                result[j] = temp;
            }
        }

        return result;
    }
}
