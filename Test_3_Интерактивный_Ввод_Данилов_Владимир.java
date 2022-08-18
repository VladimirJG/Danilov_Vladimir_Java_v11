package Lesson_copy;

//Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3

import java.util.*;
public class Test_3 {
    public static void main(String args[]) {
        Scanner sc=new Scanner (System.in);
        System.out.println ("Введите число");
        int number = sc.nextInt();
        int x = number % 3;

            if(x == 0){
                System.out.println("Остаток от деления " + number + " равен 0" );
            }else {
                System.out.println("Введите число кратное 3");
            }
        }
    }
