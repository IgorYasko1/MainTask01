package by.epam.javatraining.igoryasko.firstmaintask.model.logic.vectorlogic;

import by.epam.javatraining.igoryasko.firstmaintask.model.logic.data.Vector;

/**
 * Created by igoryasko on 4/1/19.
 *
 * @author igoryasko
 * <p>
 * Class VectorFinder implements methods linearSearch and binarySearch
 */

public class VectorFinder {

    //    complexity O(n)
    public static int linearSearch(Vector vector, double searchValue) {
        for (int i = 0; i < vector.size(); i++) {
            if (vector.getElement(i) == searchValue) {
                return i;
            }
        }
        return -1;
    }

    //  complexity O(logN)
    public static int binarySearch(Vector vector, double searchValue) {
        int low = 0;
        int high = vector.size() - 1;
        while (high >= low) {
            int middle = (low + high) / 2;
            if (searchValue == vector.getElement(middle)) {
                return middle;
            } else if (searchValue > vector.getElement(middle)) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return -1;
    }

}
