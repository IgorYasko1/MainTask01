package by.epam.javatraining.igoryasko.firstmaintask.model.logic.matrixlogic;

import by.epam.javatraining.igoryasko.firstmaintask.model.logic.data.Matrix;

/**
 * Created by igoryasko
 *
 * @author igoryasko
 *
 * Class MatrixLogic implements methods for Matrix
 * searchMinElement, searchMaxElement,
 * isSymmetrical, transport
 */

public class MatrixLogic {

    public static double searchMinElement(Matrix matrix) {
        double minIndex = matrix.getElement(0, 0);
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.innerSize(i); j++) {
                if (minIndex > matrix.getElement(i, j)){
                    minIndex = matrix.getElement(i, j);
                }
            }
        }
        return minIndex;
    }

    public static double searchMaxElement(Matrix matrix) {
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
        double[][] mas = {{2, 2, 3} ,
                            {1, 2, 3}};
        Matrix matrix = new Matrix(mas);
//        System.out.println(MatrixLogic.searchMinElement(matrix));
//        System.out.println(MatrixLogic.searchMaxElement(matrix));
        System.out.println(MatrixLogic.findLocalMin(matrix));
//        System.out.println(mas.length);
//        System.out.println(mas[1].length);
//        System.out.println(MatrixLogic.isSymmetrical(matrix));
//        MatrixLogic.transport(matrix);

//        System.out.println("Начальная матрица");
//        System.out.println("------");
//        for (int i = 0; i < matrix.size(); i++) {
//            for (int j = 0; j < matrix.innerSize(i); j++) {
//                System.out.printf("%f", matrix.getElement(i, j));
//            }
//            System.out.println();
//        }

    }

    public static double findLocalMin(Matrix matrix){
        double localMin = -1;
        for (int i = 0; i < matrix.size(); i++){
            for (int j = 0; j < matrix.innerSize(i) - 1; j++){
                if (matrix.getElement(i, j) < matrix.getElement(i, j + 1)
                    || matrix.getElement(i, j) < matrix.getElement(i + 1, j)){
                    localMin = matrix.getElement(i, j);
                }
            }
        }
        return localMin;
    }

    public static boolean isSymmetrical(Matrix matrix){
        boolean isSemmetry = true;

        for (int i = 0; i < matrix.size(); i++){
            for (int j = 0; j < matrix.innerSize(i); j++){
                if (matrix.size() != matrix.innerSize(i)){
                    isSemmetry = false;
                    break;
                }
                if (matrix.getElement(i, j) != matrix.getElement(j, i)){
                    isSemmetry = false;
                    break;
                }
            }
        }
        return isSemmetry;
    }

    public static void transport(Matrix matrix){
        for (int i = 0; i < matrix.size(); i++){
            for (int j = i + 1; j < matrix.size(); j++){
                double tmp = matrix.getElement(i, j);
                matrix.setElement(matrix.getElement(j, i) ,i, j);
                matrix.setElement(tmp ,j, i);
            }
        }
    }

}
