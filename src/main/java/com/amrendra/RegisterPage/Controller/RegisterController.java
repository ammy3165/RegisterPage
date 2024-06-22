package com.amrendra.RegisterPage.Controller;

import com.amrendra.RegisterPage.Entity.Register;
import com.amrendra.RegisterPage.Service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RegisterController {
    @Autowired
    private RegisterService registerService;

    @PostMapping("/register")
    public String addToRegister(@RequestBody Register register){
        registerService.addToRegister(register);
        return "Details added in register successfully.";
    }
    @GetMapping("/getRegister")
    public List<Register> getRegisterDetails(){
      return registerService.getRegisterDetails();
    }

    @GetMapping("/getRegister/{id}")
    public Register getRegisterByID(@PathVariable int id){
       return registerService.getRegisterByID(id);
    }
}
