package com.dependency.injection.model;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MyComponent {

    @Getter
    private final String myComponentName = "IlTuoNome";

    public MyComponent() {
        log.info("MyComponent constructor called");
    }

    public String getMyComponentName() {
        log.info("MyComponent.getMyComponentName() called");
        return myComponentName;
    }
}
