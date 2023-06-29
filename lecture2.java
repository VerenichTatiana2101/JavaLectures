import java.io.File;

// public class lecture2 {
//     public static void main(String[] args) {
//     String[] name = { "C", "е", "р", "г", "е", "й" };
//     String sk = "СЕРГЕЙ КА.";
//     System.out.println(sk.toLowerCase()); // сергей ка.
//     System.out.println(String.join("", name)); // Cергей
//     System.out.println(String.join("", "C", "е", "р", "г", "е", "й"));
//     // C,е,р,г,е,й
//     System.out.println(String.join(",", "C", "е", "р", "г", "е", "й"));
//     }
//    }

// concat(): объединение строк
// valueOf(): преобразует Object в строковое представление (завязан на
// toString())
// join(): объединяет набор строк в одну с учетом разделителя
// charAt(): получение символа по индексу
// indexOf(): первый индекс вхождения подстроки
// lastIndexOf(): последний индекс вхождения подстроки
// startsWith()/endsWith(): определяет, начинается/заканчивается ли строка с
// подстроки
// replace(): замена одной подстроки на другую
// trim(): удаляет начальные и конечные пробелы
// substring(): возвращает подстроку, см.аргументы
// toLowerCase()/toUpperCase(): возвращает новую строку в нижнем/верхнем
// регистре
// сompareTo(): сравнивает две строки
// equals(): сравнивает строки с учетом регистра
// equalsIgnoreCase(): сравнивает строки без учета регистра
// regionMatches(): сравнивает подстроки в строках

// File <имя> = new File(<полный путь к файлу>);
// File f1 = new File("file.txt");
// File f2 = new File("/Users/sk/vscode/java_projects/file.txt");

// // Работа с файловой системой. Файлы
// import java.io.File;
// public class lecture2 {
// public static void main(String[] args) {
// String pathProject = System.getProperty("user.dir");
// String pathFile = pathProject.concat("/file.txt");
// File f3 = new File(pathFile);
// System.out.println(f3.getAbsolutePath ());
// // /Users/sk/vscode/java_projects/file.txt
// // C:/Users/Sk/Documents/xxx/brainexplosion/java/file.txt
// }
// }

// Работа с файловой системой. Файлы. Ошибки
// try {
// Код, в котором может появиться ошибка
// } catch (Exception e) {
// Обработка, если ошибка случилась
// }
// finally {
// Код, который выполнится в любом случае
// }

// import java.io.File;

public class lecture2 {
    public static void main(String[] args) {
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
            File f3 = new File(pathFile);
            System.out.println("try");
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
    }
}

// import java.io.File;

// public class lecture2 {
//     public static void main(String[] args) {
//         try {
//             String pathProject = System.getProperty("user.dir");
//             String pathFile = pathProject.concat("/file.txt");
//             File file = new File(pathFile);
//             if (file.createNewFile()) {
//                 System.out.println("file.created");
//             } else {
//                 System.out.println("file.existed");
//             }
//         } catch (Exception e) {
//             System.out.println("catch");
//         } finally {
//             System.out.println("finally");
//         }
//     }
// }

// public class lecture2 {
//     public static void main(String[] args) {
//         String line = "empty";
//         try {
//             File file = new File(pathFile);
//             if (file.createNewFile()) {
//                 System.out.println("file.created");
//             } else {
//                 BufferedReader bufReader = new BufferedReader(new FileReader(file));
//                 System.out.println("file.existed");
//                 line = bufReader.readLine();
//                 bufReader.close();
//             }
//         } catch (Exception e) {
//             // e.printStackTrace();
//         } finally {
//             System.out.println(line);
//         }
//     }
// }   ///не работает

// isHidden(): возвращает истину, если каталог или файл является скрытым
// length(): возвращает размер файла в байтах
// lastModified(): возвращает время последнего изменения файла или каталога
// list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
// listFiles(): возвращает массив файлов и подкаталогов, которые находятся
// в определенном каталоге
// mkdir(): создает новый каталог
// renameTo(File dest): переименовывает файл или каталог
// length(): возвращает размер файла в байтах
// lastModified(): возвращает время последнего изменения
// файла или каталога
// list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
// listFiles(): возвращает массив файлов и подкаталогов, которые
// находятся в определенном каталоге
// mkdir(): создает новый каталог
// renameTo(File dest): переименовывает файл или каталог

// import java.io.File;

// public class lecture2 {
//     public static void main(String[] args) {
//         String pathProject = System.getProperty("user.dir");
//         String pathDir = pathProject.concat("/files");
//         File dir = new File(pathDir);
//         System.out.println(dir.getAbsolutePath());
//         if (dir.mkdir()) {
//             System.out.println("+");
//         } else {
//             System.out.println("-");
//         }
//         for (String fname : dir.list()) {
//             System.out.println(fname);
//         }
//     }
// }

