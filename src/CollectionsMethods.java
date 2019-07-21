
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class CollectionsMethods {
    public static void main (String [] args){
        Disjoint();
        BinarySearch();
    }
          public static void Disjoint(){
/*The disjoint() method of Java Collections class is used to check whether 
two specified collections are disjoint or not. It returns true if the two specified collections have no elements in common.*/
          List<String> list1 = new ArrayList<String>(5);  
          List<String> list2 = new ArrayList<String>(10);  
          //Add elements in both lists  
          list1.add("Java");  
          list1.add("PHP");  
          list1.add("JavaScript");  
          list2.add("C++");  
          list2.add("C");  
          list2.add("C#");        
          //Check elements in both List  
          //It returns true if no elements are common.  
          boolean iscommon = Collections.disjoint(list1, list2 );  
          System.out.println("Output: "+iscommon);     
          }
          public static void BinarySearch(){
             //Arrays.binarySearch() is the simplest and most efficient method to find an element in a sorted array in Java 
              //the array must be sorted or else the results of the searchu will be undefined
              
        char charArr[] = {'g','p','q','c','i'}; 
        int intArr[] = {10,20,15,22,35}; 
        double doubleArr[] = {10.2,15.1,2.2,3.5}; 
        
  
       
        Arrays.sort(charArr); 
        Arrays.sort(intArr); 
        Arrays.sort(doubleArr); 
      
       
       
        char charKey = 'g'; 
        int intKey = 22; 
        double doubleKey = 3.5; 
    
  
        
        System.out.println(charKey + " found at index = "
                           +Arrays.binarySearch(charArr,charKey)); 
        System.out.println(intKey + " found at index = "
                           +Arrays.binarySearch(intArr,intKey)); 
        System.out.println(doubleKey + " found at index = "
                           +Arrays.binarySearch(doubleArr,doubleKey)); 
       
          }
}  
  
    
 
    

