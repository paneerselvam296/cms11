package com.Example.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Example.entity.LaptopModel;

public interface LaptopDAO extends JpaRepository<LaptopModel,Integer> {

	
}