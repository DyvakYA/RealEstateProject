package utils;

import estate.Realty;
import estate.Seller;

import java.io.IOException;
import java.util.List;

import static utils.RealtyIOUtils.readRealtiesFromFile;
import static utils.RealtyUtils.separator;
import static utils.SellersIOUtils.readSellersFromFile;

/**
 * Created by Dyvak on 13.08.2016.
 */

public class ReadIOFiles {

    public static final String OUTPUT_TEXT_FILE_REALTIES = "src/files/realty.in";
    public static final String OUTPUT_TEXT_FILE_SELLERS = "src/files/seller.in";

    public static List<Seller> createSellers() {

        //Reading from file Realty objects
        List<Seller> sellers = null;
        try {
            sellers = readSellersFromFile(OUTPUT_TEXT_FILE_SELLERS);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sellers;
    }

    public static List<Realty> createRealties() {

        //Reading from file Realty objects
        List<Realty> realty = null;
        try {
            realty = readRealtiesFromFile(OUTPUT_TEXT_FILE_REALTIES);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return realty;
    }

}
