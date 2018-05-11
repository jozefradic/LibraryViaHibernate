package sk.akademiasovy.LibraryViaHibernate;

import org.hibernate.Session;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Session session= HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();

        Author writer=new Author();
        writer.setFirstname("Marek");
        writer.setLastname("Zitny");
        session.save(writer);

        Book kniha=new Book();
        kniha.setName("Bomber");
        kniha.setYear(2011);
        session.save(kniha);

        session.getTransaction().commit();
    }

}
