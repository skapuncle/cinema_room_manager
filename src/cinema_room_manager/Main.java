package cinema_room_manager;

public class Main {
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
    }
}
