package utils;

import estate.Realty;
import estate.Seller;

import java.util.List;

/**
 * Created by Dyvak on 04.09.2016.
 */
public class ReadFromFileAdapter extends ReadFromFile implements ReadFromFileInterface{
        public List<Seller> createSellersAndLog(){
            createSellers();
            return super.createSellers();
        }

        public List<Realty> createRealtiesAndLog(){
            createRealties();
            return super.createRealties();
        }
    }

