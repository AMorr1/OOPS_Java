import java.io.*; 
import java.util.ArrayList; 
  public class Exp95 { 
   public static void main(String args[]) 
    { 
 RevArrayList obj = new RevArrayList(); 
        ArrayList<Integer> list = new ArrayList<integer>(); 
        list.add("10"); 
        list.add("20"); 
        list.add("30"); 
        list.add("40"); 
        list.add("50"); 
         System.out.println("First ArrayList: " + list); 
  ArrayList sec_list = new ArrayList(); 
        sec_list = (ArrayList)list.clone(); 
System.out.println("Second ArrayList is: " + sec_list); 
System.out.print("Elements before reversing:"); 
        obj.printElements(list); 
        list = obj.reverseArrayList(list); 
        System.out.print("\nElements after reversing:"); 
        obj.printElements(list);
    } 
} 
class RevArrayList { 
  
    public ArrayList<Integer> reverseArrayList(ArrayList<Integer> alist) 
    { 
    
        ArrayList<Integer> revArrayList = new ArrayList<Integer>(); 
        for (int i = alist.size() - 1; i >= 0; i--) { 
  
            
            revArrayList.add(alist.get(i)); 
        } 
  
       
        return revArrayList; 
    } 
  

    public void printElements(ArrayList<Integer> alist) 
    { 
        for (int i = 0; i < alist.size(); i++) { 
            System.out.print(alist.get(i) + " "); 
        } 
    } 
} 