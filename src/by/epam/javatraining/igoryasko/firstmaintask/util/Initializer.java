package by.epam.javatraining.igoryasko.firstmaintask.util;

import by.epam.javatraining.igoryasko.firstmaintask.model.logic.data.Matrix;
import by.epam.javatraining.igoryasko.firstmaintask.model.logic.data.Vector;

/**
 * Created by igoryasko on 4/1/19.
 *
 * @author igoryasko
 *
 */

public class Initializer {

    public static void initializeVector(Vector vector, double... numbers){
        vector.setElementData(numbers);
    }

    public static void initializeMatrix(Matrix matrix, double[][] numbers){
        matrix.setElementData(numbers);
    }

    public static void main(String[] args) {



    }

}
