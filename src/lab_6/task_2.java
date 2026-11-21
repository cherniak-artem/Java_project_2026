package lab_6;

public class task_2 {

    public class CountWords {

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

            //Правильні приклади
            System.out.println(countWords(
                    "Hello world Java programming"
            )); // 4

            System.out.println(countWords(
                    "The user with nickname koala757677 left 3 comments"
            )); // 8

            System.out.println(countWords(
                    "Java2026 is a programming language"
            )); // 5

            System.out.println(countWords(
                    "One two three four five"
            )); // 5

            //Перевірка порожнього рядка
            System.out.println(countWords("")); // 0

            //Перевірка рядка, який містить тільки цифри
            System.out.println(countWords("123 456 789")); // 0

            //Перевірка неправильного аргументу
            try {
                System.out.println(countWords(null));
            } catch (NullPointerException e) {
                System.out.println("Помилка: " + e.getMessage());
            }
        }
    }
}
