package com.epam.repository;

import com.epam.domain.Country;
import java.util.List;

public class CountryRepository {

  public List<Country> findAll(){
    return (List<Country>)Data.data.get(Data.COUNTRY_DATA_KEY);
  }

  public static void main(String[] args) throws ClassNotFoundException {
    Data.init();
    CountryRepository rep=new CountryRepository();
    System.out.println(rep.findAll());
  }
}
