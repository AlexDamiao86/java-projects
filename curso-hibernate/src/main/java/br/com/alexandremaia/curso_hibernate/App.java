package br.com.alexandremaia.curso_hibernate;

import br.com.alexandremaia.model.Address;
import br.com.alexandremaia.model.HibernateSession;
import br.com.alexandremaia.model.User;

import org.hibernate.Session;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Session session = HibernateSession.getSessionFactory().openSession();
    	
    	User user = new User();
    	Address address = new Address();
    	
    	address.setNumber(10);
    	address.setStreet("Chestnut st");
    	
    	user.setUsername("alexdamiao");
    	user.setName("Alexandre");
    	user.setLastname("Maia");

    	address.setUser(user);
    	user.setAddress(address);
    	
        System.out.println( "Hello World!" );
        System.out.println(session);
        
        System.out.println(user.getName() + " " + user.getLastname());
        System.out.println(user.getAddress().getStreet());
    }
}
