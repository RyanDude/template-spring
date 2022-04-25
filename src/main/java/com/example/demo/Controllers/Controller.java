package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("/")
    public String to_main(){
        return "main";
    }
    @RequestMapping("/insert")
    public String insert(){
        return "insert";
    }
    @RequestMapping("/all")
    public String all(){
        return "all";
    }
    @RequestMapping("/update")
    public String update(){
        return "update";
    }
    @RequestMapping("/func")
    public String func(){
        return "func";
    }
}
