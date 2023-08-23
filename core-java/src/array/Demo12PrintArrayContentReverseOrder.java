package array;

public class Demo12PrintArrayContentReverseOrder {
    public static void main(String[] args) {
        int[] array = {98, 78, 65, 43, 76};

        for (int index = array.length - 1; index >= 0; index--) {
            System.out.print(array[index] + " ");
        }
    }
}
