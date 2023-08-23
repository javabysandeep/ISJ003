package array;

public class Demo17MultiDimensionalArray {
    public static void main(String[] args) {
        //jagged array : array contains another array which is of different sizes
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6, 7},
                {8, 9, 10, 11, 12},
        };
        //array --->     | ref1 | ref 2 | ref 3 |
        // ref1 --- >    | 1 | 2 | 3 |
        //ref2 ---->        |4 | 5 | 6 | 7 |
        // ref3 --------->  8 | 9 | 10 | 11 | 12 |

        System.out.println("No of rows or size of outer array "+array.length);//3
        System.out.println("array 0 "+array[0].length);//3
        System.out.println("array 1 "+array[1].length);//4
        System.out.println("array 2 "+array[2].length);//5

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column]+" ");
            }
            System.out.println();
        }


    }
}
