package Test_Aston;

//Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”,
// если нет, то вывести "Нет такого имени"

public class Test_2 {
    public static void main(String args[]) {
        String enteredName = "Вячеслав";
        if (enteredName == "Вячеслав") {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}