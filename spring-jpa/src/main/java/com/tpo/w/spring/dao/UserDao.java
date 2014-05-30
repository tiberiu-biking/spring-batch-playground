//<start id="java_contextualHibernateDao"/> 
package com.tpo.w.spring.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.tpo.w.spring.entity.User;

@Repository
public class UserDao implements IUserDao {

  HibernateTemplate template;

  @Autowired
  public UserDao( HibernateTemplate aTemplate ) {
    this.template = aTemplate;
  }

  @Override
  public void addUser( User aUser ) {
    template.save( aUser );
  }

  public User getUserById( long aId ) {
    return template.get( User.class, aId );
  }

  @Override
  public List< User > getAllUsers() {
    return template.findByCriteria( DetachedCriteria.forClass( User.class ) );
  }

}