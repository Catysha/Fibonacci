import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Fibonacci {
    public static List<Integer> getFibonacci(int n) {
        List<Integer> fibonacciNumbers = new ArrayList<>();

        if (n <= 0) return fibonacciNumbers; // Если n <= 0, возвращаем пустой список
        if (n >= 1) fibonacciNumbers.add(0); // Добавляем F(0)
        if (n >= 2) fibonacciNumbers.add(1); // Добавляем F(1)

        for (int i = 2; i < n; i++) {
            int nextFibonacci = fibonacciNumbers.get(i - 1) + fibonacciNumbers.get(i - 2);
            fibonacciNumbers.add(nextFibonacci);
        }

        return fibonacciNumbers;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел Фибоначчи: ");
        int n = scanner.nextInt();
        List<Integer> fibonacciNumbers = getFibonacci(n);

        System.out.println(fibonacciNumbers);
    }
}