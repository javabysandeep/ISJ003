public class PercentageCalculator {
    public static void main(String[] args) {
        int subject1 = 60;
        int subject2 = 80;
        int subject3 = 100;

        //total, average, percentage

        double total = subject1 + subject2 + subject3;
        double average = total / 3;
        double percentage = total / 300 * 100;
        System.out.println("Total marks " + total);
        System.out.println("Average " + average);
        System.out.println("Percentage " + percentage);

    }
}
