package dev;

import dev.domain.Address;
import dev.domain.Contact;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.Transaction;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("digi-book-jpa");
        EntityManager em = emf.createEntityManager();
        Contact contact = new Contact();

        // ----------Ajout-------------
        /*em.getTransaction().begin();
        contact.setEmail("titi@toto.fr");
        em.persist(contact);
        em.getTransaction().commit();*/

        // ---------Update-------------
        /*em.getTransaction().begin();
        contact = em.find(Contact.class,6);
        contact.setFirstName("Toto");
        em.merge(contact);
        em.getTransaction().commit();*/

        // ---------Delete-------------
        /*em.getTransaction().begin();
        contact = em.find(Contact.class,6);
        em.remove(contact);
        em.getTransaction().commit();*/

       /* List<Contact> contacts = em.createQuery("from Contact",Contact.class).getResultList();
        List<Address> address = em.createQuery("from Address",Address.class).getResultList();*//*
        for (Contact c: contacts) {
            System.out.println(c);
        }
        for(Address a: address){
            System.out.println(a);
        }*/

        System.out.println(contact);
        em.close();
        emf.close();
    }
}
