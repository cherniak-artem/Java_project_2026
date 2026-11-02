package lab_5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task_2 {

    //Метод підрахунку кількості слів у реченні
    public static int countWords(String sentence) {

        //Перевірка на null
        if (sentence == null) {
            throw new NullPointerException(
                    "Речення не може бути null"
            );
        }

        //Перевірка на порожній рядок
        if (sentence.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Речення не може бути порожнім"
            );
        }

        //Шаблон для пошуку слів, які містять лише літери
        Pattern pattern = Pattern.compile(
                "(?<![A-Za-z0-9])[A-Za-z]+(?![A-Za-z0-9])"
        );

        Matcher matcher = pattern.matcher(sentence);

        int count = 0;

        //Вичислення знайдених слів
        while (matcher.find()) {
            count++;
        }

        return count;
    }

    //Точка входу
    public static void main(String[] args) {

        String[] testValues = {
                "Java programming language",
                "The user with the nickname koala757677 this month left 3 times more comments than the user with the nickname croco181dile181920 4 months ago",
                "98 76 54 32 10",
                "Hello123 world456 Java",
                "One two three",
                ""
        };

        for (String value : testValues) {
            try {
                System.out.println(
                        "Речення: \"" + value +
                                "\" -> Кількість слів: " + countWords(value)
                );
            } catch (IllegalArgumentException e) {
                System.out.println(
                        "Помилка: " + e.getMessage()
                );
            }
        }

        //Перевірка null
        try {
            countWords(null);
        } catch (NullPointerException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}