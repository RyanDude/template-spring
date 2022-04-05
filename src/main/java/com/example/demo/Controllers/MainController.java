package com.example.demo.Controllers;

import com.example.demo.Entity.Usr;
import com.example.demo.Repository.UsrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    private UsrRepository usrRepository;
    @RequestMapping("/hi")
    public String hello(){return "hello world";}
    // DB TEST
    @RequestMapping("/test")
    public Usr getU(){
        Usr u = usrRepository.findByUsername("jguo15");
        System.err.println(u.getLastname());
        return u;
    }
}
