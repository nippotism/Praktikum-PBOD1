import java.util.Scanner;


public class BankApp {
    public static void main(String[] args) {


      Scanner sc = new Scanner(System.in);
      System.out.println("Enter initial balance: ");
      double initialBalance = sc.nextDouble();
      BankAccount account = new BankAccount(initialBalance);

      while(true){
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check balance");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        switch(choice){
          case 1:
            System.out.println("Enter amount to deposit: ");
            double amount = sc.nextDouble();
            account.deposit(amount);
            break;
          case 2:
            System.out.println("Enter amount to withdraw: ");
            amount = sc.nextDouble();
            account.withdraw(amount);
            break;
          case 3:
            System.out.println("Balance: " + account.getBalance());
            break;
          case 4:
            System.exit(0);
            break;
          default:
            System.out.println("Invalid choice");
        }

        System.out.println("Another transaction? (y/n): ");
        char ch = sc.next().charAt(0);
        if(ch == 'n' || ch == 'N'){
          System.out.println("Have a nice day!");
          break;
        }else if(ch == 'y' || ch == 'Y'){
          continue;
        }else{
          System.out.println("Invalid choice");
          break;
        }
      } 
        
    }
  }
  
