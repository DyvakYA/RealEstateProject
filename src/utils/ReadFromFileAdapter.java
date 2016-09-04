package utils;

import estate.Realty;
import estate.Seller;

import java.util.List;

/**
 * Created by Dyvak on 04.09.2016.
 */
public class ReadFromFileAdapter extends ReadFromFile implements ReadFromFileInterface{
        public List<Seller> createSellersAndLog(){
            Log.log("Seller");
            createSellers();
            return super.createSellers();
        }

        public List<Realty> createRealtiesAndLog(){
            Log.log("Realties");
            createRealties();
            return super.createRealties();
        }
    }

