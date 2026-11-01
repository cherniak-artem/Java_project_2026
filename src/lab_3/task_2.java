package lab_3;

import java.util.Arrays;
import java.util.Random;

public class task_2 {

    //Генерація випадкового масиву
    public static int[] generateRandomArray() {
        Random random = new Random();

        //Мінімум 3 елементи для виконання завдання
        int length = random.nextInt(8) + 3;

        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(41) - 20;
        }

        return array;
    }

    //Знаходження середнього арифметичного
    public static double findAverage(int[] array) {

        if (array == null) {
            throw new NullPointerException("Масив не може бути null!");
        }

        if (array.length < 3) {
            throw new IllegalArgumentException(
                    "Масив повинен містити щонайменше 3 елементи!");
        }

        int max = array[0];
        int thirdElement = array[2];

        // Цикл for-each
        for (int element : array) {

            if (element > max) {
                max = element;
            }
        }

        return ((double) max + thirdElement) / 2;
    }

    //Точка входу
    public static void main(String[] args) {

        System.out.println("ЗАВДАННЯ №41");

        // Генерація та перевірка 5 масивів
        for (int i = 0; i < 5; i++) {

            int[] array = generateRandomArray();

            System.out.println("\nМасив: " + Arrays.toString(array));

            try {
                System.out.println("Середнє арифметичне: "
                        + findAverage(array));
            } catch (Exception e) {
                System.out.println("Помилка: " + e.getMessage());
            }
        }

        //Перевірка некоректних аргументів
        System.out.println("\nПеревірка помилкових аргументів:");

        try {
            findAverage(new int[]{5, 10});
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName()
                    + ": " + e.getMessage());
        }

        try {
            findAverage(null);
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName()
                    + ": " + e.getMessage());
        }
    }
}