import java.util.Scanner;

class BankAccount
{
    private double balance;
    
    BankAccount()
    {
        this.balance=0;
    }
    
    BankAccount(double balance)
    {
        this.balance=balance;
    }
    
    void deposit(double amount)
    {
        if (amount > 0) 
        {
            balance = balance+amount;
            System.out.println("\t\t\tDeposit successful.");
        }
        else
        {
            System.out.println("\t\t\tInvalid amount for deposit.");
        }
    }

    void withdraw(double amount) 
    {
        if (amount > 0 && balance >= amount) 
        {
            balance = balance-amount;
            System.out.println("\t\t\tWithdrawal successful.");
        }
        else if(amount<=0)
        {
            System.out.println("\t\t\tEnter valid amount");
        } 
        else 
        {
            System.out.println("\t\t\tInsufficient balance in your account");
        }
    }

    void checkBalance() {
        System.out.println("\t\t\tYour Balance is :"+balance);
    }
}
class ATM
{
    private BankAccount ba=new BankAccount();

    ATM(BankAccount b)
    {
       this.ba=b;
    }
    void deposit(double amount)
    {
        ba.deposit(amount);
    }

    void withdraw(double amount)
    {
        ba.withdraw(amount);
    }

    void checkBalance()
    {
        ba.checkBalance();
    }

    
}

public class AtmInterface 
{
    public static void main(String[] args) 
    {
        
        BankAccount bankAccount = new BankAccount(5000);
        ATM atm = new ATM(bankAccount);
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.println("\n\t\t\t===============================");
            System.out.println("\t\t\t  Welcome to our ATM...");
            System.out.println("\t\t\t===============================");
            System.out.println("\t\t\t  1.Withdraw\n\t\t\t  2.Deposit\n\t\t\t  3.Check Balance\n\t\t\t  4.Exit");
            System.out.println("\t\t\t===============================");
            System.out.print("\t\t\tEnter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) 
            {
                case 1:
                    
                    System.out.print("\t\t\tEnter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.print("\t\t\tEnter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    atm.checkBalance();
                    break;
                case 4:
                    System.out.println("\t\t\tThank you for using the ATM.");
                    System.exit(0);
                default:
                    System.out.println("\t\t\tInvalid choice. Please enter a valid option.");
            }
        }
    }
}

 