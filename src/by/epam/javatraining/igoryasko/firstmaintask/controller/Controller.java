package by.epam.javatraining.igoryasko.firstmaintask.controller;

import by.epam.javatraining.igoryasko.firstmaintask.model.logic.data.Matrix;
import by.epam.javatraining.igoryasko.firstmaintask.model.logic.data.Vector;
import by.epam.javatraining.igoryasko.firstmaintask.model.logic.matrixlogic.MatrixWorker;
import by.epam.javatraining.igoryasko.firstmaintask.model.logic.vectorlogic.VectorWorker;
import by.epam.javatraining.igoryasko.firstmaintask.util.Creator;
import by.epam.javatraining.igoryasko.firstmaintask.util.Initializer;
import by.epam.javatraining.igoryasko.firstmaintask.view.ConsoleView;

/**
 * Created by igoryasko on 4/1/19.
 *
 * @author igoryasko
 */

public class Controller {

    public static void main(String[] args) {

        Vector vector = Creator.createVector(0);
        Matrix matrix = Creator.createMatrix(2, 2);

        Initializer.initializeVector(vector, 1, 2, 3, 4, 5, 6, 7);
        Initializer.initializeMatrixRandom(matrix);
        ConsoleView.print(VectorWorker.checkAscendingOrder(vector));
        ConsoleView.print(MatrixWorker.transpose(matrix));

    }

}
