package Task2;

import java.util.Arrays;

public class Customer {

    private String name;
    private String surname;
    private int age;
    private int personalNumber;
    private Loan[] loans = new Loan[0];


    public Customer(String name, String surname, int age, int personalNumber) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.personalNumber = personalNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(int personalNumber) {
        this.personalNumber = personalNumber;
    }

    public void print(){
        double totalAmount = 0;
        System.out.println("Customers information: "+ name +" "+ surname + " age "+ age +" "+ personalNumber);
        for (int i=0; i<loans.length; i++){
            totalAmount = totalAmount + loans[i].getAmount();
            System.out.println("Loan number: "+(i+1)+" information: "+loans[i].getId() +" "+ loans[i].getLoanType() +" "+ loans[i].getAmount() +" "+ loans[i].getTerminationDate());
        }
        System.out.println("Total amount of loans: "+totalAmount);
    }

    public void addLoan(Loan loan){
        loans = Arrays.copyOf(loans, loans.length + 1);
        loans[loans.length - 1] = loan;
    }
}
