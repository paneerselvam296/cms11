package com.Example.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Example.entity.PaymentModel;

public interface PaymentDAO extends JpaRepository<PaymentModel,Integer>{
	

}
