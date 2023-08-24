package array;

public class Demo21SecondMax {
    public static void main(String[] args) {
        int[] array = {50, 20, 30, 25, 40};
        int maximum = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE - 1;
        for (int index = 0; index < array.length; index++) {
            if (array[index] > maximum) {
                secondMax = maximum;
                maximum = array[index];
            }
            if (array[index] > secondMax && array[index] < maximum) {
                secondMax = array[index];
            }
        }
        System.out.println("Maximum " + maximum);
        System.out.println("Second Maximum " + secondMax);
    }
}
