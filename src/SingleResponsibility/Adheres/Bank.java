package SingleResponsibility.Adheres;

public class Bank {
    public void makeDeposit(){
        System.out.println("Deposited");
    }

    public void makeWithdrawal(){
        System.out.println("Withdrawn");
    }

    public void makeTransfer(){
        System.out.println("Transferred");
    }

    public void makePayment(){
        System.out.println("Paid");
    }
}
