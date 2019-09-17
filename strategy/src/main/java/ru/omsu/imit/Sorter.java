package ru.omsu.imit;

import ru.omsu.imit.strategy.ISortStrategy;

public class Sorter {

    private ISortStrategy strategy;

    public void setStrategy(ISortStrategy strategy) {
        this.strategy = strategy;
    }

    public int[] sort(int... numbers) throws NoStrategyException {
        if(strategy == null) {
            throw new NoStrategyException();
        }
        return strategy.sort(numbers);
    }

}
