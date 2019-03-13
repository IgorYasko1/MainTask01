package by.epam.javatraining.igoryasko.firstmaintask.model.logic.vectorlogic;

import by.epam.javatraining.igoryasko.firstmaintask.model.logic.data.Vector;

/**
 * Created by igoryasko on 4/1/19.
 *
 * @author igoryasko
 *
 * Class VectorLogic implements methods for Vector
 * arithmetic and geometric mean,
 * searchMinElement, searchMaxElement
 * checkAscendingOrder, checkDescendingOrder
 * findLocalMin, findLocalMax
 */

public class VectorLogic {

    public static double searchMinElement(Vector vector){
        double minIndex = vector.getElement(0);
        for (int i = 1; i < vector.size(); i++){
            if (minIndex > vector.getElement(i)){
                minIndex = vector.getElement(i);
            }
        }
        return minIndex;
    }

    public static double searchMaxElement(Vector vector){
        double maxIndex = vector.getElement(0);
        for (int i = 1; i < vector.size(); i++){
            if (maxIndex < vector.getElement(i)){
                maxIndex = vector.getElement(i);
            }
        }
        return maxIndex;
    }

    public static double findArithmeticAverage(Vector vector){
        if (vector.size() == 0) {
            return 0;
        }

        double result = 0;
        for (int i = 0; i < vector.size(); i++){
            result += vector.getElement(i);
        }
        result /= vector.size();
        return result;
    }

    public static double findGeometricAverage(Vector vector){
        if (vector.size() == 0){
            return 0;
        }

        double result = 1;
        for (int i = 0; i < vector.size(); i++){
            if (vector.getElement(i) <= 0){
                throw new ArithmeticException("Geometric mean could be calculated only for positive numbers.");
            }
            result *= vector.getElement(i);
        }
        result = Math.pow(result, 1.0 / vector.size());
        return result;
    }

    public static boolean checkAscendingOrder(Vector vector){
        for (int i = 0; i < vector.size() - 1; i++){
            if (vector.getElement(i) > vector.getElement(i + 1)){
                return false;
            }
        }
        return true;
    }

    public static boolean checkDescendingOrder(Vector vector){
        for (int i = 0; i < vector.size() - 1; i++){
            if (vector.getElement(i) < vector.getElement(i + 1)){
                return false;
            }
        }
        return true;
    }

    public static double findLocalMin(Vector vector){
        if (vector.size() <= 0){
            return -1;
        }
        double localMin = -1;
        for (int i = 0; i < vector.size() - 1; i++){
            if (vector.getElement(i) < vector.getElement(i + 1)){
                localMin = vector.getElement(i);
                break;
            }
            if (vector.getElement(i) > vector.getElement(i + 1)){
                localMin = vector.getElement(i + 1);
                break;
            }
        }
        return localMin;
    }

    public static double findLocalMax(Vector vector){
        if (vector.size() <= 0){
            return -1;
        }
        double localMax = -1;
        for (int i = 0; i < vector.size() - 1; i++){
            if (vector.getElement(i) < vector.getElement(i + 1)){
                localMax = vector.getElement(i + 1);
                break;
            }
            if (vector.getElement(i) > vector.getElement(i + 1)){
                localMax = vector.getElement(i);
                break;
            }
        }
        return localMax;
    }

}
