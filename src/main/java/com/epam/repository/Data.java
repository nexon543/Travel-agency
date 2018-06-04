package com.epam.repository;

import com.epam.domain.Country;
import com.epam.domain.Entity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Data {

  public static Map<String, List<? extends Entity>> data;
  public static String COUNTRY_DATA_KEY="country";

  public static void init(){
    data=new HashMap<>();
    List<Country> countryData=new ArrayList<>();
    countryData.add(new Country());
    countryData.add(new Country());
    data.put(COUNTRY_DATA_KEY, countryData);
  }
}
