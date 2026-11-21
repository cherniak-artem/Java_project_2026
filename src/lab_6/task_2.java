package lab_6;

public class task_2 {

    //Метод підрахунку кількості слів у реченні
    public static int countWords(String s) {

        //Перевірка на null
        if (s == null) {
            throw new NullPointerException("Рядок не може бути null");
        }

        // Порожній рядок не містить слів
        if (s.isEmpty()) {
            return 0;
        }

        //Розділення речення на окремі частини
        String[] words = s.split("[^a-zA-Z]+");

        int count = 0;

        //Підрахунок слів, які складаються з літер
        for (String word : words) {
            if (!word.isEmpty()) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String[] tests = {
                "Hello world Java programming",
                "The user with nickname koala757677 left 3 comments",
                "Java2026 is a programming language",
                "One two three four five",
                "",
                "123 456 789",
                null
        };

        for (int i = 0; i < tests.length; i++) {

            System.out.print("Рядок " + (i + 1) + ": ");

            try {
                int result = countWords(tests[i]);
                System.out.println("Кількість слів = " + result);

            } catch (IllegalArgumentException | NullPointerException e) {
                System.out.println("Помилка — " + e.getMessage());
            }
        }
    }
}