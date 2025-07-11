package com.dependency.injection.controller;

import lombok.extern.slf4j.Slf4j;
import com.dependency.injection.service.MyServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MyController {
    private  final MyServices myServices;

    public MyController(MyServices myServices) {
        this.myServices = myServices;
        log.info("MyController constructor");
    }
    @GetMapping
    public String Welcome(){
        return "Benvenuto nell'applicazione Spring Boot ";
    }

    @GetMapping("/getName")
    public String getName(){
        return myServices.getNome();
    }


}
