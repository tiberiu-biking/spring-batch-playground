package com.tpo.w.spring.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.beans.BeansException;

import com.tpo.w.spring.SpringContext;
import com.tpo.w.spring.beans.IMyBean;

public class SpringContextTest {

  @Test
  public void test() {
    IMyBean myBean;
    try {
      myBean = SpringContext.getBean( IMyBean.class );
      System.out.println( myBean.getName() );
      assertTrue( myBean.getName().equals( "MyBean" ) );
    } catch ( BeansException e ) {
      e.printStackTrace();
    }
  }
}
