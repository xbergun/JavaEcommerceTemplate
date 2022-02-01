package eTicaretDemo.core.concrete;

import eTicaretDemo.core.abstracts.RegisterService;

public class GoogleRegister implements RegisterService{
	
	
		
	@Override
	public void registerSystem(String email, String password) {
		System.out.println("Google İle kayıt olundu." + email);
		
	}

	@Override
	public void loginSystem(String email, String password) {
		System.out.println("Google İle Giriş yapildi." + email);
		
	}
	
}
