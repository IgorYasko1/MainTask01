package by.epam.javatraining.igoryasko.firstmaintask.model.logic.vectorlogic;

import by.epam.javatraining.igoryasko.firstmaintask.model.logic.data.Vector;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by igoryasko on 4/1/19.
 *
 * @author igoryasko
 */

public class VectorLogicTest {
    private static Vector vector = new Vector(3, 9, 15, 27, 54);
    private static double delta = 0.00000000000001;

    @Test
    public void searchMinElement() {
        double expected = 3;
        assertEquals(expected, VectorLogic.searchMinElement(vector), delta);
    }

    @Test
    public void searchMaxElement() {
        double expected = 54;
        assertEquals(expected, VectorLogic.searchMaxElement(vector), delta);
    }

    @Test
    public void findArithmeticAverage() {
        double expected = 21.6;
        assertEquals(expected, VectorLogic.findArithmeticAverage(vector), delta);
    }

    @Test
    public void findArithmeticAverageEmptyVector() {
        Vector vector = new Vector();
        double expected = 0;
        assertEquals(expected, VectorLogic.findArithmeticAverage(vector), delta);
    }

    @Test
    public void findGeometricAverageEmptyVector() {
        Vector vector = new Vector();
        double expected = 0;
        assertEquals(expected, VectorLogic.findGeometricAverage(vector), delta);
    }

    @Test(expected = ArithmeticException.class)
    public void findGeometricAverageNegativeValue() {
        Vector vector = new Vector(1, 2, 3, 0);
        double expected = 1.8171205928321397;
        assertEquals(expected, VectorLogic.findGeometricAverage(vector), delta);
    }

    @Test
    public void findGeometricAverage() {
        double expected = 14.264038732150023;
        assertEquals(expected, VectorLogic.findGeometricAverage(vector), delta);
    }

    @Test
    public void findLocalMin() {
        double expected = 3;
        assertEquals(expected, VectorLogic.findLocalMin(vector), delta);
    }

    @Test
    public void findLocalMax() {
        double expected = 9;
        assertEquals(expected, VectorLogic.findLocalMax(vector), delta);
    }

    @Test
    public void isAscending() {
        if (!VectorLogic.checkAscendingOrder(vector)){
            Assert.fail();
        }
    }

    @Test
    public void isDescending() {
        if (VectorLogic.checkDescendingOrder(vector)){
            Assert.fail();
        }
    }


}
