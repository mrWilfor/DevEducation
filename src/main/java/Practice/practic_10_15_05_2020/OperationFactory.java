package practice.practic_10_15_05_2020;

public class OperationFactory {
    private OperationFactory () {

    }

    public static IOperations choose(String sort) {
        switch (sort) {
            case OperationConstants.SORT_BY_MIN:
                return new SortByMin();
            case OperationConstants.SORT_BY_MAX:
                return new SortByMax();
            case OperationConstants.SORT_BY_MERGE:
                return new SortByMerge();
            default:
                return null;
        }
    }
}
