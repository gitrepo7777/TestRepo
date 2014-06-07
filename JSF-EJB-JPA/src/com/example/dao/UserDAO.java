package com.example.dao;

import java.util.List;

import com.example.model.User;

/**
 * 
 * Interface for DAOs that know how to perform persistence operations for User entities.
 * 
 * @since 12 Apr 2012
 * @version 1.0.0
 * 
 */
public interface UserDAO {

    void add(User user);

    void update(User user);

    void delete(User user);

    User getById(int id);

    List<User> getAll();
}
