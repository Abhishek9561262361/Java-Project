package com.jspiders.demo1.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspiders.demo1.dto.HusbandDTO;
import com.jspiders.demo1.dto.wifeDTO;

public class HusbandWifeDAO {

	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;

	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("hibernate1");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
	}

	private static void closeConnection() {
		factory.close();
		manager.close();

		try {
			transaction.rollback();
		} catch (TransactionException e) {
			// TODO: handle exception
			System.out.println("Transaction cannot be rollback");
		}
	}

	public static void main(String[] args) {
		openConnection();
		transaction.begin();

		wifeDTO wife1 = new wifeDTO();
		wife1.setWage(25);
		wife1.setWname("sandhya");
		wife1.setWid(1);

		manager.persist(wife1);

		HusbandDTO husband = new HusbandDTO();
		husband.setHid(1);
		husband.setHname("Amit");
		husband.setHage(24);
		husband.setWife(wife1);

		manager.persist(husband);

		transaction.commit();
		closeConnection();
	}
}
