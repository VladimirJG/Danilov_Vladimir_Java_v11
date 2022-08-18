package Test_Aston;

//Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3

public class Test_3 {
    public static void main(String args[]) {
        int[] massive = {3, 5, 12, 21, 22, 26, 30, 38,54, 112, 321, 1132};

        for (int i = 0; i < massive.length; i++) {
            if(massive[i] % 3 == 0)
                System.out.println(massive[i]);
            }
        }
    }
