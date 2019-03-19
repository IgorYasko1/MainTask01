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

    public static void main(String[] args) {
        double[][] mas = {{2, 1, 3},
                {4, 2, 3}};
        Matrix matrix = new Matrix(mas);
//        System.out.println(MatrixWorker.findMinElement(matrix));
//        System.out.println(MatrixWorker.findMaxElement(matrix));
        System.out.println(MatrixWorker.findLocalMin(matrix));
        System.out.println(MatrixWorker.findLocalMax(matrix));
//        System.out.println(mas.length);
//        System.out.println(mas[1].length);
//        System.out.println(MatrixWorker.isSymmetrical(matrix));
//        MatrixWorker.transport(matrix);

    }

    public static double findLocalMin(Matrix matrix) {
        double localMin = -1;
        for (int i = 1; i < matrix.size() - 1; i++) {
            for (int j = 1; j < matrix.innerSize(i) - 1; j++) {
                if (matrix.getElement(i, j) < matrix.getElement(i - 1, j)
                        && matrix.getElement(i, j) < matrix.getElement(i + 1, j)
                        && matrix.getElement(i, j) < matrix.getElement(i, j - 1)
                        && matrix.getElement(i, j) < matrix.getElement(i, j + 1)) {
                    localMin = matrix.getElement(i - 1, j - 1);
                }
            }
        }
        return localMin;
    }

    public static double findLocalMax(Matrix matrix) {
        double localMax = -1;
        for (int i = 1; i < matrix.size() - 1; i++) {
            for (int j = 1; j < matrix.innerSize(i) - 1; j++) {
                if (matrix.getElement(i, j) > matrix.getElement(i - 1, j)
                        && matrix.getElement(i, j) > matrix.getElement(i + 1, j)
                        && matrix.getElement(i, j) > matrix.getElement(i, j - 1)
                        && matrix.getElement(i, j) > matrix.getElement(i, j + 1)) {
                    localMax = matrix.getElement(i - 1, j - 1);
                }
            }
        }
        return localMax;
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
