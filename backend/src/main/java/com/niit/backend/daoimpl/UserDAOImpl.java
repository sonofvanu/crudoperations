package com.niit.backend.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.backend.dao.UserDAO;
import com.niit.backend.model.UserModel;

@Repository
public class UserDAOImpl implements UserDAO{
	@Autowired
	SessionFactory sessionFactory;
	
	
	public boolean inserttUser(UserModel userModel) {
		// TODO Auto-generated method stub
		try {
			Session session=sessionFactory.openSession();
			Transaction transaction=session.beginTransaction();
			session.save(userModel);
			transaction.commit();
			session.close();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error in registering user \n error obtained is"+e);
			return false;
		}
	}

}
