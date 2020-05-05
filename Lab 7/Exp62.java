public class Exp62
{
public static void main(String ar[])
{
int no=0,m=10,result=0; try
{
result=m/no;
 
}
catch(ArithmeticException e)
{
System.out.println(" division by zero "); System.out.println(" value of result has been set as one"); result=1;
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("Result :"+result);
}
}