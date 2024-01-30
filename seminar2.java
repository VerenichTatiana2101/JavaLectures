import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class seminar2 {
    public static void main(String[] args) throws SecurityException, IOException { // SecurityException, IOException
                                                                                   // добавляется при написании кода
        // System.out.printf(longStringBuilding(10, 'a', 'b'));
        // System.out.println(stringCompress("aaaabbbcdd"));

        // вызов метода с вычислением времени его работы

        // long startTime = System.nanoTime();
        // isPalindrome4("aaaabbbaaaa");
        // long endTime = System.nanoTime();
        // long duration = (endTime - startTime);
        // System.out.println("Время выполнения: " + duration + " наносекунд");

        String pathProject = System.getProperty("user.dir"); // определяем наше расположение
        String pathFile1 = pathProject.concat("\\Seminar2-1.txt"); // добавляем недостающий \ и имя файла
        testTxtFile(pathFile1, testString("TEST ", 10)); // куда и что добавили

        // String pathFile2 = pathProject.concat("\\Seminar2-2.txt");
        // addLogFile(pathFile1, showListFils(pathProject));
        // typeFile(pathFile1, showListFils(pathProject));

        
        
    }

    // Дано четное число N (>0) и символы c1 и c2.
    // Написать метод, который вернет строку длины N, которая состоит из
    // чередующихся символов c1 и c2,
    // начиная с c1.
    static String longStringBuilding(int n, char c1, char c2) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {
            newStr.append(c1);
            newStr.append(c2);
        }
        return newStr.toString();
    }

    // Напишите метод, который сжимает строку.
    // Пример: вход aaaabbbcdd. Результат - a4b3cd2 для примера.
    static String stringCompress(String str) {
        StringBuilder newStr = new StringBuilder();
        char symbol = str.charAt(0);
        newStr.append(symbol);
        int count = 0;

        for (char letter : str.toCharArray()) {
            if (letter == symbol)
                count++;
            else {
                if (count != 1)
                    newStr.append(count);
                newStr.append(letter);
                symbol = letter;
                count = 1;
            }
        }
        if (count != 1)
            newStr.append(count);

        return newStr.toString();
    }

    // Напишите метод, который принимает на вход строку (String)
    // и определяет является ли строка палиндромом (возвращает boolean значение).
    // вариант 1 Время выполнения: 66200 наносекунд
    static boolean isPalindrome1(String str) {
        StringBuilder reversedString = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            char temp = str.charAt(i);
            reversedString.append(temp);
        }
        return str.equals(reversedString.toString());
    }

    // вариант 2 Время выполнения: 31300 наносекунд
    static boolean isPalindrome2(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    // вариант 3 Время выполнения: 69700 наносекунд
    static boolean isPalindrome3(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String reversedString = sb.toString();
        return str.equals(reversedString);
    }

    // вариант 4 Время выполнения: 10500 наносекунд
    static boolean isPalindrome4(String word) {
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1))
                return false;
        }
        return true;
    }

    // Напишите метод, который составит строку,
    // состоящую из 100 повторений слова TEST и метод,
    // который запишет эту строку в простой текстовый файл,
    // обработайте исключения.

    // метод, который составит строку,
    // состоящую из 100 повторений слова TEST
    static String testString(String word, int countWords) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i <= countWords; i++) {
            newStr.append(word);
        }
        return newStr.toString() + "\n"; // каждое добавление будет с новой строки
    }

    // метод, который запишет эту строку в простой текстовый файл
    static void testTxtFile(String filePath, String testStrTxt) {
        try {
            File newFile = new File(filePath);
            // FileWriter writer = new FileWriter(newFile); //при повторе файл перезапишется
            FileWriter writer = new FileWriter(newFile, true); // включается функция дозаписи

            writer.write(testStrTxt);
            writer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Напишите метод, который вернет содержимое текущей папки в виде массива строк.
    // Напишите метод, который запишет массив, возвращенный предыдущим методом в
    // файл.
    // Обработайте ошибки с помощью try-catch конструкции.
    // В случае возникновения исключения, оно должно записаться в лог-файл.

    // метод, который вернет содержимое текущей папки в виде массива строк.
    static String[] showListFils(String dirPath) throws IOException {
        File currentDir = new File(dirPath);
        return currentDir.list();
    }

    // метод, который запишет массив, возвращенный предыдущим методом в файл.
    static void addLogFile(String filePath, String[] list) throws SecurityException, IOException {
        Logger logger = Logger.getLogger(seminar2.class.getName());
        FileHandler fh = new FileHandler("seminar2-3(log).txt");

        logger.addHandler(fh); // что куда сохр
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        // отображение логов при возникновении исключений
        try {
            File myFile = new File(filePath);
            FileWriter writer = new FileWriter(myFile);
            for (String str : list) {
                writer.write(str + "\n");
            }
            writer.close();

        } catch (Exception e) {
            logger.warning(e.getMessage());
        }
    }



}
