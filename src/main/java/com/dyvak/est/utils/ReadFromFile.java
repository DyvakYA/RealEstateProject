package com.dyvak.est.utils;

import com.dyvak.est.estate.Realty;
import com.dyvak.est.estate.Seller;

import java.io.IOException;
import java.util.List;

import static com.dyvak.est.utils.IOForRealties.RealtyIOUtils.readRealtiesFromFile;
import static com.dyvak.est.utils.IOForSellers.SellersIOUtils.readSellersFromFile;

/**
 * Created by Dyvak on 13.08.2016.
 */

public class ReadFromFile {

    public static final String OUTPUT_TEXT_FILE_REALITIES = "src/main/java/com/dyvak/est/files/realty.in";
    public static final String OUTPUT_TEXT_FILE_SELLERS = "src/main/java/com/dyvak/est/files/seller.in";

    public  List<Seller> createSellers() {

        //Reading from file Realty objects
        List<Seller> sellers = null;
        try {
            sellers = readSellersFromFile(OUTPUT_TEXT_FILE_SELLERS);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sellers;
    }

    public  List<Realty> createRealties() {

        //Reading from file Realty objects
        List<Realty> realty = null;
        try {
            realty = readRealtiesFromFile(OUTPUT_TEXT_FILE_REALITIES);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return realty;
    }

}
