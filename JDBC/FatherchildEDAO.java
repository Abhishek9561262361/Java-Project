package com.jspiders.demo1.dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspiders.demo1.dto.childDTO;
import com.jspiders.demo1.dto.fatherDTO;

public class FatherchildEDAO {

	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;

	public static void openConnection() {
		factory = Persistence.createEntityManagerFactory("hibernate1");
		manager = factory.createEntityManager(); 
		transaction = manager.getTransaction();
	}

	private static void closeConnection() {
		if (factory != null) {
			factory.close();
		}
		if (manager != null) {
			manager.close();
		}
		if (transaction != null) {
			try {
				transaction.rollback();
			} catch (TransactionException e) {
				// TODO: handle exception
				System.out.println("transaction not found");
			}
		}
	}
	public static void main(String[] args) {
		openConnection();
		transaction.begin();
		childDTO child1 = new childDTO();
		child1.setId(1);
		child1.setName("amit");
		child1.setAge(20);
		
		childDTO child2 = new childDTO();
		child2.setId(2);
		child2.setName("amar");
		child2.setAge(20);
		
		manager.persist(child1);
		manager.persist(child2);
		
		fatherDTO father1 = new fatherDTO();
		father1.setId(1);
		father1.setName("pandurang");
		father1.setAge(50);
		
		List<childDTO> child = Arrays.asList(child1,child2);
		father1.setChild(child);
	}
}
