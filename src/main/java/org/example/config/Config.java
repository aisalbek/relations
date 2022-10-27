package org.example.config;

import org.example.UserCourse;
import org.example.UserInstructor;
import org.example.UserLesson;
import org.example.UserTask;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.util.Properties;

public class Config {
    public static SessionFactory getSessionFactory() {
        Properties properties = new Properties();
        properties.put(Environment.DRIVER, "org.postgresql.Driver");
        properties.put(Environment.URL, "jdbc:postgresql://localhost:5432/postgres");
        properties.put(Environment.USER, "postgres");
        properties.put(Environment.PASS, "1234");
        properties.put(Environment.HBM2DDL_AUTO, "create");
        properties.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQL9Dialect");
        properties.put(Environment.SHOW_SQL, "true");

        Configuration configuration = new Configuration();
        configuration.addProperties(properties);

        configuration.addAnnotatedClass(UserCourse.class);
        configuration.addAnnotatedClass(UserInstructor.class);
        configuration.addAnnotatedClass(UserLesson.class);
        configuration.addAnnotatedClass(UserTask.class);
        return configuration.buildSessionFactory();
    }
}