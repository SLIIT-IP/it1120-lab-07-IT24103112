mport java.util.Scanner;

public class It24103112 Lab7Q3 {
    public static void main(String[] args) {
        int i = 0;
        char modeOfPayment;
        double finalPayment = 0;

        Scanner keyboard = new Scanner(System.in);

        for (i = 1; i <= 5; i++) {
            System.out.println("Customer " + i);
            System.out.print("Enter the bill amount: ");
            double bill = keyboard.nextDouble();
            System.out.print("Enter the mode of payment (c for cash, o for online): ");
            modeOfPayment = keyboard.next().charAt(0);

            if (modeOfPayment == 'c' || modeOfPayment == 'C') {
                finalPayment = bill * 0.95; // 5% discount
                System.out.println("The discount is " + (bill - finalPayment));
                System.out.println("The final payment is: " + finalPayment);
            } else if (modeOfPayment == 'o' || modeOfPayment == 'O') {
                System.out.println("The final payment is: " + bill);
            } else {
                System.out.println("Invalid mode of payment");
            }
        }

        keyboard.close();
    }
}