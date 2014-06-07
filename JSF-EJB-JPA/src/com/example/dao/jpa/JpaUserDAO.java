package com.example.dao.jpa;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.example.dao.UserDAO;
import com.example.model.User;

@Stateless
public class JpaUserDAO implements UserDAO {

    @PersistenceContext(name="example")
    private EntityManager entityManager;

    @Override
    public void add(User user) {
        entityManager.persist(user);
    }

    @Override
    public void update(User user) {
        entityManager.merge(user);
    }

    @Override
    public void delete(User user) {
        entityManager.remove(
            entityManager.contains(user) ? user : entityManager.merge(user)
        );
    }

    @Override
    public User getById(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public List<User> getAll() {
        return entityManager.createNamedQuery("User.getAll", User.class)
                            .getResultList();
    }

}
