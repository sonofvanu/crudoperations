package com.niit.backend.daoimpl;

import java.util.List;

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


	public List<UserModel> listOfUsers() {
		// TODO Auto-generated method stub
		
		List<UserModel> allUsers=null;
		try {
			Session session=sessionFactory.openSession();
			Transaction transaction=session.beginTransaction();
			allUsers=session.createQuery("From UserModel").list();
			transaction.commit();
			session.close();
			return allUsers;
		} catch (Exception e) {
			// TODO: handle exception
			return allUsers;
		}
	}


	public UserModel singleUser(String userName) {
		// TODO Auto-generated method stub
		UserModel userModel=null;
		
		try {
			Session session=sessionFactory.openSession();
			Transaction transaction=session.beginTransaction();
			userModel=(UserModel)session.get(UserModel.class, userName);
			transaction.commit();
			session.close();
			return userModel;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("no such userfound     "+e);
			return userModel;
		}
	}


	public boolean deleteUser(UserModel userModel) {
		// TODO Auto-generated method stub
		try {
			Session session=sessionFactory.openSession();
			Transaction transaction=session.beginTransaction();
			session.delete(userModel);
			transaction.commit();
			session.close();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}

}
