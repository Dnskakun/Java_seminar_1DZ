/*
 * Реализовать простой калькулятор
 */

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число X: ");
        int num_x = scanner.nextInt();
        System.out.print("Введите число Y: ");
        int num_y = scanner.nextInt();

        calc(num_x, num_y);
        scanner.close();
    }

    static void calc(int x, int y) {
        System.out.println("""
                            Выбирите номер действия:
                            1. сложение
                            2. вычитание
                            3. умножение
                            4. деление""");
        Scanner scanner = new Scanner(System.in);
        int num_choice = scanner.nextInt();
        scanner.close();

        switch (num_choice) {
            case 1:
                int res1 = x + y;
                System.out.print("Ответ: " + res1);
                break;
            case 2:
                int res2 = x - y;    
                System.out.print("Ответ: " + res2);
                break;
            case 3:
                int res3 = x * y;
                System.out.print("Ответ: " + res3);
                break;
            case 4:
                double res4 = (double) x / y;    
                System.out.print("Ответ: ");
                System.out.printf("%.3f\n", res4);
                break;
            default:
                System.out.print("Некорректный выбор!");
                break;            
        }
    }
}
