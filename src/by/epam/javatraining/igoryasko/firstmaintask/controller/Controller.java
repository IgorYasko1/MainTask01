package by.epam.javatraining.igoryasko.firstmaintask.controller;

import by.epam.javatraining.igoryasko.firstmaintask.model.logic.data.Matrix;
import by.epam.javatraining.igoryasko.firstmaintask.model.logic.data.Vector;
import by.epam.javatraining.igoryasko.firstmaintask.model.logic.vectorlogic.VectorWorker;
import by.epam.javatraining.igoryasko.firstmaintask.util.Creator;
import by.epam.javatraining.igoryasko.firstmaintask.util.Initializer;
import by.epam.javatraining.igoryasko.firstmaintask.view.ConsoleView;

/**
 * Created by igoryasko on 4/1/19.
 *
 * @author igoryasko
 *
 */

public class Controller {

    public static void main(String[] args) {

        Vector vector = Creator.createVector();
        Matrix matrix = Creator.createMatrix();

        Initializer.initializeVector(vector, 1, 2, 3, 4, 5, 6, 7);
        ConsoleView.printVector(vector);
        Initializer.initializeMatrix(matrix, new double[][]{{1}, {1, 2}});
        ConsoleView.printMatrixAndMessage("Matrix is ", matrix);

//        ConsoleView.printVector(VectorWorker.checkAscendingOrder(vector));

        System.out.println(VectorWorker.checkAscendingOrder(vector));

//        ConsoleView.printLine();
//        ConsoleView.printVector(new Vector(5));
//        ConsoleView.printLine();
//        ConsoleView.printMatrix(new Matrix(2, 2));
//        ConsoleView.printLine();
//        ConsoleView.print("Arithmetical mean equals: " + VectorWorker.countArithmeticMean(new Vector(3)));

    }

}
