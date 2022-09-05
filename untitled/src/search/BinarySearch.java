package search;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedArray = {9, 12, 15, 35, 44, 59, 68, 73};
        Arrays.sort(sortedArray);
        int key = 12;
        int position = binarySearch(sortedArray, key);
        System.out.println("Key "+ key + " находится на позиции № " + position);
    }

    static int binarySearch(int[] array, int key) {
        int position = 0;
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] == key) {
                System.out.println("Key найден");
                return middle;
            }
            if (array[middle] < key) {
                System.out.println("Отрезаем левую часть");
                left = middle + 1;
            }
            if (array[middle] > key) {
                System.out.println("Отрезаем правую часть");
                right = middle - 1;
            }
        }
        return -1;
    }
}



