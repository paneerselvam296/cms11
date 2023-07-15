package com.Example.Service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Example.DAO.AdminDAO;
import com.Example.entity.AdminModel;

@Service("adminServiceV2")

public class AdminService {
    @Autowired
    private AdminDAO ad;

    public List<AdminModel> getAllUsers() {
        return ad.findAll();
    }

    public void saveUser(AdminModel a) {
        ad.save(a);
    }

    /*public AdminModel fetchUserByEmailAndPassword(String email, String password) {
        return ad.findByEmailAndPassword(email, password);
    }*/
}
