package array;

public class Demo20MinimumNumber {
    public static void main(String[] args) {
        int[] array = {440, 90, 20, 0, 330, 70, 30, 4, 440, 680};
        int minimum = array[0];
        for (int index = 1; index < array.length; index++) {
            if (array[index] < minimum) {
                minimum = array[index];
            }
        }
        System.out.println("Minimum " + minimum);
    }
}
