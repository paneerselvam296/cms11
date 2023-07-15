package com.Example.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Example.DAO.LaptopDAO;
import com.Example.entity.LaptopModel;
@Service
public class LaptopService {
 @Autowired
 LaptopDAO ld;
	public List<LaptopModel> getAllLaptops() {
		// TODO Auto-generated method stub
		return ld.findAll();
	}
	public void saveL(LaptopModel l) {
		// TODO Auto-generated method stub
		ld.save(l);
		//long count=ld.count();

		
	}
	public void saveLap(LaptopModel l) {
		// TODO Auto-generated method stub
		ld.save(l);
		
	}
	public void deletelap(LaptopModel id) {
		// TODO Auto-generated method stub
		ld.delete(id);

	}


}
