package multithreading;

import java.util.Scanner;

class TestClass {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of songs ");
        int numberOfSongs = scanner.nextInt();
        int[] songList = new int[numberOfSongs];

        for (int i = 0; i < songList.length; i++) {
            songList[i] = scanner.nextInt();
        }
        int[] favouriteNumberOfSingers = new int[numberOfSongs];

        for (int i = 0; i < songList.length; i++) {
            for (int j = 0; j < songList.length; j++) {
                if (songList[i] == songList[j] && i != j) {
                    favouriteNumberOfSingers[i]++;
                }
            }
        }
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < favouriteNumberOfSingers.length; i++) {

            if (max < favouriteNumberOfSingers[i]) {
                max = favouriteNumberOfSingers[i];
            }

        }

        int count = 0;
        for (int i = 0; i < favouriteNumberOfSingers.length; i++) {
            if (max == favouriteNumberOfSingers[i]) {
                count++;

            }

        }
        System.out.println(count);

    }
}
