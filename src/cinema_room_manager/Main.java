package cinema_room_manager;

import java.util.Scanner;

public class Main {
    final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Cinema:");
        System.out.println("  1 2 3 4 5 6 7 8");
        for (int i = 1; i <= 7; i++) {
            System.out.print(i + " ");
            for (int j = 1; j <= 8; j++) {
                System.out.print("S ");
            }
            System.out.println();
        }
        System.out.println("Enter the number of rows:");
        int rowCount = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seatsCount = scanner.nextInt();

        int allSeats = rowCount * seatsCount;

        if (allSeats <= 60) {
            System.out.println("Total income:");
            System.out.println("$" + allSeats * 10);
        } else {
            int highCoast = rowCount / 2;
            int lowCoast = rowCount - highCoast;
            System.out.println("Total:");
            System.out.println("$" + (highCoast * seatsCount * 10 + lowCoast * seatsCount * 8));
        }
    }
}
