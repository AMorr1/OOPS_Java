package pkg1;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
class Account
{
	Random r = new Random();
	Scanner sc = new Scanner(System.in);
	String name;
	int accno;
	String type;
	double balance;
	void input()
	{
		System.out.println("Enter Name");
		name=sc.nextLine();
		sc.nextLine();
		System.out.println("Account number Assigned");
		accno=r.nextInt(10000);
		System.out.println("Enter the type of account");
		type = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter the balance");
		balance = sc.nextInt();
	}
	void display()
	{
		System.out.println("Name :: "+name+"\nAccount number :: "+accno+"\nType :: "+type+"\nBalance :: "+balance);
	}
	void deposit()
	{
		int amt;
		System.out.println("Enter the amount u want to deposit");
		amt = sc.nextInt();
		balance= balance +amt;
	}
}
class Saving_account extends Account
{
	Scanner s = new Scanner(System.in);
	double interest;
	double compound()
	{
		int time,rate;
		rate=10;
		System.out.println("Enter the Time ");
		time=s.nextInt();
		interest = balance*Math.pow(1+rate/100.0,time)-balance;
		return interest;
	}
	void update_balance()
	{
		balance= balance + compound();
	}
	void withdrawal()
	{
		int am;
		System.out.println("Enter the amount to withdrawal");
		am = s.nextInt();
		if(balance >= am)
		{
			System.out.println("Withdrawal Successfull :: Balance updated");
			balance= balance - am;
		}
		else
		{
			System.out.println("Ypour balance is low, can not withdraw");
		}
	}
}
class Current_account extends Account
{
	Scanner s = new Scanner(System.in);
	int chequebook,penalty;
	int minimum()
	{
		int r=1;
		if(balance <= 500)
		{
			penalty=50;
			balance=balance-penalty;
			r=0;
		}
		else
		{
			System.out.println("No penalty ");
		}
		return r;
	}
	void withdrawal()
	{
		int amount;
		System.out.println("Enter the amount u want to withdraw");
		amount= s.nextInt();
		int count=minimum();
		if(count == 1)
		{
			if(balance > amount)
			{
				balance = balance - amount;
				System.out.println("Withdrwal Sucessful");
			}
		}
		else
		{
			System.out.println("Because of minimum balance u cannot withdraw");
		}
	}
}
public class Question4 {

	public static void main(String[] args) 
	{
		Current_account c1 = new Current_account();
		Saving_account s1 = new Saving_account();
	      c1.input();
	      c1.display();
	      c1.deposit();
	      c1.display();
	      c1.withdrawal();
	      c1.display();
	      s1.input();
	      s1.display();
	      s1.deposit();
	      s1.display();
	      s1.withdrawal();
	      s1.display();
	      double ss= s1.compound();
	      System.out.println("Compound Interest Is "+ss);

	}

}
