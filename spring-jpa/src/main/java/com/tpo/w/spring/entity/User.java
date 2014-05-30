package com.tpo.w.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

  @Id
  @GeneratedValue( strategy = GenerationType.AUTO )
  @Column( name = "ID", nullable = false )
  private int id;

  private String name;

  public String getName() {
    return name;
  }

  public void setName( String name ) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId( int id ) {
    this.id = id;
  }

}
