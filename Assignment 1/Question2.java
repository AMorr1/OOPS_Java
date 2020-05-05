import java.util.*;
import java.lang.Math;
class MyException extends Exception 
{
	public MyException(String s)
	{
		super(s);
	}
}
class Rectangle
{
	double ab , bc, cd, ad;
	float length=1.0f;
	float width=1.0f;
	double getlength(float x1, float y1 , float x2, float y2)
	{
		double l;
		l=Math.sqrt(((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));
		return l;
	}
	void set(float[] array)
	{
		int i;
		for(i=0;i<8;i++)
		{
			try
			{
			if(array[i] < 0.0 || array[i] >20.0)
			{
				throw new MyException("Invalid value ");
			}
			}
			catch (MyException ex)
			{
				System.out.println("Invalid value of Co-ordinates, that is Greater than 20.0 or less than 0.0");
			}
		}
		ab=getlength(array[0],array[1],array[2],array[3]);
		bc=getlength(array[2],array[3],array[4],array[5]);
		cd=getlength(array[4],array[5],array[6],array[7]);
		ad=getlength(array[6],array[7],array[0],array[1]);
		System.out.println("Sides are"+ab+" "+bc+" "+cd+" "+ad);
		try
		{
		if(ab!=cd || bc!=ad)
		{
			throw new MyException("Invalid");
		}
		}
		catch (MyException ex)
		{
			System.out.println("Error:: Coordinates do not form a Rectangle");
		}
	}
	Rectangle(float length, float width, float[] arr)
	{
		try
		{
		if(length < 0.0 || length > 20.0)
		{
			throw new MyException("Invalid value of Length (Does not fullfill the conditions");
		}
		if(width < 0.0 || width > 20.0)
		{
			throw new MyException("Invalid value of Width (Does not fullfill the conditions)");
		}
		}
		catch (MyException ex)
		{
			System.out.println("Invalid value of Length or Breath");
		}
		set(arr);
	}
	void perimeter()
	{
		double p;
		p=2*(ab+bc);
		System.out.println("Perimeter of the rectangle is"+p);
	}
	void area()
	{
		double a;
		a= ab*bc;
		System.out.println("Area of the rectangle is "+a);
	}
	void length()
	{
		double l,w;
		if(ab > bc)
		{
			l=ab;
			w=bc;
		}
		else
		{
			l=bc;
			w=ab;
		}
		System.out.println("Length of the Rectangle is "+l);
		System.out.println("Width of the Rectangle is "+w);
	}
}


public class Question2 
{
	public static void main(String[] args) 
	{
		float l=1.0f,w=1.0f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle");
		l= sc.nextInt();
		System.out.println("Enter the width of the rectangle");
		w= sc.nextInt();
		System.out.println("Enter the coordinates of rectangle");
		int i,k=0;
		float[] array1 = new float[8];
		for(i=1;i<=4;i++)
		{
			System.out.println("x"+i+"=");
			array1[k]=sc.nextInt();
			k++;
			System.out.println("y"+i+"=");
			array1[k]=sc.nextInt();
			k++;
		}
		Rectangle obj = new Rectangle(l,w,array1);
		obj.perimeter();
		obj.area();
		obj.length();
	}
}
