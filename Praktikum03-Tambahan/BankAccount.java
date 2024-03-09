public class BankAccount {

    private double balance;
    private final double MIN_BALANCE = 100.0; // Saldo minimal

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(double amount) {
        
        try{
            if(balance - amount < MIN_BALANCE) {
            throw new InsufficientFundsException("Insufficient funds");
        }
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        }catch(InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

    }

  public double getBalance() {
    return balance;
  }

    
}
