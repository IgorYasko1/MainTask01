package by.epam.javatraining.igoryasko.firstmaintask.view;

import by.epam.javatraining.igoryasko.firstmaintask.model.logic.data.Matrix;
import by.epam.javatraining.igoryasko.firstmaintask.model.logic.data.Vector;

/**
 * Created by igoryasko on 4/1/19.
 *
 * @author igoryasko
 *
 */

public class ConsoleView {

    public static void printMessage(String message){
        System.out.println(message);
    }

    public static void printVector(Vector vector){
        System.out.println(vector.toString());
    }

    public static void printVectorAndMessage(String msg, Vector vector){
        System.out.println(msg);
        ConsoleView.printVector(vector);
    }

    public static void printMatrix(Matrix matrix){
        System.out.println(matrix.toString());
    }

    public static void printMatrixAndMessage(String msg, Matrix matrix){
        System.out.println(msg);
        ConsoleView.printMatrix(matrix);
    }


}
