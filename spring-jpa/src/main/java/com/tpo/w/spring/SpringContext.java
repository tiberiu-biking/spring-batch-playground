package com.tpo.w.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContext {

  private static final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext( "hibernate-template.xml" );

  public static < T > T getBean( Class< T > aClass ) throws BeansException {
    return context.getBean( aClass );
  }

}