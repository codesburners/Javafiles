import java.util.*;
class Account{
    int accNo;
    String name;
    String address;
    int Phone;
    String date;
    public int getaccNo(){
        return accNo;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public int getPhone(){
        return Phone;
    }
    public String date(){
        return date;
    }
    public void setPhone(int Phone)
    {
        this.Phone=Phone;
    }
    public void setDate(String date)
    {
        this.date=date;
    }
    public Account(int accNo,String name,String address,int phone,String date)
    {
        this.accNo=accNo;
        this.name=name;
        this.address=address;
        setPhone(phone);
        setDate(date);
    }
}
class SavingAccount extends Account{
    SavingAccount(int accNo,String name,String address,int phone,String date)
    {
        super(accNo,name,address,phone,date);
    }
    double balance=10000;
    public double withdrawl()
    {
        return balance;
    }
    public double deposit(double amount)
    {
        balance+=amount;
        return balance;
    }
    public double liquidate(double amount)
    {
        balance-=amount;
        return balance;
    }
    public double fixedDeposit(double amount)
    {
        balance+=amount;
        return balance;
    }
public void display(){
        System.out.println("Name: "+name);
        System.out.println("Account number: "+accNo);
        System.out.println("Address: "+address);
        System.out.println("Phone number: "+Phone);
        System.out.println("Date: "+date);
        System.out.println("Balance: "+balance);
}
}
class LoanAccount extends Account{
    LoanAccount(int accNo,String name,String address,int phone,String date)
    {
        super(accNo,name,address,phone,date);
    }
    public void payEMI(double amount)
    {
        System.out.println("EMI paid");
    }
    public void topupLoan(double amount)
    {
        System.out.println("Loan topped up");
    }
    public void repayment(double amount)
    {
        System.out.println("Repayment done");
    }
    public void display()
    {
        System.out.println("Loan Account");
    }
}
public class Inheritance2 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        LoanAccount l1=new LoanAccount(123,"Rahul","Delhi",1234567890,"12/12/2020");
        l1.display();
        SavingAccount s1=new SavingAccount(123,"Rahul","Delhi",1234567890,"12/12/2020");
        s1.display();
        System.out.println("Enter the amount to deposit: ");
        double amount=s.nextDouble();
        System.out.println("The balance after depositing is: " + s1.deposit(amount));
    }
    }