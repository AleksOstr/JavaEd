// задайте одномерный массив и напишите программу, которая выполнит разворот массива

package JavaEd.Lesson2;

import java.util.Arrays;

public class Task1_array_reverse {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
