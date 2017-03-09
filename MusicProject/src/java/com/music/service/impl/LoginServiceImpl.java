/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.music.service.impl;

import com.music.dao.LoginDAO;
import com.music.model.Login;
import com.music.service.LoginService;
import java.util.AbstractMap;
import java.util.Map.Entry;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author HuanPMSE61860
 */
public class LoginServiceImpl implements LoginService {

    /**
     * Autowired login DAO
     */
    @Autowired
    private LoginDAO dao;

    @Override
    public Entry<Integer, Login> checkLogin(String username, String password) {
        Entry<Integer, Login> result = null;
        // Call to DAO and get account information
        Login accountInfo = dao.findByUsernameAndPassword(username, password);
        // If result is null, return null
        if (accountInfo != null) {
            result = new AbstractMap.SimpleEntry<Integer, Login>(1, accountInfo);
        } else {
            result = new AbstractMap.SimpleEntry<Integer, Login>(0, null);
        }
        return result;
    }

    
}
