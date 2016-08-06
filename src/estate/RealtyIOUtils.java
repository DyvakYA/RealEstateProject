package estate;

import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Dyvak on 03.08.2016.
 */

public class RealtyIOUtils {

    public static final String CSV_DELIMITER = ";";

    private RealtyIOUtils() {}

    // Input from Text File

    public static Realty readRealtyFromFile(String fileName) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            return  readRealty(reader);
        } finally {
            closeReader(reader);
        }
    }

    public static void closeReader(BufferedReader reader) {
        try {
            if (reader != null) {
                reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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

    public static Realty readRealty(BufferedReader reader) throws IOException {
        String line = reader.readLine(); // John;25
        return parseRealty(line);
    }

    public static Realty parseRealty(String s) {
        String[] tokens = s.split(CSV_DELIMITER);

        String realty = tokens[0];
        String area = tokens[1];
        String district = tokens[2];
        String street = tokens[3];
        int houseNumber = Integer.parseInt(tokens[4]);
        int numberOfRooms = Integer.parseInt(tokens[5]);
        String description = tokens[6];

        if (realty == "h") {
            return new House(realty, area, district, street, houseNumber, numberOfRooms, description);
        }else{
            return new Flat(realty, area, district, street, houseNumber, numberOfRooms, description);


            }
        }
    }
