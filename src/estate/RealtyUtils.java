package estate;

import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;

final class RealtyUtils {

    private RealtyUtils() {
    }

    public static long getId() {

        Random rnd = new Random();
        return rnd.nextLong();
    }

    public static long getData() {

        return new GregorianCalendar().getTime().getTime();
    }
    
    public static void getAll(List<Realty> estates){

        System.out.println("Show all list");
            for(Realty i: estates){
                System.out.println(i);
            }
    System.out.println("------------------");  
    }

    public static <T> void printList(List<T> list) {

            for (T elem : list) {
                System.out.println(elem);
            }
        System.out.println();
    }

    public static <T> void printList(String message, List<T> list) {

        System.out.println(message);
        printList(list);
    }

}
