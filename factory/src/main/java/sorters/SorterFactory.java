package sorters;

public class SorterFactory {


    public ISorter getSorter(SortType type) {
        switch(type) {
            case BUBBLE:
                return new BubbleSorter();
            case QUICK:
                return new QuickSorter();
            case SHELL:
                return new ShellSorter();

        }
        return null;
    }


}
