package itshaala.configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    public static final SessionFactory SESSION_FACTORY;

    static {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SESSION_FACTORY = configuration.buildSessionFactory();
    }

    public static Session getSession() {
        return SESSION_FACTORY.openSession();
    }
}
