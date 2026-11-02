package lab_4;

import java.util.Arrays;

public class task_2 {

    //Сортування вставками (Insertion Sort)
    public static void insertionSort(byte[] arr) {
        for (int i = 1; i < arr.length; i++) {
            byte key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    //Головний метод програми
    public static void main(String[] args) {
        byte[] array = {21, -5, 7, 0, 25, -14, 3};

        System.out.println("Початковий масив:");
        System.out.println(Arrays.toString(array));

        insertionSort(array);

        System.out.println("Масив після Insertion Sort:");
        System.out.println(Arrays.toString(array));
    }
}
