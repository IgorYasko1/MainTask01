package by.epam.javatraining.igoryasko.firstmaintask.model.logic.matrixlogic;

import by.epam.javatraining.igoryasko.firstmaintask.model.logic.data.Matrix;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by igoryasko on 4/1/19.
 *
 * @author igoryasko
 */

public class MatrixLogicTest {
    private static Matrix matrix = new Matrix(new double[][]{{2, 2, 0} , {1, 2, 9}});
    private static double delta = 0.000000000001;

    @Test
    public void searchMinElement() {
        double expected = 0;
        assertEquals(expected, MatrixLogic.searchMinElement(matrix), delta);
    }

    @Test
    public void searchMaxElement() {
        double expected = 9;
        assertEquals(expected, MatrixLogic.searchMaxElement(matrix), delta);
    }

}
