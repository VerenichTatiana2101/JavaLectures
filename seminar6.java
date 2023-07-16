import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class seminar6 {
    public static void main(String[] args) {
        System.out.println(createArray(15, 20));
        procent(createArray(15, 20));

    }

    // Task 1. Создайте метод, формирующий массив из N случайных целых чисел.
    // Task 1_2. Создайте метод, в который передайте заполненный выше массив и
    // с помощью Set вычислите процент уникальных значений в данном массиве
    // и верните его в виде числа с плавающей запятой.
    static ArrayList<Integer> createArray(int n, int maxValue) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++)
            list.add(random.nextInt(maxValue));
        return list;
    }

    static void procent(ArrayList<Integer> myArray){
        double sizeArray = myArray.size();
        Set set = new HashSet(myArray);
        double sizeSet = set.size();
        double res = sizeSet / sizeArray * 100;
        System.out.println(myArray);
        System.out.println(set);
        System.out.printf("%s - процент от массива", res);
    }
}