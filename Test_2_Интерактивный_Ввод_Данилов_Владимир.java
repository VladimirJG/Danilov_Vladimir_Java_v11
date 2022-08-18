package Lesson_copy;

//Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”,
// если нет, то вывести "Нет такого имени"
import java.util.*;
public class Test_2 {
    public static void main(String args[]) {
        Scanner sc=new Scanner (System.in);
        System.out.println ("Введите имя");
        String enteredName = sc.next();
        if (enteredName.equals("Вячеслав")) {
            System.out.print("Привет, Вячеслав");
        } else {
            System.out.print("Нет такого имени");
        }
    }
}
