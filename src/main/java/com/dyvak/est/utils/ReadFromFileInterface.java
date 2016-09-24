package com.dyvak.est.utils;

import com.dyvak.est.estate.Realty;
import com.dyvak.est.estate.Seller;

import java.util.List;

/**
 * Created by Dyvak on 04.09.2016.
 */
public interface ReadFromFileInterface {
    List<Seller> createSellersAndLog();
    List<Realty> createRealtiesAndLog();
}
