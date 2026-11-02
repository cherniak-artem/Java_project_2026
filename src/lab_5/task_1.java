package lab_5;

public class task_1 {

    //Метод перетворення двійкового числа в int
    public static int binaryStringToInt(String s) {

        //Перевірка на null
        if (s == null) {
            throw new NullPointerException("Рядок не може бути null");
        }

        //Перевірка на порожній рядок
        if (s.isEmpty()) {
            throw new IllegalArgumentException("Рядок не може бути порожнім");
        }

        //Перевірка допустимих символів
        if (!s.matches("[01]+")) {
            throw new IllegalArgumentException(
                    "Дозволені лише символи 0 та 1"
            );
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

    //Точка входу в програму
    public static void main(String[] args) {

        String[] testValues = {
                "10101",
                "1111",
                "10000000",
                "000101",
                "10201",
                "",
                "11111111111"
        };

        for (String value : testValues) {
            try {
                System.out.println(
                        "Вхідне значення: \"" + value +
                                "\" -> Результат: " + binaryStringToInt(value)
                );
            } catch (IllegalArgumentException e) {
                System.out.println(
                        "Помилка для \"" + value + "\": " + e.getMessage()
                );
            }
        }

        //Перевірка null
        try {
            binaryStringToInt(null);
        } catch (NullPointerException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}