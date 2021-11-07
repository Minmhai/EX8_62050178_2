/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceorm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author napas
 */
public class InheritanceORM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FulltimeEmployee emp1 = new FulltimeEmployee();
        emp1.setName("John");
        emp1.setSalary(5000);
        ParttimeEmployee emp2 = new ParttimeEmployee();
        emp2.setName("Jane");
        emp2.setHoursWork(4);
        persist(emp1);
        persist(emp2);
    }

    public static void persist(Object object) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("InheritanceORMPU");
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
    
    public static FulltimeEmployee findEmpById(int id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("FulltimeEmployeePU");
        EntityManager em = emf.createEntityManager();
        FulltimeEmployee emp1 = em.find(FulltimeEmployee.class, id);
        em.close();
        return emp1;
    }
    
    public static void removeEmp(int id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("FulltimeEmployeePU");
        EntityManager em = emf.createEntityManager();
        FulltimeEmployee emp1 = em.find(FulltimeEmployee.class, id);
        em.getTransaction().begin();
        try {
            em.remove(emp1);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
    public static void insertEmp(int id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("FulltimeEmployeePU");
        EntityManager em = emf.createEntityManager();
        FulltimeEmployee emp1 = em.find(FulltimeEmployee.class, id);
        em.getTransaction().begin();
        try {
            em.remove(emp1);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
    public static void updateEmp(int id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("FulltimeEmployeePU");
        EntityManager em = emf.createEntityManager();
        FulltimeEmployee emp1 = em.find(FulltimeEmployee.class, id);
        em.getTransaction().begin();
        try {
            em.remove(emp1);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
    public static ParttimeEmployee findDepByHoursWork(int id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ParttimeEmployeePU");
        EntityManager em = emf.createEntityManager();
        ParttimeEmployee emp2 = em.find(ParttimeEmployee.class, id);
        em.close();
        return emp2;
    }
    
    public static void removeEmp2(int id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ParttimeEmployeePU");
        EntityManager em = emf.createEntityManager();
        ParttimeEmployee emp2 = em.find(ParttimeEmployee.class, id);
        em.getTransaction().begin();
        try {
            em.remove(emp2);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
    public static void insertEmp2(int id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ParttimeEmployeePU");
        EntityManager em = emf.createEntityManager();
        ParttimeEmployee emp2 = em.find(ParttimeEmployee.class, id);
        em.getTransaction().begin();
        try {
            em.remove(emp2);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
    public static void updateEmp2(int id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ParttimeEmployeePU");
        EntityManager em = emf.createEntityManager();
        ParttimeEmployee emp2 = em.find(ParttimeEmployee.class, id);
        em.getTransaction().begin();
        try {
            em.remove(emp2);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
}
