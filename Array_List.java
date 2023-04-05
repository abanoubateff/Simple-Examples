// Array List 
package array_list;
import java.util.ArrayList;

public class Array_List {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ArrayList<String> list= new ArrayList<String>();
        
        list.add("abanoub");
        list.add("atef");
        list.add("waheb");
    System.out.println(list.size());
    System.out.println(list.get(0)); 
    
    list.add(3, "abdo");
    list.set(2, "wahib");
    System.out.println(list);
    
    list.remove(3);
    System.out.println(list);
    
    
    }
    
}
