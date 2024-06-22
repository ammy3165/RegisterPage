package com.amrendra.RegisterPage.Service;

import com.amrendra.RegisterPage.Entity.Register;
import com.amrendra.RegisterPage.Repository.RegisterRepo;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterService {
    @Autowired
    private RegisterRepo registerRepo;

    public Register addToRegister(Register register) {

        if (register!=null){
           register.setName(register.getName());
           register.setEmail(register.getEmail());
           register.setPhoneNumber(register.getPhoneNumber());
           register.setPassword(register.getPassword());
           return registerRepo.save(register);

           if (register.getPassword() !=null){
               register.setPassword(Bcrypt.getPassword());
           }
           else throw new EntityNotFoundException("Password is encrypted already");
       }
       else throw new EntityNotFoundException("Already registered in the Register page.");
   }

    public List<Register> getRegisterDetails() {
        return registerRepo.findAll();
    }

    public List<Register> getRegisterDetails(Register register) {
        return registerRepo.findAll();
    }

    public Register getRegisterByID(int id) {
        return registerRepo.findById(id)
                .orElseThrow(()->new EntityNotFoundException("Id not found"));
    }
}
