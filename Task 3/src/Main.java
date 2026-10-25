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


        int[] numbersWithoutDuplicates = new int[size];
        int numberOfSavedNumbers = 0;


        for (int i = 0; i < numbers.length; i++) {
            boolean duplicate = false;


            for (int j = 0; j < numberOfSavedNumbers; j++) {
                if (numbers[i] == numbersWithoutDuplicates[j]) {
                    duplicate = true;
                    break;
                }
            }


            if (duplicate == false) {
                numbersWithoutDuplicates[numberOfSavedNumbers] = numbers[i];
                numberOfSavedNumbers++;
            }
        }

        System.out.println("The array without duplicates:");


        for (int i = 0; i < numberOfSavedNumbers; i++) {
            System.out.print(numbersWithoutDuplicates[i] + " ");
        }

    }
}
