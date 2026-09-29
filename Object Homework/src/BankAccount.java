public class BankAccount {

    String ownerName;
    String accountNumber;
    double balance;

    public BankAccount(String ownerName, String accountNumber, double balance) {
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void printBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount account =
                new BankAccount("Aram", "123456", 1000);

        account.printBalance();

        account.deposit(500);
        account.printBalance();

        account.withdraw(200);
        account.printBalance();
    }
}