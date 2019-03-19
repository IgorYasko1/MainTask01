package by.epam.javatraining.igoryasko.firstmaintask.model.logic.vectorlogic;

import by.epam.javatraining.igoryasko.firstmaintask.model.logic.data.Vector;

/**
 * Created by igoryasko
 *
 * @author igoryasko
 * <p>
 * Class VectorAscendingSorter implements sorf algorithms ascending order
 * and method revers
 */

public class VectorAscendingSorter {

    //    complexity O(n)
    public static Vector reverse(Vector vector) {
        for (int i = 0; i < vector.size() / 2; i++) {
            double tmp = vector.getElement(i);
            vector.setElement(vector.getElement(vector.size() - 1 - i), i);
            vector.setElement(tmp, vector.size() - 1 - i);
        }
        return vector;
    }

    //    complexity best O(n) worst O(n2)
    public static Vector bubbleSortAscending(Vector vector) {
        for (int i = 0; i < vector.size() - 1; i++) {
            for (int j = 0; j < vector.size() - 1 - i; j++) {
                if (vector.getElement(j) > vector.getElement(j + 1)) {
                    double tmp = vector.getElement(j);
                    vector.setElement(vector.getElement(j + 1), j);
                    vector.setElement(tmp, j + 1);
                }
            }
        }
        return vector;
    }

    //    complexity best O(n) worst O(n2)
    public static Vector insertionSortAscending(Vector vector) {
        int i, j;
        double key, temp;
        for (i = 1; i < vector.size(); i++) {
            key = vector.getElement(i);
            j = i - 1;
            while (j >= 0 && key < vector.getElement(j)) {
                temp = vector.getElement(j);
                vector.setElement(vector.getElement(j + 1), j);
                vector.setElement(temp, j + 1);
                j--;
            }
        }
        return vector;
    }

    //    complexity O(n2)
    public static Vector selectionSortAscending(Vector vector) {
        int i, j, minIndex;
        double minValue, temp = 0;
        for (i = 0; i < vector.size(); i++) {
            minValue = vector.getElement(i);
            minIndex = i;
            for (j = i; j < vector.size(); j++) {
                if (vector.getElement(j) < minValue) {
                    minValue = vector.getElement(j);
                    minIndex = j;
                }
            }
            if (minValue < vector.getElement(i)) {
                temp = vector.getElement(i);
                vector.setElement(vector.getElement(minIndex), i);
                vector.setElement(temp, minIndex);
            }
        }
        return vector;
    }

    //    complexity:  best O(n log(n))    worst O(n^2)
    public static Vector quickSort(Vector vector) {
        int start = 0;
        int end = vector.size() - 1;
        doSort(vector, start, end);
        return vector;
    }

    private static void doSort(final Vector vector, final int startIndex, final int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }
        int i = startIndex;
        int j = endIndex;
        int currentElement = i - (i - j) / 2;
        while (i < j) {
            while (i < currentElement && (vector.getElement(i) <= vector.getElement(currentElement))) {
                i++;
            }
            while (j > currentElement && (vector.getElement(currentElement) <= vector.getElement(j))) {
                j--;
            }
            if (i < j) {
                double tmp = vector.getElement(i);
                vector.setElement(vector.getElement(j), i);
                vector.setElement(tmp, j);
                if (i == currentElement) {
                    currentElement = j;
                } else if (j == currentElement) {
                    currentElement = i;
                }
            }
            doSort(vector, startIndex, currentElement);
            doSort(vector, currentElement + 1, endIndex);
        }
    }

    //    complexity:  best O(n log(n))    worst O(n log(n))
    public static Vector mergeSort(final Vector vector, int lowIndex, int higherIndex) {
        if (lowIndex < higherIndex) {
            int middle = (lowIndex + higherIndex) / 2;
            mergeSort(vector, lowIndex, middle);
            mergeSort(vector, middle + 1, higherIndex);
            merge(vector, lowIndex, middle, higherIndex);
        }
        return vector;
    }

    private static void merge(Vector vector, int lowIndex, int middle, int higherIndex) {
        int n1 = middle - lowIndex + 1;
        int n2 = higherIndex - middle;

        double[] left = new double[n1];
        double[] right = new double[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = vector.getElement(lowIndex + i);
        }
        for (int j = 0; j < n2; j++) {
            right[j] = vector.getElement(middle + 1 + j);
        }

        int i = 0;
        int j = 0;
        int k = lowIndex;

        while (i < n1 && j < n2) {
            if (left[i] < right[j]) {
                vector.setElement(left[i], k);
                i++;
            } else {
                vector.setElement(right[j], k);
                j++;
            }
            k++;
        }

        while (i < n1) {
            vector.setElement(left[i], k);
            i++;
            k++;
        }

        while (j < n2) {
            vector.setElement(right[j], k);
            j++;
            k++;
        }
    }

}
