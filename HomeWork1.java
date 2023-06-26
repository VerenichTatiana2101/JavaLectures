import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        while (!sc.hasNextInt()) {
            System.out.println("Ошибка! Введите число: ");
            sc.next();
        }
        int num = sc.nextInt();
        System.out.println("Вы ввели число: " + num);
        if (num >= 1) {
            int res = triangularNumer(num);
            System.out.println(num + "-oe треугольное число равно " + res);
            double res2 = factor(num);
            System.out.println("Факториал числа " + num + " равно " + res2);
        } else {
            System.out.println("Данные введены некорректно");
        }

        primeNumbers();

        sc.close();

    }

    // 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n)
    static int triangularNumer(int num) {
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

    // 1) n! (произведение чисел от 1 до n)
    static double factor(int n) {
        if (n == 1)
            return 1;
        return n * factor(n - 1);
    }

    // // 2) Вывести все простые числа от 1 до 1000
    static void primeNumbers() {
        int num = 1000;
        String primes = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Простые числа до 1000: ");
        for (int i = 2; i <= num; i++) {
            int j;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j == i) {
                primes += i + " ";
                // System.out.println(i);
            }
        }
        System.out.println(primes);
        sc.close();
    }
 
}
