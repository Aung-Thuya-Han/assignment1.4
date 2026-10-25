import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstNames = {"Emma", "Olivia", "Liam", "Noah", "Ava"};
        String[] lastNames = {"Smith", "Johnson", "Brown", "Wilson", "Taylor"};

        System.out.print("How many random names should be generated? ");
        int numberOfNames = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfNames; i++) {
            int firstNameIndex = (int) (Math.random() * firstNames.length);
            int lastNameIndex = (int) (Math.random() * lastNames.length);

            String combinedName = firstNames[firstNameIndex] + " " + lastNames[lastNameIndex];

            System.out.println(combinedName);
        }
    }
}
