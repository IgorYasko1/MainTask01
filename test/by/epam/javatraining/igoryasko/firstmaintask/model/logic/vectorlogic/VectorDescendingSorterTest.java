package by.epam.javatraining.igoryasko.firstmaintask.model.logic.vectorlogic;

import by.epam.javatraining.igoryasko.firstmaintask.model.logic.data.Vector;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by igoryasko on 4/1/19.
 *
 * @author igoryasko
 */

@RunWith(Parameterized.class)
public class VectorDescendingSorterTest {
    private static double delta = 0.00000000000001;

    private Vector vector;
    private double[] expected;

    public VectorDescendingSorterTest(Vector vector, double[] expected) {
        this.vector = vector;
        this.expected = expected;
    }

    @Parameters
    public static Collection<Object[]> getParameters() {
        return Arrays.asList(new Object[][]{
                {new Vector(5, 2, 1, 4, 3), new double[]{5, 4, 3, 2, 1}},
                {new Vector(-3, 16, 0, 2, 24), new double[]{24, 16, 2, 0, -3}},
                {new Vector(45, -23, 9, 99, 0), new double[]{99, 45, 9, 0, -23}},
        });
    }

    @Test
    public void bubbleSortDescending() {
        assertArrayEquals(VectorDescendingSorter.bubbleSortDescending(vector).toArray(), expected, delta);
    }

    @Test
    public void insertionSortDescending() {
        assertArrayEquals(VectorDescendingSorter.insertionSortDescending(vector).toArray(), expected, delta);
    }

    @Test
    public void selectionDescending() {
        assertArrayEquals(VectorDescendingSorter.selectionDescending(vector).toArray(), expected, delta);
    }

}
