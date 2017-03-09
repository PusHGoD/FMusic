/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.music.dao;

import com.music.model.Login;

/**
 *
 * @author HuanPMSE61860
 */
public interface LoginDAO {
    
    public Login findByUsernameAndPassword(String username, String password);
    
}
