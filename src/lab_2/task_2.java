package lab_2;

public class task_2 {

    //введення значень змінних
    public static void main(String[] args) {
        printResults(1, 5, 1);
        printResults(2, 10, 3);
        printResults(2, 5, 2);
        printResults(3, 10, 4);
        printResults(1, 1, 1);
        printResults(1, 0, 1);
        printResults(1, 5, 0);
        printResults(1, -5, 2);
    }

    //Обчислення значення функції
    public static double calculate(double t, int n, int l) {

        //Перевірка введених параметрів
        if (!Double.isFinite(t)) {
            throw new IllegalArgumentException("t must be finite");
        }

        if (n < 1) {
            throw new IllegalArgumentException(
                    "n must be greater than 0"
            );
        }

        if (l < 1) {
            throw new IllegalArgumentException(
                    "l must be a positive integer"
            );
        }

        double sum = 0;

        //Калькуляція суми
        for (int i = 1; i <= n; i++) {

            if (l % 2 != 0) {

                //Якщо l непарне: t / i
                sum += t / i;

            } else {

                //Якщо l парне: t / sqrt(i)
                sum += t / Math.sqrt(i);
            }
        }

        return sum;
    }

    //Виведення результату
    static void printResults(double t, int n, int l) {

        System.out.print(
                "t: " + t +
                        " n: " + n +
                        " l: " + l +
                        " result: "
        );

        try {
            System.out.println(calculate(t, n, l));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}