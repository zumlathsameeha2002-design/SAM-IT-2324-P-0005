package encapsulation;

import java.util.Scanner;

    public class BankAccess {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            BankAccount newAccount = new BankAccount("00-02-3536-373", 1000, "Mohammed");;
            boolean exit = false;

            while (!exit) {
                System.out.println("\nBank Account Menu:");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                int option = sc.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("The bank balance is: " + newAccount.getBalance());
                        break;
                    case 2:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = sc.nextDouble();
                        newAccount.deposit(depositAmount);
                        System.out.println("The bank balance is: " + newAccount.getBalance());
                        break;
                    case 3:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = sc.nextDouble();
                        newAccount.withdraw(withdrawAmount);
                        System.out.println("The bank balance is: " + newAccount.getBalance());
                        break;
                    case 4:
                        exit = true;
                        System.out.println("Thank you!");
                        break;
                    default:
                        System.out.println("Invalid option. Try again.");
                }
            }

            sc.close();
        }
    }
