package eTicaretDemo.dataAccess.abstracts;

import java.util.List;

import eTicaretDemo.entitites.concretes.User;

public interface UserDao {
	void register( User user );
	void login( User user );
	List<User> getall();
	
	
	
	
}
