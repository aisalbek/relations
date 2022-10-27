package org.example.dao;

import org.example.config.Config;
import org.example.entites.Phone;
import org.example.entites.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.io.Serializable;
import java.util.List;

public class UserDao implements Userdaoimpl {
    public final SessionFactory sessionFactory = Config.getSessionFactory();

    @Override
    public void saveUser(User user) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void savePhone(Long userid, Phone phone) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        User user = session.find(User.class, userid);
        user.setList(List.of(phone));
        phone.setUser(user);
        session.getTransaction().commit();
        session.close();
    }
}
