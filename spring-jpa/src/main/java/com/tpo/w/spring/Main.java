package com.tpo.w.spring;

import java.util.List;

import com.tpo.w.spring.dao.UserDao;
import com.tpo.w.spring.entity.User;

public class Main {

  public static void main( String[] args ) {
    new Main().start();
  }

  private void start() {
    UserDao dao = SpringContext.getBean( UserDao.class );

    User user = new User();
    user.setName( "test" );
    dao.addUser( user );

    List< User > users = dao.getAllUsers();

    for ( User user1 : users )
      System.out.println( user1.getName() );
  }
}
