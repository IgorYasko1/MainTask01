package by.epam.javatraining.igoryasko.firstmaintask.model.logic.data;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by igoryasko on 4/1/19.
 *
 * @author igoryasko
 *
 */

public class Vector {

    private final double[] elementData;

    public Vector(final int size){
        this.elementData = new double[size];
        this.fillElementDataRandom();
    }

    public Vector(final double... value){
        this.elementData = new double[value.length];
        this.fillElementData(value);
    }

    private void fillElementDataRandom(){
        Random random = new Random();
        for (int i = 0; i < elementData.length; i++){
            elementData[i] = random.nextDouble() * 100;
        }
    }

    private void fillElementData(final double... value){
        System.arraycopy(value, 0, this.elementData, 0, value.length);
    }

    public void setElement(final double value, final int index){
        this.elementData[index] = value;
    }

    public double getElement(final int index){
        return this.elementData[index];
    }

    public int size(){
        return elementData.length;
    }

    public double[] toArray(){
        return elementData;
    }

    public void print(){
        Arrays.stream(elementData).forEach(x -> System.out.println(x));
    }

    public Vector(final String pathWithFileName, final int length){
        this.elementData = new double[length];
        this.fillElementDataFromFile(pathWithFileName);
    }

    private void fillElementDataFromFile(String path){
        try(Scanner sc = new Scanner(Paths.get(path))){
            int i = 0;
            while (sc.hasNext()){
                this.elementData[i] = sc.nextDouble();
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String path = "C:\\Users\\igory\\IdeaProjects\\MainTask\\file\\test.txt";
//        try {
//            Files.lines(Paths.get("C:\\Users\\igory\\IdeaProjects\\MainTask\\file\\test.txt")).forEach(System.out::println);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        Vector vector = new Vector(path, 5);
        vector.print();
    }


}
