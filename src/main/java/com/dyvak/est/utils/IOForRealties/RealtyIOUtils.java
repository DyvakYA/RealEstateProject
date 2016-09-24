package com.dyvak.est.utils.IOForRealties;

import com.dyvak.est.estate.Flat;
import com.dyvak.est.estate.House;
import com.dyvak.est.estate.Realty;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Dyvak on 03.08.2016.
 */

public class RealtyIOUtils {

    public static final String CSV_DELIMITER = ";";

    private RealtyIOUtils() {}

    // Input from Text File

       public static List<Realty> readRealtiesFromFile(String fileName) throws IOException {
        // try-with-resources (Java 7)
        try (BufferedReader reader =
                     new BufferedReader(new FileReader(fileName))) {
            return readRealties(reader);
        }
    }

       private static List<Realty> readRealties(BufferedReader reader) throws IOException {
        List<Realty> realties = new LinkedList<>();

        String line;
        while ((line = reader.readLine()) != null) {
            Realty realty = parseRealty(line);
            realties.add(realty);
        }

        return realties;
    }

       public static Realty parseRealty(String s) {
        String[] tokens = s.split(CSV_DELIMITER);

           String h1 = tokens[0];
           int area  = Integer.parseInt(tokens[1]);
           String district = tokens[2];
           String street = tokens[3];
           int houseNumber = Integer.parseInt(tokens[4]);
           int numberOfRooms = Integer.parseInt(tokens[5]);
           String description = tokens[6];


        if (h1.equals("house")) {
            return new House(area, district, street, houseNumber, numberOfRooms,  description);
        }if (h1.equals("flat")){
            return new Flat(area, district, street, houseNumber, numberOfRooms,  description);
        }else{
            return null;
           }
       }

}
