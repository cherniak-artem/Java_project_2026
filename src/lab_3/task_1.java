package lab_3;

import java.util.Arrays;
import java.util.Random;

public class task_1 {

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

    //Знаходження суми максимального та мінімального елементів
    public static long findSumOfMinMax(int[] array) {

        if (array == null) {
            throw new NullPointerException("Масив не може бути null!");
        }

        if (array.length == 0) {
            throw new IllegalArgumentException("Масив порожній!");
        }

        int min = array[0];
        int max = array[0];

        //Цикл for
        for (int i = 1; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
            }

            if (array[i] > max) {
                max = array[i];
            }
        }

        return (long) min + max;
    }

    //Точка входу
    public static void main(String[] args) {

        System.out.println("ЗАВДАННЯ №11");

        // Генерація та перевірка 5 масивів
        for (int i = 0; i < 5; i++) {

            int[] array = generateRandomArray();

            System.out.println("\nМасив: " + Arrays.toString(array));

            try {
                System.out.println("Сума min і max: "
                        + findSumOfMinMax(array));
            } catch (Exception e) {
                System.out.println("Помилка: " + e.getMessage());
            }
        }

        //Перевірка некоректних аргументів
        System.out.println("\nПеревірка помилкових аргументів:");

        try {
            findSumOfMinMax(new int[]{});
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName()
                    + ": " + e.getMessage());
        }

        try {
            findSumOfMinMax(null);
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName()
                    + ": " + e.getMessage());
        }
    }
}