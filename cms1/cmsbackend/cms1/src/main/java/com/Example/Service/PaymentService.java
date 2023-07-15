package com.Example.Service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Example.DAO.PaymentDAO;
import com.Example.entity.PaymentModel;
@Service
public class PaymentService {
	@Autowired
    PaymentDAO pd;
	public List<PaymentModel> getAllpay() {
		// TODO Auto-generated method stub
		return pd.findAll();
	}
   public void savep(PaymentModel p) {
	// TODO Auto-generated method stub
	pd.save(p);
		
	}

}
