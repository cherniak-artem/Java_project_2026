package lab_4;

import java.util.Arrays;

public class task_1 {

    //Сортування вибором (Selection Sort)
    public static void selectionSort(byte[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            byte temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    //Головний метод програми
    public static void main(String[] args) {
        byte[] array = {12, 9, -5, 25, -12, 6, 0};

        System.out.println("Початковий масив:");
        System.out.println(Arrays.toString(array));

        selectionSort(array);

        System.out.println("Масив після Selection Sort:");
        System.out.println(Arrays.toString(array));
    }
}