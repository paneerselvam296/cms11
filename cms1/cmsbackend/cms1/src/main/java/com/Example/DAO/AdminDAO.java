package com.Example.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Example.entity.AdminModel;

public interface AdminDAO extends JpaRepository<AdminModel,String> {
//	public AdminModel findByEmailAndPassword(String email,String password);

	public AdminModel findByEmail(String email);



	

}
