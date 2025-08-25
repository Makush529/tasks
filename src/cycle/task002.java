package cycle;

import java.util.Scanner;

public class task002 {
    public static void main(String[] args) {
        /*Сумма чисел от N до M
        Напишите программу, которая принимает два целых числа N и M,
        вычисляет сумму всех чисел между ними включительно и выводит её на экран.

                Пример ввода:
                Input: N = 5,M = 10
                Output: Sum = 45
                */
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число N");
        if (scan.hasNextInt()) {
            int numN = scan.nextInt();
            System.out.println("Введите число М");
            int numM = scan.nextInt();
            int sum = 0;
            for (int cycle = numN; cycle <= numM; cycle++) {
                sum = sum + cycle;
            }
            System.out.println("Сумма чисел от N до M равна " + sum);
        } else {
            System.out.println("Неверные данные");
        }
        scan.close();
    }
}
