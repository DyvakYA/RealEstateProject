package estate;

import java.util.List;

public class FilterUtils {
    
    static void getPrice( List<Realty> estates, int price){ 
        System.out.println("Filter Price");
        for (Realty i : estates){ 
        if (i.getPrice() > price){ 
              System.out.println(i.toString()); 
          } 
        }
        System.out.println("------------------");
     } 
 
 
    static void getStreet(List<Realty> estates, String street){ 
        System.out.println("Filter Streets");
         for (Realty i: estates){ 
             if (i.getStreet().equals(street)) 
                 System.out.println(i.toString()); 
         } 
         System.out.println("------------------"); 
     }    
}