package array;

import java.util.Arrays;

public class Demo15ArrayEquality {
    public static void main(String[] args) {
        int[] array1 = {10, 30, 50, 89};
        int[] array2 = {10, 30, 50};
        System.out.println(equals(array1, array1));

    }

    public static boolean equals(int[] array1, int[] array2) {
        if (array1 == array2) {
            return true;
        }
        if (array1 == null || array2 == null) {
            return false;
        }
        if (array1.length != array2.length) {
            return false;
        }
        for (int index = 0; index < array1.length; index++) {
            if (array1[index] != array2[index]) {
                return false;
            }
        }
        return true;
    }
}
