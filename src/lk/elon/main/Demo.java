package lk.elon.main;

import lk.elon.Entity.Employee;
import lk.elon.Entity.Person;
import lk.elon.HibernateUtil.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Demo {
    public static void main(String[] args){
        SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
        Session session=sessionFactory.openSession();
        Person person=new Person("001","Dapa","Telwatta");
        Employee employee=new Employee(person,24,'A');
        try {
            session.getTransaction().begin();
            session.save(employee);
            session.getTransaction().commit();
        }
        catch (Exception ex){
            session.getTransaction().rollback();
        }
        finally {
            session.close();
        }
    }
}
