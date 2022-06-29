package TasksDay3;

public class BankAccount {

            private double balance;

            public BankAccount(double balance) { //constructor
                this.balance = balance;
            }
            void deposit(double amount) { //method to increase the balance
                //If the deposit is greater than 5000, then it should not do the deposit
                if(amount > 5000) {
                    System.out.println("Transaction cancelled. Max deposit is 5000 euros. Your deposit: " + amount);
                    return;}
                balance = balance + amount;
            }
            void withdraw (double amount) { //impossible to withdraw more money than exists in bank account
                if(amount > balance) {
                    System.out.println("There is not enough funds.");
                    return;
                }
                balance = balance - amount;
            }
            void printBalance() { //method to display the current balance
                System.out.println(balance);
            }
            void transferFrom(BankAccount oldBankAccount, double amount) { //method to transfer balance
                //impossible to transfer more money from the other account than it's on balance.
                if (oldBankAccount.balance < amount) {
                    System.out.println("Transfer cancelled. You are trying to transfer " + amount +
                                    " euros, but only " + oldBankAccount.balance + " euro(s) are available.");
                    return;
                }
                this.balance = this.balance + amount;
                oldBankAccount.balance = oldBankAccount.balance - amount;
            }

            public static void main(String[] args) {
                BankAccount account1 = new BankAccount(3000);
                account1.deposit(5050);
                account1.withdraw(4200);

                BankAccount account2 = new BankAccount(1000);
                account2.transferFrom(account1,10000);
                account1.printBalance();
                account2.printBalance();
            }


        }

