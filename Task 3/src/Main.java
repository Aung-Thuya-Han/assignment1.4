import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }

        int[] uniqueNumbers = new int[size];
        int uniqueCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            boolean alreadyExists = false;

            for (int j = 0; j < uniqueCount; j++) {
                if (numbers[i] == uniqueNumbers[j]) {
                    alreadyExists = true;
                    break;
                }
            }

            if (!alreadyExists) {
                uniqueNumbers[uniqueCount] = numbers[i];
                uniqueCount++;
            }
        }

        System.out.println("The array without duplicates:");

        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(uniqueNumbers[i]);

            if (i < uniqueCount - 1) {
                System.out.print(" ");
            }
        }

        System.out.println();
    }
}
