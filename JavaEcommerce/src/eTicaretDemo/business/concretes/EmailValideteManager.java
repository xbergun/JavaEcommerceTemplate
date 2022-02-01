package eTicaretDemo.business.concretes;

import eTicaretDemo.business.abstracts.EmailValidateService;
import eTicaretDemo.entitites.concretes.User;

public class EmailValideteManager implements EmailValidateService{

	@Override
	public void validate(User user) {
			System.out.println("Doğrulama Linki Yollandı. " + user.getEposta());
	}

}
