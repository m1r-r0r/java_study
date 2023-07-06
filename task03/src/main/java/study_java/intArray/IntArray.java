package study_java.intArray;

import java.util.Arrays;
import java.util.Scanner;

public class IntArray {
    private int[] intArray = new int[20];
    private int minValIndex = 0;
    private int maxValIndex = 0;
    public IntArray() {
        for(int i=0; i < 20; i++) {
            intArray[i] = (int) (Math.random() * 21) - 10;;
            if(intArray[i] > intArray[maxValIndex]) maxValIndex = i;
            if(intArray[i] < intArray[minValIndex]) minValIndex = i;
        }
    }
    public void reverseIntArray() {
        int tmp = intArray[minValIndex];
        intArray[minValIndex] = intArray[maxValIndex];
        intArray[maxValIndex] = tmp;
    }

    public void printIntArray() {
        System.out.println(Arrays.toString(intArray));
    }

}
