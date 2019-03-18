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

//    private void fillElementData(final double... value){
//        System.arraycopy(value, 0, this.elementData, 0, value.length);
//    }

    public static Vector initializeVectorHardcode(Vector vector, double... numbers) {
        vector.setElementData(numbers);
        return vector;
    }

    public static Vector initializeVectorRandom(Vector vector) {
        Random random = new Random();
        for (int i = 0; i < vector.size(); i++) {
            vector.setElement(random.nextDouble() * 100, i);
        }
        return vector;
    }

    public static Vector initializeVectorFromFile(Vector vector, final String path) {
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

//    public Matrix(final double... value){
//        this.elementData = new double[value.length][value.length];
//    }

    public static Matrix initializeMatrixRandom(Matrix matrix) {
        Random random = new Random();
        for (int i = 0; i < matrix.size(); i++){
            for (int j = 0; j < matrix.innerSize(i); j++){
                matrix.setElement(random.nextDouble() * 100, i, j);
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        Vector vector = new Vector();
        Matrix matrix = new Matrix(2, 2);
        String path = "C:\\Users\\igory\\IdeaProjects\\MainTask\\file\\test.txt";
//        Initializer.initializeVectorFromFile(vector, path);
        Initializer.initializeVectorHardcode(vector, 1, 2, 3, 4, 4, 0, 9, 0);
        Initializer.initializeMatrixRandom(matrix);
        System.out.println(vector);
        System.out.println(matrix);

    }

}
