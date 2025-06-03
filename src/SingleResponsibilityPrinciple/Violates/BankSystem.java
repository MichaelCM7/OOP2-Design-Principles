package SingleResponsibilityPrinciple.Violates;

class Bank{
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

class Customer{
    public void makePayment(){
        System.out.println("Paid");
    }
}

class Payment{
    public void makePayment(){
        System.out.println("Paid");
    }
}

public class BankSystem {
    public static void main(String[] args){
        Bank bank = new Bank();
        Customer customer = new Customer();
        Payment payment = new Payment();
        bank.makeDeposit();
        bank.makeWithdrawal();
        bank.makeTransfer();
        bank.makePayment();
        customer.makePayment();
        payment.makePayment();
    }
}
