package array;

public class Demo22ArrayElementsShifting {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60};
        for (int i = 3; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length-1]=Integer.MIN_VALUE;
        for (int temp : array) {
            System.out.print(temp + " ");
        }
    }
}
