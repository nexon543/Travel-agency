package com.epam.domain;

import java.util.Date;

public class Tour {
  private Integer id;
  private String photo;
  private Date date;
  private Integer duration;
  private String description;
  private Integer cost;

  public Tour() {
  }

  public Integer getId() {
    return id;
  }

  public Tour setId(Integer id) {
    this.id = id;
    return this;
  }

  public String getPhoto() {
    return photo;
  }

  public Tour setPhoto(String photo) {
    this.photo = photo;
    return this;
  }

  public Date getDate() {
    return date;
  }

  public Tour setDate(Date date) {
    this.date = date;
    return this;
  }

  public Integer getDuration() {
    return duration;
  }

  public Tour setDuration(Integer duration) {
    this.duration = duration;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public Tour setDescription(String description) {
    this.description = description;
    return this;
  }

  public Integer getCost() {
    return cost;
  }

  public Tour setCost(Integer cost) {
    this.cost = cost;
    return this;
  }

  @Override
  public String toString() {
    return "Tour{" +
        "id=" + id +
        ", photo='" + photo + '\'' +
        ", date=" + date +
        ", duration=" + duration +
        ", description='" + description + '\'' +
        ", cost=" + cost +
        '}';
  }
}
