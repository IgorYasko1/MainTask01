package by.epam.javatraining.igoryasko.firstmaintask.controller;

import by.epam.javatraining.igoryasko.firstmaintask.model.logic.data.Matrix;
import by.epam.javatraining.igoryasko.firstmaintask.model.logic.data.Vector;
import by.epam.javatraining.igoryasko.firstmaintask.model.logic.vectorlogic.VectorLogic;
import by.epam.javatraining.igoryasko.firstmaintask.view.ConsoleView;

/**
 * Created by igoryasko on 4/1/19.
 *
 * @author igoryasko
 *
 */

public class Controller {

    public static void main(String[] args) {

        ConsoleView.printLine();
        ConsoleView.printVector(new Vector(5));
        ConsoleView.printLine();
        ConsoleView.printMatrix(new Matrix(2, 2));
        ConsoleView.printLine();
        ConsoleView.print("Arithmetical mean equals: " + VectorLogic.findArithmeticAverage(new Vector(3)));

    }

}
