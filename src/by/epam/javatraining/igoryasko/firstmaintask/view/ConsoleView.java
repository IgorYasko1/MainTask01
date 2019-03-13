package by.epam.javatraining.igoryasko.firstmaintask.view;

import by.epam.javatraining.igoryasko.firstmaintask.model.logic.data.Matrix;
import by.epam.javatraining.igoryasko.firstmaintask.model.logic.data.Vector;

public class ConsoleView {

    public static void printMessage(String message){
        System.out.println(message);
    }

    public static void printVector(Vector vector){
        for (double i : vector.toArray()) {
            System.out.println(i);
        }
    }

    public static void printMatrix(Matrix matrix){
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.innerSize(i); j++) {
                System.out.println(matrix.getElement(i, j));
            }
            System.out.println();
        }
    }



}
