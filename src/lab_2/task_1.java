package lab_2;

public class task_1 {

    //введення значень змінних
    public static void main(String[] args) {
        printResults(1, 5);
        printResults(2, 10);
        printResults(0, 5);
        printResults(-1, 5);
        printResults(2, 31);
        printResults(2, 0);
        printResults(3, 3);
        printResults(5, 2);
    }

    //Обчислення значення функції
    public static double calculate(double m, int k) {

        //Перевірка введених параметрів
        if (!Double.isFinite(m)) {
            throw new IllegalArgumentException("m must be finite");
        }

        if (k < 1 || k > 30) {
            throw new IllegalArgumentException(
                    "k must be between 1 and 30"
            );
        }

        double sum = 0;

        //Калькуляція суми серії
        for (int i = 1; i <= k; i++) {

            double value = m * Math.sin(m * i) / i;

            if (!Double.isFinite(value)) {
                throw new IllegalArgumentException(
                        "Invalid value under the root"
                );
            }

            //Підкореневий вираз кореня парного степеня не може бути від’ємним.
            if (value < 0 && k % 2 == 0) {
                throw new IllegalArgumentException(
                        "Negative value under an even root"
                );
            }

            //Обчислення кореня k-го степеня
            double term;

            if (value < 0) {
                term = -Math.pow(-value, 1.0 / k);
            } else {
                term = Math.pow(value, 1.0 / k);
            }

            sum += term;
        }

        return sum;
    }

    static void printResults(double m, int k) {

        System.out.print("m: " + m + " k: " + k + " result: ");

        try {
            System.out.println(calculate(m, k));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}