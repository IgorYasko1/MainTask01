package by.epam.javatraining.igoryasko.firstmaintask.model.logic.matrixlogic;

import by.epam.javatraining.igoryasko.firstmaintask.model.logic.data.Matrix;
import org.junit.Test;

import static by.epam.javatraining.igoryasko.firstmaintask.model.logic.vectorlogic.VectorWorkerTest.delta;
import static org.junit.Assert.*;

/**
 * Created by igoryasko on 4/1/19.
 *
 * @author igoryasko
 */

public class MatrixWorkerTest {

    @Test
    public void searchMinElement() {
        Matrix matrix = new Matrix(new double[][]{{2, 2, 0} , {1, 2, 9}});
        double expected = 0;
        assertEquals(expected, MatrixWorker.findMinElement(matrix), delta);
    }

    @Test
    public void searchMaxElement() {
        Matrix matrix = new Matrix(new double[][]{{2, 2, 0} , {1, 2, 9}});
        double expected = 9;
        assertEquals(expected, MatrixWorker.findMaxElement(matrix), delta);
    }

    @Test
    public void isSymmetrical() {
        boolean expected = true;
        Matrix matrix = new Matrix(new double[][]{
                                        {4, 6, 9, 9},
                                        {6, 6, 5, 5},
                                        {9, 5, 8, 8},
                                        {9, 5, 8, 7}
        });
        assertEquals(expected, MatrixWorker.isSymmetrical(matrix));
    }

    @Test
    public void transport() {

//        assertEquals(expected, MatrixWorker.transport(matrix));
    }

}
