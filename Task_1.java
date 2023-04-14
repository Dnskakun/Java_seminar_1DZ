import java.util.Scanner;

/**
 * Вычислить n-ое треугольного число (сумма чисел от 1 до n),
 * n! (произведение чисел от 1 до n).
 */
public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Введите целое положительное число: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        summa_n(n);
        composition_n(n);
    }
    
    static void summa_n(int k) {
        int sum = 0;
        for (int i = 1; i <= k; i++) {
            sum += i;
        }
        String res = "Сумма чисел от 1 до " + k + ": " + sum; 
        System.out.println(res);
    }

    static void composition_n(int k) {
        int comp = 1;
        for (int i = 1; i <= k; i++) {
            comp *= i;
        }
        String res = "Произведение чисел от 1 до " + k + ": " + comp; 
        System.out.println(res);
    }

}