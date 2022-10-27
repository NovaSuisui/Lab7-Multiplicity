/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicitydemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author SK
 */
public class MultiplicityDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Department it = new Department();
        it.setName("information tecnology");*/
        /*Department it = findDepByID(1);
        Employee emp1 = new Employee();
        emp1.setName("Meow2");
        emp1.setJob("Security");
        emp1.setSalary(15000);
        emp1.setDepartmentid(it);
        //persist(it);
        persist(emp1);*/
        removeDepByID(1);
        
    }

    public static void persist(Object object) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MultiplicityDemoPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
    public static Department findDepByID(int id){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MultiplicityDemoPU");
        EntityManager em = emf.createEntityManager();
        Department dep = em.find(Department.class, id);
        em.getTransaction().begin();
        try {
            em.persist(dep);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return dep;
    }
    
    public static void removeDepByID(int id){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MultiplicityDemoPU");
        EntityManager em = emf.createEntityManager();
        Department dep = em.find(Department.class, id);
        em.getTransaction().begin();
        try {
            em.remove(dep);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        
    }
}
