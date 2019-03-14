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

    public static void print(String message){
        System.out.println(message);
    }

    public static void printLine(){
        System.out.println("--------------------------------------------------------");
    }

    public static void printVector(Vector vector){
        for (double i : vector.toArray()) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printVectorAndMessage(String msg, Vector vector){
        System.out.println(msg + " ");
        ConsoleView.printVector(vector);
    }

    public static void printMatrix(Matrix matrix){
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.innerSize(i); j++) {
                System.out.print(matrix.getElement(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static void printMatrixAndMessage(String msg, Matrix matrix){
        System.out.println(msg + " ");
        ConsoleView.printMatrix(matrix);
    }


}
