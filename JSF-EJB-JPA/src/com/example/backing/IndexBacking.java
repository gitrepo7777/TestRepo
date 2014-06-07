package com.example.backing;

import javax.ejb.EJB;
import javax.faces.bean.CustomScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.example.dao.UserDAO;
import com.example.model.User;

/**
 * 
 * This backing bean backs index.xhtml, which allows adding a new User.
 * 
 * @since 12 Apr 2012
 * @version 1.0.0
 * 
 */
@ViewScoped
@ManagedBean
public class IndexBacking {

    private User user = new User();

    @EJB
    private UserDAO userDAO;

    /**
     * Adds a user to persistent storage
     * 
     * @return String - navigation to the success page
     */
    public String addUser() {
        userDAO.add(user);
        return "success?faces-redirect=true";
    }

    /**
     * Resets the user data back to the initial values.
     * 
     */
    public void reset() {
        user = new User();
    }

    public User getUser() {
        return user;
    }

}
