package lab_3;

import java.util.Arrays;
import java.util.Random;

public class task_3 {

    //Генерація випадкового масиву
    public static int[] generateRandomArray() {
        Random random = new Random();

        int length = random.nextInt(10) + 1;
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(41) - 20;
        }

        return array;
    }

    //Формування нового масиву
    public static long[] transformArray(int[] array) {

        if (array == null) {
            throw new NullPointerException("Масив не може бути null!");
        }

        if (array.length == 0) {
            throw new IllegalArgumentException("Масив порожній!");
        }

        long[] newArray = new long[array.length];

        for (int i = 0; i < array.length; i++) {

            if (array[i] < 0) {
                newArray[i] = -(long) array[i];
            }
            else if (array[i] > 0) {
                newArray[i] = (long) array[i] - 3;
            }
            else {
                newArray[i] = -2;
            }
        }

        return newArray;
    }

    //Точка входу
    public static void main(String[] args) {

        System.out.println("ЗАВДАННЯ №64");

        // Генерація та перевірка 5 масивів
        for (int i = 0; i < 5; i++) {

            int[] array = generateRandomArray();

            System.out.println("\nПочатковий масив: "
                    + Arrays.toString(array));

            try {
                long[] result = transformArray(array);

                System.out.println("Новий масив: "
                        + Arrays.toString(result));

            } catch (Exception e) {
                System.out.println("Помилка: " + e.getMessage());
            }
        }

        //Перевірка некоректних аргументів
        System.out.println("\nПеревірка помилкових аргументів:");

        try {
            transformArray(new int[]{});
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName()
                    + ": " + e.getMessage());
        }

        try {
            transformArray(null);
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName()
                    + ": " + e.getMessage());
        }
    }
}
