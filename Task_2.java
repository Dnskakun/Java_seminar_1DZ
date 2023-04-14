/*
 * Вывести все простые числа от 1 до 1000
 */

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        System.out.println("Введите целое положительное число до 1000: ");
        Scanner scanner = new Scanner(System.in);
        int user_num = scanner.nextInt();
        scanner.close();

        find_prime_numbers(user_num);
    }

    static void find_prime_numbers(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(i + " ");
            }
            count = 0;            
        }
    }
}
