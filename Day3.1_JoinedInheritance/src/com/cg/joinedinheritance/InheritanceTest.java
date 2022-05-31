package com.cg.joinedinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//create an employee1
		Employee emp=new Employee();
		emp.setName("Bhoomika");
		emp.setSalary(35000);
		em.persist(emp);
		
		//create an employee1
		Employee emp1=new Employee();
		emp1.setName("Srujana");
		emp1.setSalary(45000);
		em.persist(emp1);
		
		//create an MANAGER
		Manager mg=new Manager();
		mg.setName("Vinutha");
		mg.setSalary(65000);
		mg.setDeptName("Electronics and communication");
		em.persist(mg);
		
		em.getTransaction().commit();
		System.out.println("Added Employees and Manager Successfully");
		em.close();
		factory.close();
		
	}

}
