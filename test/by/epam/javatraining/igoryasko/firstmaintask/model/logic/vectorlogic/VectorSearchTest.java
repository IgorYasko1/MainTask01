package by.epam.javatraining.igoryasko.firstmaintask.model.logic.vectorlogic;

import by.epam.javatraining.igoryasko.firstmaintask.model.logic.data.Vector;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by igoryasko on 4/1/19.
 *
 * @author igoryasko
 */

@RunWith(Parameterized.class)
public class VectorSearchTest {

    private Vector vector;
    private int expected;
    private int key;

    public VectorSearchTest(Vector vector, int expected, int key) {
        this.vector = vector;
        this.expected = expected;
        this.key = key;
    }

    @Parameters
    public static Collection<Object[]> getParameters() {
        return Arrays.asList(new Object[][]{
                {new Vector(-4, 0, 3, 15, 27, 54), 3, 15},
                {new Vector(-7, 0, 2, 22), 3, 22},
                {new Vector(-12, 1, 2, 5, 18), 0, -12}
        });
    }

    @Test
    public void linearSearch() {
        assertEquals(expected, VectorSearch.linearSearch(vector, key));
    }

    @Test
    public void binarySearch() {
        assertEquals(expected, VectorSearch.binarySearch(vector, key));
    }

    @Test
    public void linearSearchIncorrect() {
        int expectedDefault = -1;
        int incorrectKey = 99;
        assertEquals(expectedDefault, VectorSearch.linearSearch(vector, incorrectKey));
    }

    @Test
    public void binarySearchIncorrect() {
        int expectedDefault = -1;
        int incorrectKey = 4;
        assertEquals(expectedDefault, VectorSearch.binarySearch(vector, incorrectKey));
    }

}
