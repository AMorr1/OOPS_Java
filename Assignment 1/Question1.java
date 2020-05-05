
class Animals
{

	String name;
	int age;
	String getname()
	{
		return name;
	}
	int getage()
	{
		return age;
	}
	void talk()
	{
		System.out.println("Hello");
	}
}
class Lion extends Animals
{
	Lion(String n, int a)
	{
		this.name=n;
		this.age=a;
	}
	void talk()
	{
		System.out.println("Name of the animal is "+name+"\n"+"Age of the animal is "+age);
		System.out.println("Type::Animal is a Lion");
	}
}
class Tiger extends Animals
{
	Tiger(String n, int a)
	{
		this.name=n;
		this.age=a;
	}
	void talk()
	{
		System.out.println("Name of the animal is "+name+"\n"+"Age of the animal is "+age);
		System.out.println("Type::Animal is a Tiger");
	}
}
class Other_Animals extends Animals
{
	Other_Animals(String n, int a)
	{
		this.name=n;
		this.age=a;
	}
	void talk()
	{
		System.out.println("Name of the animal is "+name+"\n"+"Age of the animal is "+age);
		System.out.println("Type::Other's");
	}
}
class Zoo
{
	static int i=0;
	int j;
    Animals[] array1 = new Animals[10];
    {
    for(j=0;j<10;j++)
    {
    array1[j]= new Animals();
    }
    }
	void addanimal(String n, int a, int ani)
	{
		if(ani==1)
		{
			array1[i]=new Lion(n,a);
			i=i+1;
		}
		else if (ani==2)
		{
			array1[i]=new Tiger(n,a);
			i=i+1;
		}
		else if (ani==3)
		{
			array1[i]=new Other_Animals(n,a);
			i=i+1;
		}
	}
	void displayanimals()
	{
		String dname;
		int c;
		System.out.println("Animals in the zoo are");
		for(c=0;c<i;c++)
		{
			dname= array1[c].getname();
			System.out.println(dname);
		}
	}
	void display()
	{
		String dname;
		int dage;
		int c;
		for(c=0;c<i;c++)
		{
			dname= array1[c].getname();
			dage= array1[c].getage();
            System.out.println("Name of the animal is "+dname);
            System.out.println("Age of the animal is "+dage);
		}
	}
	void feedingtime()
	{
		int c;
		for(c=0;c<i;c++)
		{
			array1[c].talk();
		}
	}
}
public class Question1 
{
	public static void main (String args[])
	{
		String name;
		int age,t,choice;
		Zoo zobj = new Zoo();
		Scanner sc = new Scanner(System.in);
		do
		{
		System.out.println("Press 1 to add a new animal to the zoo");
		System.out.println("Press 2 to display all the animals in the zoo");
		System.out.println("Press 3 to display all the name and age of the animal in a selected type");
		System.out.println("Press 4 to trigger the feeding time");
		int a =sc.nextInt();
		sc.nextLine();

		switch(a)
		{
		case 1:
		{
			System.out.println("Enter the name of the Animal");
			name= sc.nextLine();
			System.out.println("Enter the age of the Animal");
			age= sc.nextInt();
			System.out.println("Enter the type of Animal\n1 for lion \n2 for tiger \n3 for other ");
			t= sc.nextInt();
			zobj.addanimal(name , age , t);
			break;
		}
		case 2:
		{
			zobj.displayanimals();
			break;
		}
		case 3:
		{
			zobj.display();
			break;
		}
		case 4:
		{
			zobj.feedingtime();
		}
		default:
		{
			System.out.println("Invalid choice");
		}
		}
		System.out.println("Do u want to continue Press 1 to continue");
		choice= sc.nextInt();
		}while(choice==1);
	}

}
