import java.io.*; 
import java.util.HashSet; 
  
public class Exp97 { 
    public static void main(String args[]) 
    { 
         HashSet<String> set = new HashSet<String>();  
        set.add("Anurag"); 
        set.add("Mor"); 
        set.add("DevOps"); 
        set.add("Cs"); 
        set.add("Dehradun"); 
        System.out.println("HashSet: " + set); 
        HashSet cloned_set = new HashSet(); 
        cloned_set = (HashSet)set.clone(); 
        System.out.println("The clone set: " + cloned_set); 
        set.clear(); 
         System.out.println("The deleted set: " + set);
System.out.println("List contains Anurag or not:" + set.contains("Anurag"));

    } 
}