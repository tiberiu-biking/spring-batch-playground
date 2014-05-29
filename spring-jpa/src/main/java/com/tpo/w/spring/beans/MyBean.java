package com.tpo.w.spring.beans;

public class MyBean implements IMyBean {

  private String name;

  public MyBean( String name ) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }

  public void setName( String name ) {
    this.name = name;
  }

}
