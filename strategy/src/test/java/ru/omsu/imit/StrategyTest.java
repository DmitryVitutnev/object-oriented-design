package ru.omsu.imit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.omsu.imit.strategy.BubbleSortStrategy;
import ru.omsu.imit.strategy.QuickSortStrategy;
import ru.omsu.imit.strategy.ShellSortStrategy;

import java.util.Arrays;

public class StrategyTest {


    public Sorter sorter;

    @Before
    public void init(){
        sorter = new Sorter();
    }

    @Test
    public void strategy_bubbleSort_workFine() throws NoStrategyException {
        sorter.setStrategy(new BubbleSortStrategy());
        int[] result = sorter.sort(5, 3, 4, 2, 1);
        int[] expected = {1, 2, 3, 4, 5};
        Assert.assertTrue(Arrays.equals(expected, result));
    }

    @Test
    public void strategy_quickSort_workFine() throws NoStrategyException {
        sorter.setStrategy(new QuickSortStrategy());
        int[] result = sorter.sort(5, 3, 4, 2, 1);
        int[] expected = {1, 2, 3, 4, 5};
        Assert.assertTrue(Arrays.equals(expected, result));
    }

    @Test
    public void strategy_shellSort_workFine() throws NoStrategyException {
        sorter.setStrategy(new ShellSortStrategy());
        int[] result = sorter.sort(5, 3, 4, 2, 1);
        int[] expected = {1, 2, 3, 4, 5};
        Assert.assertTrue(Arrays.equals(expected, result));
    }

    @Test(expected = NoStrategyException.class)
    public void strategy_sort_noStrategy() throws NoStrategyException {
        int[] result = sorter.sort(5, 3, 4, 2, 1);
        int[] expected = {1, 2, 3, 4, 5};
        Assert.assertTrue(Arrays.equals(expected, result));
    }

}
