package estate;

import java.util.GregorianCalendar;
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

}
