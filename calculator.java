import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean repeat = true;

        while (repeat) {
            System.out.print("\033[H\033[2J");
            choice();
            int userChoice = userCh(5);
            double result = rec(userChoice);
            System.out.println("Результат: " + result);
            System.out.println("Хотите продолжить? (y/n)");
            String answer = sc.next();
            if (answer.equalsIgnoreCase("n")) {
                repeat = false;
            }
        }
        sc.close();
    }

    static void choice() {
        System.out.println("1 - сложение ");
        System.out.println("2 - вычитание ");
        System.out.println("3 - умножение ");
        System.out.println("4 - деление ");
        System.out.println("5 - корень числа ");
    }

    static int userCh(int num) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер от 1 до 5: ");
        while (!sc.hasNextInt()) {
            System.out.println("Ошибка! Введите число: ");
            sc.next();
        }
        int userChoice = sc.nextInt();
        return userChoice;
    }

    static double rec(int userChoice) {
        Scanner sc = new Scanner(System.in);
        double result;
        if (userChoice > 0 && userChoice < 5) {
            System.out.println("Введите первое число: ");
            while (!sc.hasNextDouble()) {
                System.out.println("Ошибка! Введите число: ");
                sc.next();
            }
            double num = sc.nextDouble();

            System.out.println("Введите второе число: ");
            while (!sc.hasNextDouble()) {
                System.out.println("Ошибка! Введите число: ");
                sc.next();
            }
            double num2 = sc.nextDouble();

            switch (userChoice) {
                case 1:
                    result = sumNum(num, num2);
                    break;

                case 2:
                    result = differenceNum(num, num2);
                    break;

                case 3:
                    result = multiplicationNum(num, num2);
                    break;

                case 4:
                    result = divisionNum(num, num2);
                    break;

                default:
                    throw new IllegalArgumentException("Неверный выбор");
            }
            return result;
        } else if (userChoice == 5) {
            System.out.println("Введите число: ");
            while (!sc.hasNextDouble()) {
                System.out.println("Ошибка! Введите число: ");
                sc.next();
            }
            double num1 = sc.nextDouble();
            return rootNum(num1);
        } else {
            throw new IllegalArgumentException("Неверный выбор");
        }
    }

    static double sumNum(double a, double b) {
        return a + b;
    }

    static double differenceNum(double a, double b) {
        return a - b;
    }

    static double multiplicationNum(double a, double b) {
        return a * b;
    }

    static double divisionNum(double a, double b) {
        return a / b;
    }

    static double rootNum(double a) {
        double temp;
        double squareRoot = a / 2;
        do {
            temp = squareRoot;
            squareRoot = (temp + (a / temp)) / 2;
        } while ((temp - squareRoot) != 0);
        return squareRoot;
    }

}