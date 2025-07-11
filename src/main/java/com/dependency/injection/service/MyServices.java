package com.dependency.injection.service;

import com.dependency.injection.model.MyComponent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MyServices {

    private MyComponent myComponent;

    public MyServices(MyComponent myComponent) {
        this.myComponent = myComponent;
        log.info("MYServices constructor");
    }

    public String getNome() {
        log.info("MyService.getName()");
        return myComponent.getMyComponentName();
    }
}
