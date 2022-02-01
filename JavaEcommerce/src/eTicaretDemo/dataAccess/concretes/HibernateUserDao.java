package eTicaretDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTicaretDemo.dataAccess.abstracts.UserDao;
import eTicaretDemo.entitites.concretes.User;

public class HibernateUserDao implements UserDao{
	
	List<User> users = new ArrayList<User>();
	
	
	@Override
	public void register(User user) {
		System.out.println("Kayıt Basarili" + user.getName());
		users.add(user);
		
	}

	@Override
	public void login(User user) {

		System.out.println("Giris Basarili: "+ user.getName());
	}

	@Override
	public List<User> getall() {
		
		return users;
	}

}
