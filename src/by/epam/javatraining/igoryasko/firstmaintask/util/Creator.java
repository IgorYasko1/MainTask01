package by.epam.javatraining.igoryasko.firstmaintask.util;

import by.epam.javatraining.igoryasko.firstmaintask.model.logic.data.Matrix;
import by.epam.javatraining.igoryasko.firstmaintask.model.logic.data.Vector;

/**
 * Created by igoryasko on 4/1/19.
 *
 * @author igoryasko
 *
 */

public class Creator {

    public static Vector createVector(final int size){
        return new Vector(size);
    }

    public static Matrix createMatrix(final int row, final int column){
        return new Matrix(row, column);
    }

}
