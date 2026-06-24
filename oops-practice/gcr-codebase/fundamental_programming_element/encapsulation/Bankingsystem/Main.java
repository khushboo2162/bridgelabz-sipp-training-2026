package Bankingsystem;

public class Main {

    public static void main(String[] args) {

        SavingsAccount savings =
                new SavingsAccount(
                        "SA101",
                        "Khushboo",
                        10000,
                        5);

        CurrentAccount current =
                new CurrentAccount(
                        "CA101",
                        "Aman",
                        20000,
                        2);

        // Savings Account
        savings.deposit(5000);
        savings.withdraw(2000);

        System.out.println("\n===== SAVINGS ACCOUNT =====");
        savings.displayAccountDetails();
        System.out.println(
                "Interest : "
                        + savings.calculateInterest());

        // Current Account
        current.deposit(3000);
        current.withdraw(1000);

        System.out.println("\n===== CURRENT ACCOUNT =====");
        current.displayAccountDetails();
        System.out.println(
                "Interest : "
                        + current.calculateInterest());
    }
}
