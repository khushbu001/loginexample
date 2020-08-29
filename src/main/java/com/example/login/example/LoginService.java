package com.example.login.example;

import org.springframework.stereotype.Service;

@Service
public interface LoginService {

	public LoginModel add(LoginModel loginModel);

	public void update(Long id, LoginModel loginmodel);

	public void delete(Long id);

	public void getOne();

	public void getAll(Long id);

}
