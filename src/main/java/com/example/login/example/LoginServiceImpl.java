package com.example.login.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginRepo loginRepo;

	@Override
	public LoginModel add(LoginModel loginModel) {
		LoginModel login = null;
		if (loginRepo.findDuplicateUser(loginModel.getUsername()).size() == 0) {
			login = loginRepo.save(loginModel);
		}
		System.out.println("total number of user in database"+loginRepo.findDuplicateUser(loginModel.getUsername()).size());
		return login;
	}

	@Override
	public void update(Long id, LoginModel loginmodel) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getOne() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getAll(Long id) {
		// TODO Auto-generated method stub

	}

}
