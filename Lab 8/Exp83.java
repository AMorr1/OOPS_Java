import java.io.*; 
public class Exp83
{
public static void main(String a[]) throws IOException
{
DataInputStream in=new DataInputStream(System.in); 
System.out.println("Enter file Statement:");
String s1=in.readLine();
System.out.println(s1.toUpperCase());
}
}