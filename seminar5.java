import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class seminar5 {
    public static void main(String[] args) {
        // taskOne();
        //task2();
        //task3_1();
        task3_2();

    }

    // создать структуру хранения номеров паспортов
    // и фамилий сортудников //данные вымышлены
    static void task1() {
        Map<String, String> workers = new HashMap<>();
        workers.put("MP2417779", "SAYAPIN");
        workers.put("MP1234667", "GERMANOVICH");
        workers.put("MC3160983", "LEONCHUK");
        workers.put("AB2569854", "ANDREEVICH");
        workers.put("AB7778899", "GERMANOVICH");
        workers.put("AB6985432", "SAYAPIN");
        workers.put("AB4785265", "SAYAPIN");

        for (Map.Entry<String, String> worker : workers.entrySet()) {
            if (worker.getValue().equals("SAYAPIN"))
                System.out.printf("Passport number: %s, Worker surname: %s\n", worker.getKey(), worker.getValue());
        }
    }

    // Написать метод, который переведёт число из римского формата записи в
    // арабский.
    static void task2() {
        Map<Character, Integer> rimNums = new HashMap<>();
        rimNums.put('I', 1);
        rimNums.put('V', 5);
        rimNums.put('X', 10);
        rimNums.put('L', 50);
        rimNums.put('C', 100);
        rimNums.put('D', 500);
        rimNums.put('M', 1000);

        Scanner input = new Scanner(System.in);
        System.out.print("Input a number in Rome case: ");
        char[] romeNumber = input.nextLine().toUpperCase().toCharArray();
        int res = 0;

        for (int i = 0; i < romeNumber.length; i++) {
            if (i != romeNumber.length - 1 && rimNums.get(romeNumber[i]) < rimNums.get(romeNumber[i + 1])) {
                res += rimNums.get(romeNumber[i + 1]) - rimNums.get(romeNumber[i]);
                i++;
            }
            else res += rimNums.get(romeNumber[i]);
        }
        System.out.println(res);
        input.close();
    }

    //Написать метод, который сортирует строки по длине с помошью TreeMap.
    //Строки с одинаковой длиной не должны "потеряться".
    static void task3_1(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");
        String[] words = input.nextLine().split(" ");

        Map<Integer, String> sortedWords = new TreeMap<>();
        for (String word : words) 
            sortedWords.put(word.length(), word);
        System.out.println(sortedWords);
        input.close();   
    }

    static void task3_2(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");
        String[] words = input.nextLine().split(" ");

        Map<Integer, LinkedList<String>> sortedWords = new TreeMap<>();
        for (String word : words)
        if(sortedWords.containsKey(word.length())) 
            //если ключ с такой длиной есть добавляем слово в линкедлист
            sortedWords.get(word.length()).add(word);
        else{
            sortedWords.put(word.length(), new LinkedList<>());
            sortedWords.get(word.length()).add(word);
        } 
        System.out.println(sortedWords);
        input.close();   
    }

}
