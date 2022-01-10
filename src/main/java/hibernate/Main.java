package hibernate;

import hibernate.entity.User;
import org.hibernate.Session;

public class Main {

    public static void main(String[] args) {

        // сразу получаем готовый SessionFactory и сразу создаем сессию
        Session session = HibernateUtil.getSessionFactory().openSession();


        session.getTransaction().begin();


        User user = new User();
        user.setEmail("newfromapp987@email.com");
        user.setUsername("newfromapp779777");
        user.setPassword("2saljfsladfjsld");


        session.save(user);

        session.getTransaction().commit();

        session.close();
        HibernateUtil.close();
    }

}
