package Lesson_copy;
//Составить алгоритм: если введенное число больше 7, то вывести “Привет”

import java.util.*;
public class Test_1 {
    public static void main(String args[]) {
        Scanner sc=new Scanner (System.in);
        System.out.println ("Введите число");
        int entered_number = sc.nextInt();

        if (entered_number > 7) {
            System.out.println("Привет");
        }
    }
}