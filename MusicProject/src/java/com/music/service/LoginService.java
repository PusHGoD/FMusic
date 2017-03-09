/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.music.service;

import com.music.model.Login;
import java.util.Map.Entry;

/**
 *
 * @author HuanPMSE61860
 */
public interface LoginService {
    /**
	 * @param username
	 * @param password
	 * @return key: return code and value: account information (if return code
	 *         is 1)
	 */
	public Entry<Integer, Login> checkLogin(String username, String password);
}
