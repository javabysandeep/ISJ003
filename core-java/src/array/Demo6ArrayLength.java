package array;

public class Demo6ArrayLength {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        System.out.println("Array size " + array.length);//5

        int[] array2 = {};
        System.out.println("Array size " + array2.length);//0

        int[] array3 = new int[50];
        System.out.println("Array size " + array3.length);//50

    }
}
