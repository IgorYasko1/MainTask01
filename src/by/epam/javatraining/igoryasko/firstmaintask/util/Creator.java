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

    public static Vector createVector(){
        return new Vector();
    }

    public static Matrix createMatrix(){
        return new Matrix();
    }

    public static void main(String[] args) {

        Creator.createMatrix();

    }

}
