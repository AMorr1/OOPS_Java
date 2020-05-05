

import java.util.Scanner;
interface Sales
{
	public void getsales();
	public void displaysales();
}
class Publications
{
	float price;
	String title;
	Publications()
	{
		System.out.println("Constructor of Publications Class called");
	}
	Publications(float p,String t)
	{
		price=p;
		title=t;
	}
	void display()
	{
		System.out.println("Display function");
	}
	public void finalize()
	{
		System.out.println("Destructor of Publications Class called");
	}
}
class Book extends Publications implements Sales
{
	Scanner sc = new Scanner(System.in);
	double amount;
	int pagecount,salecount;
	Book()
	{
		System.out.println("Constructor of Book Class called");
	}
	Book(float p, String t,int pc)
	{
		super(p,t);
		pagecount=pc;
	}
	public void getsales()
	{
		System.out.println("Enter the total sale of books");
		salecount= sc.nextInt();
	}
	public void displaysales()
	{
		amount= salecount*price;
		System.out.println("Total amount of sales is "+amount);
		
	}
	void display()
	{
		System.out.println("\n Name of the book is :"+title+"\nPrice of the book is "+price+"\nPage count of the book is "+pagecount);
	}
	public void finalize()
	{
		System.out.println("Destructor of books Class called");
	}
}
class Tape extends Publications implements Sales
{
	Scanner sc = new Scanner(System.in);
	float playingtime,salecount;
	double amount;
	Tape()
	{
		System.out.println("Constructor of Tape Class called");
	}
	Tape(float p, String t, float time)
	{
		super(p,t);
		playingtime=time;
	}
	public void getsales()
	{
		System.out.println("Enter the total sale of Tape");
		salecount= sc.nextInt();
	}
	public void displaysales()
	{
		amount= salecount*price;
		System.out.println("Total amount of sales is "+amount);
		
	}
	void display()
	{
		System.out.println("\n Name of the Tape is :"+title+"\nPrice of the Tape is "+price+"\nTime of the Tape is "+playingtime);
	}
	public void finalize()
	{
		System.out.println("Destructor of Tape Class called");
	}
}
public class Question3 {

	public static void main(String[] args) 
	{
		System.out.println("The order of Constructor and Destructor Invocation is");
		Publications obj1 = new Book();
		obj1.finalize();
		Publications obj2 = new Tape();
		obj2.finalize();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the book");
		String name= sc.nextLine();
		System.out.println("Enter the price of the book");
		Float price = sc.nextFloat();
		System.out.println("Enter the page count of the book");
		int count = sc.nextInt();
		Book obj3 = new Book(price,name, count);
		obj3.display();
		sc.nextLine();
		System.out.println("Enter the name of the Tape");
		String Tname= sc.nextLine();
		System.out.println("Enter the price of the Tape");
		Float Tprice = sc.nextFloat();
		System.out.println("Enter the Time of the tape");
		float Ttime = sc.nextFloat();
		Tape obj4 = new Tape(Tprice, Tname, Ttime);
		obj4.display();
		obj3.getsales();
		obj3.displaysales();
		obj4.getsales();
		obj4.displaysales();
	}

}
