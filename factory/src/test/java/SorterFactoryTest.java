import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sorters.ISorter;
import sorters.SortType;
import sorters.SorterFactory;

import java.util.Arrays;

public class SorterFactoryTest {

    SorterFactory factory;

    @Before
    public void init() {
        factory = new SorterFactory();
    }

    @Test
    public void bubbleSort_simpleValues_sorted() {
        ISorter sorter = factory.getSorter(SortType.BUBBLE);
        int[] result = sorter.sort(5, 3, 4, 2, 1);
        int[] expected = {1, 2, 3, 4, 5};
        Assert.assertTrue(Arrays.equals(expected, result));
    }

    @Test
    public void quickSort_simpleValues_sorted() {
        ISorter sorter = factory.getSorter(SortType.QUICK);
        int[] result = sorter.sort(5, 3, 4, 2, 1);
        int[] expected = {1, 2, 3, 4, 5};
        Assert.assertTrue(Arrays.equals(expected, result));
    }

    @Test
    public void shellSort_simpleValues_sorted() {
        ISorter sorter = factory.getSorter(SortType.SHELL);
        int[] result = sorter.sort(5, 3, 4, 2, 1);
        int[] expected = {1, 2, 3, 4, 5};
        Assert.assertTrue(Arrays.equals(expected, result));
    }

}
