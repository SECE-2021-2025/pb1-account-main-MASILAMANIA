package Scenario1;

// Bank account


//import java.io.*;
public class Accounts {
    private  int id;
    private String name;
    private int balance;
    //static int incre=0;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    Accounts(int id,String name)
    {
        this.id=id;
        this.name=name;
       // this.balance=balance;
    }
  
    Accounts(int id,String name,int balance)
    {
        this.id=id;
        this.name=name;
        this.balance=balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int  credit(int amount)
    {
               this.balance=this.balance+amount;
            //    System.out.println(this.id);
            //    System.out.println(this.balance);
               return this.balance;
    }

    public int debit(int amount)
    {   
        if(this.balance>amount)
        {
        this.balance=this.balance-amount;
        return this.balance;
        }
        else
        System.out.println("Insufficient money:Your account has ");
        
        return this.balance;
        
    }

    public int transfer(Accounts acc,int amount)
    {
        if(amount<=this.balance){
                acc.setBalance(acc.getBalance()+amount);
                this.balance-=amount;
                return this.balance;
        }
        else
        {
            System.out.println("Insufficient balance");
            return this.balance;
        }
    }
   
    @Override
    public String toString()
    {
        return "The account id = "+this.id+",The name is = "+this.name+" ,The balance = "+this.balance;
    }


    
}
