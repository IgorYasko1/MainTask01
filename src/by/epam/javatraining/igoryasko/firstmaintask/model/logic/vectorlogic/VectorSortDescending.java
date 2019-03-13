package by.epam.javatraining.igoryasko.firstmaintask.model.logic.vectorlogic;

import by.epam.javatraining.igoryasko.firstmaintask.model.logic.data.Vector;

/**
 * Created by igoryasko
 *
 * @author igoryasko
 *
 * Class VectorSortAscending implements sorf algorithms descending order
 */

public class VectorSortDescending {

    //    complexity best O(n) worst O(n2)
    public static Vector bubbleSortDescending(Vector vector) {
        for (int i = 0; i < vector.size() - 1; i++) {
            for (int j = 0; j < vector.size() - 1 - i; j++) {
                if (vector.getElement(j + 1) > vector.getElement(j)) {
                    double tmp = vector.getElement(j);
                    vector.setElement(vector.getElement(j + 1), j);
                    vector.setElement(tmp, j + 1);
                }
            }
        }
        return vector;
    }

    //    complexity best O(n) worst O(n2)
    public static Vector insertionSortDescending(Vector vector) {
        int i, j;
        double key, temp;
        for (i = 1; i < vector.size(); i++) {
            key = vector.getElement(i);
            j = i - 1;
            while (j >= 0 && key > vector.getElement(j)) {
                temp = vector.getElement(j);
                vector.setElement(vector.getElement(j + 1), j);
                vector.setElement(temp, j + 1);
                j--;
            }
        }
        return vector;
    }

    //    complexity O(n2)
    public static Vector selectionDescending(Vector vector) {
        int i, j, minIndex;
        double minValue, temp = 0;
        for (i = 0; i < vector.size(); i++) {
            minValue = vector.getElement(i);
            minIndex = i;
            for (j = i; j < vector.size(); j++) {
                if (vector.getElement(j) > minValue) {
                    minValue = vector.getElement(j);
                    minIndex = j;
                }
            }
            if (minValue > vector.getElement(i)) {
                temp = vector.getElement(i);
                vector.setElement(vector.getElement(minIndex), i);
                vector.setElement(temp, minIndex);
            }
        }
        return vector;
    }

}
