package array;

public class Demo7RetrievingArrayUsingForLoop {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        //index range  : 0 to 4
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
