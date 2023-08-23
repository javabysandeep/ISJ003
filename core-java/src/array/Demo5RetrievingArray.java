package array;

public class Demo5RetrievingArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        System.out.println(array); // hashCode  //it will print the reference / address of an object
        System.out.println(array[0]); //10
        System.out.println(array[1]); //20
        System.out.println(array[2]);//30
        System.out.println(array[3]);//40
        System.out.println(array[4]); //50
        System.out.println(array[5]); // ArrayIndexOutOfBoundsException

        //index range : 0 to 4
    }
}
