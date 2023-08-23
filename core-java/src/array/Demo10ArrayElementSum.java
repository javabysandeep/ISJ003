package array;

public class Demo10ArrayElementSum {
    public static void main(String[] args) {
        int[] array = {98, 78, 65, 43, 76};
        //array elements sum
        int arrayElementsSum = 0;
        for (int index = 0; index < array.length; index++) {
            arrayElementsSum = arrayElementsSum + array[index];
        }
        System.out.println("Sum of array elements is  " + arrayElementsSum);
    }
}
