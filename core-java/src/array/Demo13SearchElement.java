package array;

public class Demo13SearchElement {
    public static void main(String[] args) {
        int[] array = {19, 45, 67, 68, 68, 31, 99, 101};
        int key = 67;
        boolean isFound = false;
        for (int index = 0; index < array.length; index++) {
            if (key == array[index]) {
                isFound = true;
                break;
            }
        }
        System.out.println(isFound ? "key found" : "key not found");
        //time complexity : o(n) --> worst case : if element found at last location
        //time complexity : o(1) --> best case : if element found at first location
    }
}
