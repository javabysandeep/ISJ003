package array;

public class Demo19MaximumNumber {
    public static void main(String[] args) {
        int[] array = {440, 90, 20, 0, 330, 70, 30, 4, 440, 680};
        int maximum = array[0];
        for (int index = 1; index < array.length; index++) {
            if (array[index] > maximum) {
                maximum = array[index];
            }
        }
        System.out.println("Maximum " + maximum);
    }
}
