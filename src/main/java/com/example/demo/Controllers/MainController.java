package com.example.demo.Controllers;

import com.example.demo.Entity.Role;
import com.example.demo.Entity.Usr;
import com.example.demo.Repository.RoleRepository;
import com.example.demo.Repository.UsrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {
    @Autowired
    private UsrRepository usrRepository;
    @Autowired
    private RoleRepository roleRepository;
    // DB TEST
    @RequestMapping("/test")
    public Usr getU(){
        Usr u = usrRepository.findByUsername("jguo15");
        System.err.println(u.getLastname());
        return u;
    }
    @RequestMapping("/add")
    @ResponseBody
    public String add(){
        Usr u = new Usr();
        Role r = new Role();
        u.setId(0);
        u.setFirstname("J");
        u.setLastname("Guo");
        u.setPassword("123456");
        r.setId(0);
        r.setRoles("ADMIN");
        r.setUsr(u);
        usrRepository.save(u);
        roleRepository.save(r);
        return "add successfully";
    }
    // check
    @RequestMapping("/usr/{id}")
    @ResponseBody
    public Usr show_usr(@PathVariable String id){
        Usr u = usrRepository.findById(Long.parseLong(id));
        if(u != null){
            return u;
        }
        return null;
    }
}
