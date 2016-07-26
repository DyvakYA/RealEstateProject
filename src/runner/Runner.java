package runner;

import estate.*;

import java.util.List;

/**
 * Created by Дмитрий on 22.07.2016.
 */
public class Runner {
    public static void main(String[] args) {

        Seller s1 = new Seller();
        s1.setName("Vasia");
        s1.setSurname("Popov");
        s1.setPhoneNamber("+38-(066)-666-66-66");



        House h1 = new House();
        h1.setCourtyardArea(300);
        h1.setHasGarage(true);
        h1.setNumberOfFloors(2);
        h1.setArea(300);
        h1.setDescription("Fine place near the river. ");
        h1.setDistrict("Obolon");
        h1.setHouseNumber("10");
        h1.setNumberOfRooms(5);
        h1.setStreet("Shevchenko");
        h1.setSeller(s1);

        House h2 = new House();
        h2.setCourtyardArea(500);
        h2.setHasGarage(true);
        h2.setNumberOfFloors(3);
        h2.setArea(500);
        h2.setDescription("Fantastic house in the center of Kyiv. ");
        h2.setDistrict("Podol");
        h2.setHouseNumber("1");
        h2.setNumberOfRooms(8);
        h2.setStreet("Hreshchatyk");
        h2.setSeller(s1);

        Flat f1 = new Flat();
        f1.setBuildingFloors(9);
        f1.setFloor(5);
        f1.setPrimary(true);
        f1.setArea(80);
        f1.setDescription("Nice view from the window. ");
        f1.setDistrict("Obolon");
        f1.setHouseNumber("1");
        f1.setNumberOfRooms(3);
        f1.setStreet("Shevchenko");
        f1.setSeller(s1);

        s1.addRealties(h1);
        s1.addRealties(h2);
        s1.addRealties(f1);

        System.out.println(s1.getRealties());

        List<Realty> filtered = FilterUtils.filterLowerPrice(s1.getRealties(), 10000000);

        for(Realty i: filtered) {
            System.out.println(i.getStreet() + " " +i.getHouseNumber());
        }
    }

}
