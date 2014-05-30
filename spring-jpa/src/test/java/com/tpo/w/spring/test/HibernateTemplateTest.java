package com.tpo.w.spring.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tpo.w.spring.dao.IUserDao;
import com.tpo.w.spring.entity.User;

@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration( locations = { "classpath:hibernate-template.xml" } )
public class HibernateTemplateTest {

  @Autowired
  private IUserDao dao;

  @Test
  public void createAUser() {
    insertAUser( "user2" );
    insertAUser( "user1" );
    listAll();
  }

  private void listAll() {
    List< User > users = dao.getAllUsers();

    for ( User user : users )
      System.out.println( user.getName() );
  }

  private User insertAUser( String aName ) {
    User user = new User();
    user.setName( aName );
    dao.addUser( user );
    return user;
  }
}