public class BankAccount {
    private int balance;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setBalance(1000);

        System.out.println("Bank Account Balance: " + account.getBalance());
    }
}
