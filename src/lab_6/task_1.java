package lab_6;

public class task_1 {
    //Метод перетворення двійкового числа в десяткове
    public static int binaryStringToInt(String s) {

        //Перевірка на null
        if (s == null) {
            throw new NullPointerException("Рядок не може бути null");
        }

        // Перевірка на порожній рядок
        if (s.isEmpty()) {
            throw new IllegalArgumentException("Рядок не може бути порожнім");
        }

        //Перевірка чи рядок містить тільки 0 та 1
        for (char c : s.toCharArray()) {
            if (c != '0' && c != '1') {
                throw new IllegalArgumentException(
                        "Рядок повинен містити тільки 0 та 1"
                );
            }
        }

        //Перетворення двійкового числа в десяткове
        try {
            return Integer.parseInt(s, 2);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(
                    "Число виходить за межі типу int"
            );
        }
    }

    public static void main(String[] args) {

        //Правильні приклади
        System.out.println(binaryStringToInt("10101")); // 21
        System.out.println(binaryStringToInt("1111"));   // 15
        System.out.println(binaryStringToInt("1000"));   // 8
        System.out.println(binaryStringToInt("000101")); // 5

        //Перевірка неправильних аргументів
        try {
            System.out.println(binaryStringToInt("10201"));
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: " + e.getMessage());
        }

        try {
            System.out.println(binaryStringToInt(""));
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: " + e.getMessage());
        }

        try {
            System.out.println(binaryStringToInt(null));
        } catch (NullPointerException e) {
            System.out.println("Помилка: " + e.getMessage());
        }

        try {
            System.out.println(binaryStringToInt("11111111111111111111111111111111"));
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}
