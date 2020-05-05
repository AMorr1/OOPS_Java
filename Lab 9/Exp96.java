import java.util.*; 
  public class Exp96 { 
    public static void main(String[] args) 
    {  
        HashMap<Integer, String> map = new HashMap<Integer, String>(); 
        map.put(1, "Anurag"); 
        map.put(2, "Mor"); 
        map.put(3, "DevOps"); 
        int keyToBeChecked = 2; 
        System.out.println("HashMap: " + map); 
        Iterator<Map.Entry<Integer, String> > iterator = map.entrySet().iterator(); 
         boolean isKeyPresent = false; 
        while (iterator.hasNext()) { 
            Map.Entry<Integer, String> entry = iterator.next();  
            if (keyToBeChecked == entry.getKey()) { 
  
                isKeyPresent = true; 
            } 
        } 
        System.out.println("Does key " + keyToBeChecked  + " exists: " + isKeyPresent); 
        System.out.println("Initial Mappings are: " + map);  
        System.out.println("Is the value 'Mor' present? " + map.containsValue("Mor"));  
        System.out.println("Is the value 'Anu' present? " + map.containsValue("Anu")); 
        System.out.println("Key values are: " + map);


    } 
} 