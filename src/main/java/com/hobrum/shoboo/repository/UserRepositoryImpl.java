package com.hobrum.shoboo.repository;

import com.hobrum.shoboo.entity.User;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<User> getAllEmployees() {

        Session session = entityManager.unwrap(Session.class);
        Query<User> query = session.createQuery("from User", User.class);
        List<User> allUsers = query.getResultList();
        return allUsers;

    }

    @Override
    public void saveEmployee(User user) {

    }

    @Override
    public User getEmployee(int id) {
        return null;
    }

    @Override
    public void deleteEmployee(int id) {

    }
}
