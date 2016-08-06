package runner;


import estate.*;

import java.io.IOException;
import java.util.List;

import static estate.RealtyIOUtils.*;

/**
 * Created by Дмитрий on 22.07.2016.
 */
public class Runner {

    public static final String OUTPUT_TEXT_FILE = "src/estate/file.out";

    public static void main(String[] args) {

        deserialize();

    }



//        List<Seller> sellers = new ArrayList<>();
//
//        Seller s1 = new Seller();
//        s1.setName("Vasia");
//        s1.setSurname("Popov");
//        s1.setPhoneNamber("+38-(066)-666-66-66");
//        sellers.add(s1);
//
//        Seller s2 = new Seller();
//        s2.setName("Kolia");
//        s2.setSurname("Bykov");
//        s2.setPhoneNamber("+38-(077)-777-77-77");
//        sellers.add(s2);
//
//        List<Realty> realties = new ArrayList<>();
//
//
//
//        House h2 = new House();
//        h2.setCourtyardArea(120);
//        h2.setHasGarage(true);
//        h2.setNumberOfFloors(3);
//        h2.setArea(400);
//        h2.setDescription("Fantastic house in the center of Kyiv. ");
//        h2.setDistrict("Podol");
//        h2.setHouseNumber("1");
//        h2.setNumberOfRooms(6);
//        h2.setStreet("Hreshchatyk");
//        h2.setSeller(s2);
//        realties.add(h2);
//
//        Flat f1 = new Flat();
//        f1.setBuildingFloors(9);
//        f1.setFloor(5);
//        f1.setPrimary(false);
//        f1.setArea(80);
//        f1.setDescription("Nice view from the window. ");
//        f1.setDistrict("Obolon");
//        f1.setHouseNumber("1");
//        f1.setNumberOfRooms(3);
//        f1.setStreet("Shevchenko");
//        f1.setSeller(s1);
//        realties.add(f1);
//
//        Flat f2 = new Flat();
//        f2.setBuildingFloors(25);
//        f2.setFloor(7);
//        f2.setPrimary(true);
//        f2.setArea(120);
//        f2.setDescription("Modern infrastructure around the building. ");
//        f2.setDistrict("Obolon");
//        f2.setHouseNumber("5");
//        f2.setNumberOfRooms(4);
//        f2.setStreet("Shevchenko");
//        f2.setSeller(s2);
//        realties.add(f2);
//
//        s1.addRealties(h1);
//        s2.addRealties(h2);
//        s1.addRealties(f1);
//        s2.addRealties(f2);

//        printAll(sellers);
//        separator();
//        printAll(realties);
//        separator();
//
//
//        List<Realty> filtered = FilterUtils.filterLowerPrice(s2.getRealties(), 50000000);
//
//        for(Realty i: filtered) {
//            System.out.println(i.getStreet() + " " + i.getHouseNumber() + " Price: " + i.getPrice() );
//        }
//
//        Collections.sort(filtered, SortUtils.PRICE);
//
//        for(Realty i: filtered) {
//            System.out.println(i.getStreet() + " " + i.getHouseNumber() + " Price: " + i.getPrice() );
//        }

        public static void deserialize() {
            try {
                List<Realty> real = readRealtiesFromFile(OUTPUT_TEXT_FILE);


                System.out.println(real);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return;

           }

}
