package strategy;

public class StrategyPatternDemo {

    public static void main(String[] args) {
        int[] data = {5, 2, 9, 1, 5, 6};

        Sorter sorter = new Sorter(new BubbleSort());
        sorter.sort(data);

        sorter.setStrategy(new QuickSort());
        sorter.sort(data);

        sorter.setStrategy(new MergeSort());
        sorter.sort(data);
    }

}
