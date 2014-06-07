package com.example.backing;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.example.dao.UserDAO;
import com.example.model.User;

/**
 * 
 * This backing bean backs success.xhtml, which shows a list of all users.
 * 
 * @since 12 Apr 2012
 * @version 1.0.0
 * 
 */
@ViewScoped
@ManagedBean
public class SuccessBacking {

    private List<User> users;

    @EJB
    private UserDAO userDAO;

    @PostConstruct
    public void init() {
        users = userDAO.getAll();
    }

    public List<User> getUsers() {
        return users;
    }

}
