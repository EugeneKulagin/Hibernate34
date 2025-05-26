package util;

import Model.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Util {
    public static final String USER_TABLE_NAME = "hello";

    // Connect to MySQL
    private final static Configuration configuration = new Configuration().addAnnotatedClass(User.class);

    public static SessionFactory getSessionFactory() {

        return configuration.buildSessionFactory();
    }
}