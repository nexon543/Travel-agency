package com.epam.domain;

public class Country extends Entity{
  private Integer id;
  private String name;

  public Country() {
  }

  public Integer getId() {
    return id;
  }

  public Country setId(Integer id) {
    this.id = id;
    return this;
  }

  public String getName() {
    return name;
  }

  public Country setName(String name) {
    this.name = name;
    return this;
  }

  @Override
  public String toString() {
    return "Country{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
  }
}
