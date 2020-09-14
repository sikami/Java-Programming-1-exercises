
import java.util.Collections;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        int index = 0;
        int indexAt = 0;
        for (int number : array) {
            if (number < smallest) {
                smallest = number;
                indexAt = index;
            }
            index++;
        }
        System.out.println(indexAt);
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int index = 0;
        int indexAt = 0;
        for (int number : array) {
            if (number < smallest) {
                smallest = number;
                indexAt = index;
            }
            index++;
        }
        System.out.println(indexAt);
        return indexAt;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int indexAt = 0;
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] <= smallest) {
                smallest = table[i];
                indexAt = i;
            }
        }
        return indexAt;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i+1]) {
                swap(array, i, i+1);
                count++;
            }
        }

        while (count > 0) {
            sort(array);
            count--;
        }
    }
}
