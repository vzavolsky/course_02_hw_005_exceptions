package com.zavolsky.course_02;

import org.springframework.stereotype.Service;

@Service
public class AppServiceImpl implements AppService {
    public boolean checkUserData(String login, String password, String confirmPassword) {
        if (!login.matches("[a-zA-Z0-9_]{1,20}")) {
            throw new WrongLoginException();
        }
        if (!password.equals(confirmPassword) || !password.matches("[a-zA-Z0-9_]{1,20}")) {
            throw new WrongPasswordException();
        }
        return true;
    }
}
