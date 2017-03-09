/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.music.dao.impl;

import com.music.dao.LoginDAO;
import com.music.model.Login;
import java.io.Serializable;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author HuanPMSE61860
 */
public class LoginDAOImpl extends GenericDAOImpl<Serializable, Login> implements LoginDAO {

    public Login findByUsernameAndPassword(String username, String password){
        // Get current session
        Session session = sessionFactory.getCurrentSession();
        // Query with criteria object
        Criteria criteria = session.createCriteria(Login.class);
        criteria.add(Restrictions.eq("Username", username));
        criteria.add(Restrictions.eq("Password", password));
        // Get result
        Login account = (Login) criteria.uniqueResult();
        return account;
    }

}
