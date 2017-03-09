package com.music.controller;

import com.music.model.Login;
import com.music.service.LoginService;
import java.util.Map.Entry;

import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("account")
public class LoginController {

    /**
     * Autowired login service
     */
    @Autowired
    private LoginService service;

    /**
     * @param model
     * @param account
     * @param session
     * @return logic name of login page
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<String> login(@RequestBody Login login) {
        try {
            // Log in and get account information
            Entry<Integer, Login> result = service.checkLogin(login.getUsername(), login.getPassword());
            switch (result.getKey()) {
                case 0: {
                    // Redirect to login page
                    return new ResponseEntity<String>("Invalid username or password", HttpStatus.BAD_REQUEST);
                }
                case 1: {
                    Login info = result.getValue();
                    return new ResponseEntity<String>("OK", HttpStatus.OK);
                }
                case 2: {
                    // Redirect to login page
                    return new ResponseEntity<String>(
                            "Your account is not activated. Please look up your email for a activation link.",
                            HttpStatus.BAD_REQUEST);
                }
                default: {
                    // Log Hibernate error message 
                    return new ResponseEntity<String>("Unknown return code has returned" + result.getKey(), HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } catch (HibernateException e) {
            // Log Hibernate error message
            return new ResponseEntity<String>("Error in processing request in DB :" + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        //return new ResponseEntity<String>("Error in processing", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public ResponseEntity<String> test() {
        return new ResponseEntity<String>("Just Testing Controller", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
