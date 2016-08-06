package runner;

import estate.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static estate.RealtyIOUtils.*;
import static estate.RealtyUtils.*;

/**
 * Created by Дмитрий on 22.07.2016.
 */
public class Runner {

    public static final String OUTPUT_TEXT_FILE = "src/estate/file.out";

    public static void main(String[] args) {

        // Sellers
        List<Seller> sellers = new ArrayList<>();

        Seller s1 = new Seller();
        s1.setName("Vasia");
        s1.setSurname("Popov");
        s1.setPhoneNamber("+38-(066)-666-66-66");
        sellers.add(s1);

        Seller s2 = new Seller();
        s2.setName("Kolia");
        s2.setSurname("Bykov");
        s2.setPhoneNamber("+38-(077)-777-77-77");
        sellers.add(s2);

        //Reading from file Realty objects
        List<Realty> real = null;
        try {
            real = readRealtiesFromFile(OUTPUT_TEXT_FILE);
            System.out.println(real);
        } catch (IOException e) {
            e.printStackTrace();
        }
        separator();

//        s1.addRealties(h1);
//        s2.addRealties(h2);
//        s1.addRealties(f1);
//        s2.addRealties(f2);

        //Printing all Sellers
        printAll(sellers);
        separator();

        //Filter realties by price less 5000
        List<Realty> filtered = FilterUtils.filterLowerPrice(real, 5000);

        for (Realty i : filtered) {
            System.out.println(i.getStreet() + " " + i.getHouseNumber() + " Price: " + i.getPrice());
        }
        separator();

        //Sorting realties by price
        Collections.sort(real, SortUtils.PRICE);

        for (Realty i : real) {
            System.out.println(i.getStreet() + " " + i.getHouseNumber() + " Price: " + i.getPrice());
        }
    }}

