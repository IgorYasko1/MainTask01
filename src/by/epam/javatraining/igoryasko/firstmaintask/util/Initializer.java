package by.epam.javatraining.igoryasko.firstmaintask.util;

import by.epam.javatraining.igoryasko.firstmaintask.model.logic.data.Matrix;
import by.epam.javatraining.igoryasko.firstmaintask.model.logic.data.Vector;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by igoryasko on 4/1/19.
 *
 * @author igoryasko
 */

public class Initializer {

    public static Vector initializeVector(final Vector vector, final double... value) {
        for (int i = 0; i < vector.size() && i < value.length; i++) {
            vector.setElement(value[i], i);
        }
        return vector;
    }

    public static Vector initializeVectorRandom(final Vector vector) {
        for (int i = 0; i < vector.size(); i++) {
            vector.setElement(Initializer.generateRandom(), i);
        }
        return vector;
    }

    public static Vector initializeVectorFromFile(final Vector vector, final String path) {
        try (Scanner sc = new Scanner(Paths.get(path))) {
            int i = 0;
            while (sc.hasNextDouble()) {
                vector.setElement(sc.nextDouble(), i);
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return vector;
    }

    public static Matrix initializeMatrix(final Matrix matrix, final double... value) {
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.innerSize(i) && j < value.length; j++) {
                matrix.setElement(value[j], i, j);
            }
        }
        return matrix;
    }

    public static Matrix initializeMatrixRandom(final Matrix matrix) {
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.innerSize(i); j++) {
                matrix.setElement(Initializer.generateRandom(), i, j);
            }
        }
        return matrix;
    }

    private static double generateRandom() {
        Random random = new Random();
        return random.nextDouble() * 100;
    }

}
