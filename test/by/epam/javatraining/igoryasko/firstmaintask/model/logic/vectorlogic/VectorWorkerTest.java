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

public class VectorWorkerTest {
    private static Vector vector = new Vector(3, 9, 15, 27, 54);
    private static double delta = 0.00000000000001;

    @Test
    public void searchMinElement() {
        double expected = 3;
        assertEquals(expected, VectorWorker.findMinElement(vector), delta);
    }

    @Test
    public void searchMaxElement() {
        double expected = 54;
        assertEquals(expected, VectorWorker.findMaxElement(vector), delta);
    }

    @Test
    public void findArithmeticAverage() {
        double expected = 21.6;
        assertEquals(expected, VectorWorker.countArithmeticMean(vector), delta);
    }

    @Test
    public void findArithmeticAverageEmptyVector() {
        Vector vector = new Vector();
        double expected = 0;
        assertEquals(expected, VectorWorker.countArithmeticMean(vector), delta);
    }

    @Test
    public void findGeometricAverageEmptyVector() {
        Vector vector = new Vector();
        double expected = 0;
        assertEquals(expected, VectorWorker.countGeometricMean(vector), delta);
    }

    @Test(expected = ArithmeticException.class)
    public void findGeometricAverageNegativeValue() {
        Vector vector = new Vector(1, 2, 3, 0);
        double expected = 1.8171205928321397;
        assertEquals(expected, VectorWorker.countGeometricMean(vector), delta);
    }

    @Test
    public void findGeometricAverage() {
        double expected = 14.264038732150023;
        assertEquals(expected, VectorWorker.countGeometricMean(vector), delta);
    }

    @Test
    public void findLocalMin() {
        Vector vector = new Vector(0, 0, 1, 0, 3, 4);
        int expected = 3;
        assertEquals(expected, VectorWorker.findLocalMin(vector), delta);
    }

    @Test
    public void findLocalMax() {
        Vector vector = new Vector(0, 0, 1, 4, 3, 4);
        int expected = 3;
        assertEquals(expected, VectorWorker.findLocalMax(vector), delta);
    }

    @Test
    public void isAscending() {
        if (!VectorWorker.checkAscendingOrder(vector)){
            Assert.fail();
        }
    }

    @Test
    public void isDescending() {
        if (VectorWorker.checkDescendingOrder(vector)){
            Assert.fail();
        }
    }


}
