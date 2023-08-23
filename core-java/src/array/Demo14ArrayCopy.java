package array;

public class Demo14ArrayCopy {
    public static void main(String[] args) {
        int[] array1 = {10, 30, 50, 89};
//        int[] array2 = array1;//reference copy

        int[] array2 = new int[array1.length];//reference copy
        for (int index = 0; index < array1.length; index++) {
            array2[index] = array1[index];
        }
        System.out.println("New array content");
        for (int temp : array2) {
            System.out.print(temp + " ");
        }
    }
}
