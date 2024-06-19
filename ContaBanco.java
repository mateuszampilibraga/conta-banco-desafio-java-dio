import java.util.Scanner;  // Import the Scanner class

public class ContaBanco {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Welcome to ByteStream Bank!");

        System.out.print("Please digit your account number: ");
        int accountNumber = myObj.nextInt();  // Read account number input
        myObj.nextLine();  // Consume the newline character

        System.out.print("Please digit your branch code: ");
        String branchCode = myObj.nextLine();  // Read branch code input

        System.out.print("Please enter your name: ");
        String customerName = myObj.nextLine();  // Read customer name

        System.out.print("Please enter your balance: ");
        double balance = myObj.nextDouble();  // Read balance input

        String finalMessage = String.format("Welcome %s, thank you for opening an account with our bank. Your branch is %s, your account number is %d, and your balance of %.2f is already available for withdrawal.", customerName, branchCode, accountNumber, balance); // Final message to be printed
        System.out.println(finalMessage);  // Output user input
    }
}
