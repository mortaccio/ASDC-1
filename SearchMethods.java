import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class SearchMethods {
    public static void main(String[] args) {
        String filename = "/data.txt"; // Имя текстового файла с данными
        int key = 42; // Ключевое значение для поиска

        // Метод последовательного поиска
        sequentialSearch(filename, key);

        // Метод поиска в неотсортированных массивах древовидно структурированных
        unsortedTreeSearch(filename, key);

        // Метод бинарного поиска
        binarySearch(filename, key);

        // Метод поиска интерполированием
        interpolationSearch(filename, key);

        // Метод Фибоначчи для поиска в отсортированном массиве
        fibonacciSearch(filename, key);
    }

    // Метод последовательного поиска
    private static void sequentialSearch(String filename, int key) {
        System.out.println("Sequential search method:");
        long startTime = System.nanoTime();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Разбиваем строку на поля и проверяем ключевое поле
                String[] fields = line.split(",");
                int fieldValue = Integer.parseInt(fields[0]);

                if (fieldValue == key) {
                    System.out.println("Found: " + line);
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Search time: " + elapsedTime + " ms");
    }

    // Метод поиска в неотсортированных массивах древовидно структурированных
    private static void unsortedTreeSearch(String filename, int key) {
        System.out.println("Search method in unsorted tree-structured arrays:");
        long startTime = System.nanoTime();

        // Реализация метода поиска

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Search time: " + elapsedTime + " ms");
    }

    // Метод бинарного поиска
    private static void binarySearch(String filename, int key) {
        System.out.println("Binary search method:");
        long startTime = System.nanoTime();

        // Реализация метода поиска

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Search time: " + elapsedTime + " ms");
    }

    // Метод поиска интерполированием
    private static void interpolationSearch(String filename, int key) {
        System.out.println("Interpolation search method:");
        long startTime = System.nanoTime();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            int[] array = new int[100]; // Здесь предполагается, что массив данных уже загружен в память
            int low = 0;
            int high = array.length - 1;
    
            while (low <= high && key >= array[low] && key <= array[high]) {
                // Интерполяционная формула для определения позиции
                int position = low + ((key - array[low]) * (high - low)) / (array[high] - array[low]);
    
                if (array[position] == key) {
                    System.out.println("Found: " + key);
                    break;
                } else if (array[position] < key) {
                    low = position + 1;
                } else {
                    high = position - 1;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Search time: " + elapsedTime + " ms");
    }
    
    // Метод Фибоначчи для поиска в отсортированном массиве
    private static void fibonacciSearch(String filename, int key) {
        System.out.println("Fibonacci method for searching in a sorted array:");
        long startTime = System.nanoTime();
    
        // Реализация метода поиска
    
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Search time: " + elapsedTime + " ms");
    }
}    
