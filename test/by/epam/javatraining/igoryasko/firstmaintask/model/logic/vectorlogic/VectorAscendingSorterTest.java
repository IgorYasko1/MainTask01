package by.epam.javatraining.igoryasko.firstmaintask.model.logic.vectorlogic;

import by.epam.javatraining.igoryasko.firstmaintask.model.logic.data.Vector;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static by.epam.javatraining.igoryasko.firstmaintask.model.logic.vectorlogic.VectorWorkerTest.delta;
import static org.junit.Assert.assertArrayEquals;

/**
 * Created by igoryasko on 4/1/19.
 *
 * @author igoryasko
 */

@RunWith(Parameterized.class)
public class VectorAscendingSorterTest {

    private Vector vector;
    private double[] expected;

    public VectorAscendingSorterTest(Vector vector, double[] expected) {
        this.vector = vector;
        this.expected = expected;
    }

    @Parameters
    public static Collection<Object[]> getParameters() {
        return Arrays.asList(new Object[][]{
                {new Vector(new double[]{5, 2, 1, 4, 3}), new double[]{1, 2, 3, 4, 5}},
                {new Vector(new double[]{-3, 16, 0, 2, 24}), new double[]{-3, 0, 2, 16, 24}},
                {new Vector(new double[]{45, -23, 9, 99, 0}), new double[]{-23, 0, 9, 45, 99}},
        });
    }

    @Test
    public void bubbleSortAscending() {
        assertArrayEquals(VectorAscendingSorter.bubbleSortAscending(vector).toArray(), expected, delta);
    }

    @Test
    public void insertionSortAscending() {
        assertArrayEquals(VectorAscendingSorter.insertionSortAscending(vector).toArray(), expected, delta);
    }

    @Test
    public void selectionSortAscending() {
        assertArrayEquals(VectorAscendingSorter.selectionSortAscending(vector).toArray(), expected, delta);
    }

    @Test
    public void quickSort() {
        assertArrayEquals(VectorAscendingSorter.quickSort(vector).toArray(), expected, delta);
    }

    @Test
    public void mergeSort() {
        assertArrayEquals(VectorAscendingSorter.mergeSort(vector, 0, vector.size() - 1).toArray(), expected, delta);
    }

    @Test
    public void reverse() {
        Vector vector = new Vector(new double[]{5, 2, 1, 4, 3});
        double[] expected = new double[]{3, 4, 1, 2, 5};
        assertArrayEquals(VectorAscendingSorter.reverse(vector).toArray(), expected, delta);
    }

}
