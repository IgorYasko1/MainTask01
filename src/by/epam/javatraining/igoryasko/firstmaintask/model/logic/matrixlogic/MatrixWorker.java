package by.epam.javatraining.igoryasko.firstmaintask.model.logic.matrixlogic;

import by.epam.javatraining.igoryasko.firstmaintask.model.logic.data.Matrix;

/**
 * Created by igoryasko on 4/1/19.
 *
 * @author igoryasko
 * <p>
 * Class MatrixWorker implements methods for Matrix
 * findMinElement, findMaxElement,
 * isSymmetrical, transport
 */

public class MatrixWorker {

    public static double findMinElement(Matrix matrix) {
        double minIndex = matrix.getElement(0, 0);
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.innerSize(i); j++) {
                if (minIndex > matrix.getElement(i, j)) {
                    minIndex = matrix.getElement(i, j);
                }
            }
        }
        return minIndex;
    }

    public static double findMaxElement(Matrix matrix) {
        double maxIndex = matrix.getElement(0, 0);
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.innerSize(i); j++) {
                if (maxIndex < matrix.getElement(i, j)) {
                    maxIndex = matrix.getElement(i, j);
                }
            }
        }
        return maxIndex;
    }

    public static boolean isSymmetrical(Matrix matrix) {
        boolean isSemmetry = true;

        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.innerSize(i); j++) {
                if (matrix.size() != matrix.innerSize(i)) {
                    isSemmetry = false;
                    break;
                }
                if (matrix.getElement(i, j) != matrix.getElement(j, i)) {
                    isSemmetry = false;
                    break;
                }
            }
        }
        return isSemmetry;
    }

    public static Matrix transpose(Matrix matrix) {
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = i + 1; j < matrix.size(); j++) {
                double tmp = matrix.getElement(i, j);
                matrix.setElement(matrix.getElement(j, i), i, j);
                matrix.setElement(tmp, j, i);
            }
        }
        return matrix;
    }

}
