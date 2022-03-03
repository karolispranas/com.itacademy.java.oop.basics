package Task2;

public class LoansApplication {

    public static void main(String[] args) {
        Customer customer1 = new Customer("Jonas", "Jonelis", 25, 1);
        Loan loan1 = new Loan(1,2000.0, LoanType.Leasing, "2023-12-23");
        Loan loan2 = new Loan(2,3000.0, LoanType.Consumer_loan, "2024-12-23");
        customer1.addLoan(loan1);
        customer1.addLoan(loan2);
        customer1.print();
    }

}
