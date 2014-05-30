package com.tpo.w.spring.dao;

import java.util.List;

import com.tpo.w.spring.entity.User;

public interface IUserDao {

  List< User > getAllUsers();

  void addUser( User user );

}
