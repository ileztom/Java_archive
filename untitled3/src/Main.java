import java.util.Scanner;

public class Main {

    // Массив для хранения результатов
    static double[] results = new double[100];
    static int resultIndex = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Введите операцию (+, -, *, /, !) или 'exit' для выхода:");
            String operation = scanner.nextLine();

            if (operation.equals("exit")) {
                exit = true;
                continue;
            }

            double result = 0;

            if (operation.equals("!")) {
                // Рекурсивная операция факториала
                System.out.println("Введите число для вычисления факториала:");
                int number = scanner.nextInt();
                result = factorial(number);
            } else {
                System.out.println("Введите первое число:");
                double num1 = scanner.nextDouble();

                System.out.println("Введите второе число:");
                double num2 = scanner.nextDouble();

                result = performOperation(operation, num1, num2);
            }

            // Сохраняем результат в массив
            saveResult(result);

            System.out.println("Результат: " + result);
            scanner.nextLine();  // Очистка буфера после ввода чисел
        }

        // Завершаем программу
        scanner.close();
        System.out.println("Программа завершена.");
    }

    // Метод для выполнения операций
    public static double performOperation(String operation, int num1, int num2) {
        switch (operation) {
            case "+":
                return add(num1, num2);
            case "-":
                return subtract(num1, num2);
            case "*":
                return multiply(num1, num2);
            case "/":
                return divide(num1, num2);
            default:
                System.out.println("Неправильная операция.");
                return 0;
        }
    }

    // Перегруженный метод для операций с числами с плавающей точкой
    public static double performOperation(String operation, double num1, double num2) {
        switch (operation) {
            case "+":
                return add(num1, num2);
            case "-":
                return subtract(num1, num2);
            case "*":
                return multiply(num1, num2);
            case "/":
                return divide(num1, num2);
            default:
                System.out.println("Неправильная операция.");
                return 0;
        }
    }

    // Методы для арифметических операций
    public static double add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(int a, int b) {
        return a - b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(int a, int b) {
        return a * b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Деление на ноль невозможно.");
            return 0;
        }
    }

    public static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Деление на ноль невозможно.");
            return 0;
        }
    }

    // Метод для сохранения результатов в массив
    public static void saveResult(double result) {
        if (resultIndex < results.length) {
            results[resultIndex] = result;
            resultIndex++;
        } else {
            System.out.println("Массив результатов переполнен.");
        }
    }

    // Рекурсивный метод для факториала
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
