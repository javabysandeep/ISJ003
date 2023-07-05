package controlStatements.conditional;

import java.util.Scanner;

public class IfElseDem011Discount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the quantity");
        int quantity = scanner.nextInt();

        System.out.println("Enter the price");
        int price = scanner.nextInt();

        float total = quantity * price;
        float discount = 0.0f;

        if (quantity > 1000) {
            discount = 10.0f;
        }

        float payableAmount = total - total / discount;
        System.out.println("Total payable amount " + payableAmount);

    }
}
