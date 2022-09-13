package cinema_room_manager;

import java.util.Scanner;

public class Main {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        room();
    }

    public static void room() {
        System.out.println("Enter the number of rows:");
        int rowCount = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seatsCount = scanner.nextInt();
        System.out.println("Cinema:");

        int allSeats = rowCount * seatsCount;

        String[][] roomChairs = new String[rowCount + 1][seatsCount + 1];

        for (int i = 0; i < roomChairs.length; i++) {
            for (int j = 0; j < roomChairs[i].length; j++) {
                if (i + j == 0) {
                    roomChairs[i][j] = " ";
                    System.out.print(roomChairs[i][j] + " ");
                } else if (i == 0) {
                    roomChairs[i][j] = String.valueOf(j);
                    System.out.print(roomChairs[i][j] + " ");
                } else if (j == 0) {
                    roomChairs[i][j] = String.valueOf(i);
                    System.out.print(roomChairs[i][j] + " ");
                } else {
                    roomChairs[i][j] = "S";
                    System.out.print(roomChairs[i][j] + " ");
                }
            }
            System.out.println(" ");
        }

        System.out.println("Enter a row number:");
        int row = scanner.nextInt();
        System.out.println("Enter a seat number in that row:");
        int seat = scanner.nextInt();

        if (allSeats < 60 || row <= rowCount / 2) {
            System.out.println("Ticket price: $10 ");
        } else {
            System.out.println("Ticket price: $8");
        }

        System.out.println("Cinema:");

        for (int i = 0; i < roomChairs.length; i++) {
            for (int j = 0; j < roomChairs[i].length; j++) {
                if (i == row && j == seat) {
                    roomChairs[i][j] = "B";
                    System.out.print(roomChairs[i][j] + " ");
                } else if (i + j == 0) {
                    roomChairs[i][j] = " ";
                    System.out.print(roomChairs[i][j] + " ");
                } else if (i == 0) {
                    roomChairs[i][j] = String.valueOf(j);
                    System.out.print(roomChairs[i][j] + " ");
                } else if (j == 0) {
                    roomChairs[i][j] = String.valueOf(i);
                    System.out.print(roomChairs[i][j] + " ");
                } else {
                    roomChairs[i][j] = "S";
                    System.out.print(roomChairs[i][j] + " ");
                }
            }
            System.out.println(" ");
        }

    }
}
