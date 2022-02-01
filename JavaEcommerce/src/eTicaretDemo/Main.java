package eTicaretDemo;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTicaretDemo.business.concretes.EmailValideteManager;
import eTicaretDemo.business.concretes.UserManager;
import eTicaretDemo.core.abstracts.RegisterService;
import eTicaretDemo.core.concrete.GoogleRegister;
import eTicaretDemo.dataAccess.concretes.HibernateUserDao;
import eTicaretDemo.entitites.concretes.User;


public class Main {
  public static void main(String[] args) {
    
	  User user= new User("Berkay","Ergün","abc@gmail.com","123456");
	 
	  UserManager userManager= new UserManager(new HibernateUserDao(), new EmailValideteManager());
	  userManager.register(user);
	  userManager.login(user);
	  Pattern pattern = Pattern.compile("@gmail.com", Pattern.CASE_INSENSITIVE);
      Matcher matcher = pattern.matcher(user.getEposta());
      boolean matchFound = matcher.find();
      if(matchFound) {
        System.out.println("Match found");
      } else {
        System.out.println("Match not found");
      }
	  
	  RegisterService googleRegister= new GoogleRegister();//bağımlılık kalktı.
	  googleRegister.registerSystem("abc@gmail.com", "123456");
	  googleRegister.loginSystem("abc@gmail.com","123456");
	 
	  
	  
  }
}