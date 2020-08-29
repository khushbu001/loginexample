package com.example.login.example;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepo extends JpaRepository<LoginModel, Long> {

	@Query("select username from LoginModel where username =username")
	public ArrayList<String> findDuplicateUser(@Param("username") String username);

}
