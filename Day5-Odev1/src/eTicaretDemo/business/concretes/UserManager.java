package eTicaretDemo.business.concretes;

import java.util.List;

import eTicaretDemo.business.abstracts.EmailValidateService;
import eTicaretDemo.business.abstracts.UserService;
import eTicaretDemo.dataAccess.abstracts.UserDao;
import eTicaretDemo.entitites.concretes.User;


public class UserManager implements UserService{
	
	private UserDao userDao;
	private EmailValidateService emaiValidate;
	
	
	
	public UserManager(UserDao userDao, EmailValidateService emaiValidate) {
		
		this.userDao = userDao;
		this.emaiValidate = emaiValidate;
	}

	@Override
	public void register(User user) {
			if(user.getEposta()==null || user.getName()==null ||  user.getLastName()==null || user.getPassword()==null) {
				System.out.println("Lütfen Boş alanlari giriniz. ");
				return;
			}
			else if(user.getPassword().length()<6) {
				System.out.println("Şifreniz 6 karakterden küçük olamaz."+ user.getPassword().length());
				return;
			}
			else if(user.getName().length()<2 || user.getLastName().length()<2) {
				System.out.println("Adiniz ve soyadiniz iki karakterden küçük olamaz."+ user.getName().length()+ " "+user.getLastName().length());
				return;
			}
			else {
				System.out.println("Kullanici eklendi.");
				emaiValidate.validate(user);
			}
		
	}

	@Override
	public void login(User user) {
		if(user.getEposta()=="abc@gmail.com" && user.getPassword()=="123456") {
			userDao.login(user);
		}else {
			System.out.println("Giriş Başarısız.");
		}
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
