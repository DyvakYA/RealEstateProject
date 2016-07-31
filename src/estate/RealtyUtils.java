package estate;

import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;

public final class RealtyUtils {

        private RealtyUtils() {
        }

        public static long getId() {
            Random rnd = new Random();
            return rnd.nextLong();
        }

        public static long getData() {
            return new GregorianCalendar().getTime().getTime();
        }


        public static void printAll(List<?> list) {
            for (Object i : list) {
                System.out.println(i);
            }
        }

        public static void separator(){
            System.out.println("-------------------------------------------------------------------");

    }
}
