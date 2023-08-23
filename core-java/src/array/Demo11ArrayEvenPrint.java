package array;

public class Demo11ArrayEvenPrint {
    public static void main(String[] args) {
        int[] array = {98, 78, 65, 43, 76};
        //print even numbers only from the given array
        int sum = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] % 2 == 0) {
                System.out.println(array[index]);
                sum = sum + array[index];
            }
        }
        System.out.println("Sum of even array elements is " + sum);
    }
}
