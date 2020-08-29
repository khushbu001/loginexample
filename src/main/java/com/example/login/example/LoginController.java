package com.example.login.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class LoginController {
	
	@Autowired
	private LoginServiceImpl loginServiceImpl;

	@PostMapping(value = "login")
	public ResponseEntity<LoginModel> login(@RequestBody LoginModel loginModel) {
		LoginModel login = loginServiceImpl.add(loginModel);
		
		return new ResponseEntity<LoginModel>(HttpStatus.ACCEPTED);
	}
}
