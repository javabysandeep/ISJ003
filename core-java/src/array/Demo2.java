package array;

public class Demo2 {
    public static void main(String[] args) {
        // we do not know the values in advance
        // hence we cannot create the array with negative size
        int[] array = new int[-5];//NegativeArraySizeException


    }
}
