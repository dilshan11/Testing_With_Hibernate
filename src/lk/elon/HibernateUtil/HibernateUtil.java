package lk.elon.HibernateUtil;

import lk.elon.Entity.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    private HibernateUtil() {
    }

    public static SessionFactory getSessionFactory() {
        if (sessionFactory != null) {
            return sessionFactory;
        } else {
            StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder().loadProperties("application.Properties").build();
            Metadata metadata = new MetadataSources(standardServiceRegistry).addAnnotatedClass(Employee.class).buildMetadata();

            sessionFactory= metadata.getSessionFactoryBuilder().build();
            return sessionFactory;
        }
    }
    }



