package cycle;

import java.util.Scanner;

public class task001 {
    public static void main(String[] args) {
        /*Таблица умножения на консоль
Напишите программу, которая выводит таблицу
умножения размером n x n на экран,
где значение n задаётся пользователем.

Пример вывода таблицы для n=3:
1   2   3
2   4   6
3   6   9
*/
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {
            int num = scan.nextInt();
            for (int x = 1; x <= num; x++) {
                System.out.print(" " + x + " ");
            }
            System.out.println();
            for (int y = 1; y <= num; y++) {
                System.out.print(y + " ");
                for (int yy = 1; yy <= num; yy++) {
                    System.out.print(yy*y + " ");

                }
                System.out.println();
            }


        }
        scan.close();
    }

}


