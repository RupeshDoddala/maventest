package com.info.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;

import com.info.model.EmployeeModel;

@Repository
public class EmployeeDAO {

	@PersistenceContext
	EntityManager entityManager;

	public int createEmployee(EmployeeModel employee) {

		entityManager.getTransaction().begin();
		entityManager.persist(employee);
		entityManager.getTransaction().commit();
		
		return 123;
	}

	public boolean checkEmployee(EmployeeModel employee) {
		boolean flag = false;


		String jpqlQuery = "from EmployeeModel where username = :uname and password = :pwd";
		
		Query query= entityManager.createQuery(jpqlQuery);
		
		query.setParameter("uname", employee.getUsername());
		query.setParameter("pwd", employee.getPassword());
		
		List list= query.getResultList();
		if(list.size()!=0) {
			flag=true;
		}
		return flag;
	}

	public List<EmployeeModel> getAllEmployees() {

		String jpqlQuery = "from EmployeeModel";
		Query query = entityManager.createQuery(jpqlQuery);
		List<EmployeeModel> allEmployees = query.getResultList();
		

		return allEmployees;
	}

	public void deleteEmployee(EmployeeModel employee) {
		entityManager.getTransaction().begin();
		entityManager.remove(employee);
		entityManager.getTransaction().commit();
		
	}
}
