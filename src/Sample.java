import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Pattern Printer Menu");
            System.out.println("1.Print Square");
            System.out.println("2. Print Rectangle");
            System.out.println("3. Print Cross");
            System.out.println("4. Print Plus");
            System.out.println("5. Print Diamond");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    System.out.print("Enter the side length of the square: ");
                    int squareSide = scanner.nextInt();
                    printSquare(squareSide);
                    break;
                case 2:
                    System.out.print("Enter the width of the rectangle: ");
                    int rectangleWidth = scanner.nextInt();
                    System.out.print("Enter the height of the rectangle: ");
                    int rectangleHeight = scanner.nextInt();
                    printRectangle(rectangleWidth, rectangleHeight);
                    break;
                case 3:
                    System.out.print("Enter the size of the cross: ");
                    int crossSize = scanner.nextInt();
                    printCross(crossSize);
                    break;
                case 4:
                    System.out.print("Enter the size of the plus: ");
                    int plusSize = scanner.nextInt();
                    printPlus(plusSize);
                    break;
                case 5:
                    System.out.print("Enter the width of the diamond: ");
                    int diamondWidth = scanner.nextInt();
                    printDiamond(diamondWidth);
                    break;
                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        } while (choice != 0);
    }

    private static void printSquare(int side) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printCross(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == i || j == size - i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printPlus(int size) {
        for (int i = 0; i < size; i++) {
            if (i == size / 2) {
                System.out.println("*".repeat(size));
            } else {
                System.out.print(" ".repeat(size / 2));
                System.out.println("*");
            }
        }
    }
    private static void printDiamond(int width) {
        int spaces = width / 2;
        int stars = 1;

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();

            if (i < width / 2) {
                spaces--;
                stars += 2;
            } else {
                spaces++;
                stars -= 2;
            }
        }
    }
}


