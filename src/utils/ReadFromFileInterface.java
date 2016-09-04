package utils;

import estate.Realty;
import estate.Seller;

import java.util.List;

/**
 * Created by Dyvak on 04.09.2016.
 */
public interface ReadFromFileInterface {
    List<Seller> createSellersAndLog();
    List<Realty> createRealtiesAndLog();
}
