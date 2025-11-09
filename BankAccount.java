package encapsulation;
    public class BankAccount {
        private String accountNumber;
        private double balance;
        private String accountHolderName;

        public BankAccount(String ac, double bal, String name) {
            this.accountNumber = ac;
            this.balance = bal;
            this.accountHolderName = name;
        }

        public void deposit(double amountDeposit) {
            if(amountDeposit<0.0) {
                System.out.println("Invalid Amount , please enter correct amount");
            }else {
                this.balance = this.balance + amountDeposit;
                System.out.println("Deposit successful");
            }
        }

        public void withdraw(double amountWithdrawal) {
            if (amountWithdrawal>this.balance) {
                System.out.println("Your balance is not enough");
            }else if (amountWithdrawal < 0.0) {
                System.out.println("Invalid Amount, please enter correct amount");
            } else {
                this.balance = this.balance - amountWithdrawal;
                System.out.println("You have successfully withdrawn" + amountWithdrawal);
            }

        }

        public double getBalance() {
            return balance;
        }
    }
