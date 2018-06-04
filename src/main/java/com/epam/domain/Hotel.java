package com.epam.domain;

import java.util.Objects;

public class Hotel {
  private Integer id;
  private String name;
  private String phone;
  private Double stars;

  public Hotel() {
  }

  public Integer getId() {
    return id;
  }

  public Hotel setId(Integer id) {
    this.id = id;
    return this;
  }

  public String getName() {
    return name;
  }

  public Hotel setName(String name) {
    this.name = name;
    return this;
  }

  public String getPhone() {
    return phone;
  }

  public Hotel setPhone(String phone) {
    this.phone = phone;
    return this;
  }

  public Double getStars() {
    return stars;
  }

  public Hotel setStars(Double stars) {
    this.stars = stars;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Hotel hotel = (Hotel) o;
    return Objects.equals(id, hotel.id) &&
        Objects.equals(name, hotel.name) &&
        Objects.equals(phone, hotel.phone) &&
        Objects.equals(stars, hotel.stars);
  }

  @Override
  public int hashCode() {

    return Objects.hash(id, name, phone, stars);
  }

  @Override
  public String toString() {
    return "Hotel{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", phone='" + phone + '\'' +
        ", stars=" + stars +
        '}';
  }
}
