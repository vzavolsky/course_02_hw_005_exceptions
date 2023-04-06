package com.zavolsky.course_02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping(path = "/userlogin")
    public String checkUserData() {
        return "Hi ";
    }

}
