package eTicaretDemo.core.abstracts;

public interface RegisterService {
	void registerSystem(String email, String password);
	void loginSystem(String email, String password);
}
