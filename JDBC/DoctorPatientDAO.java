package com.jspiders.demo1.dao;

import java.util.List;
import java.util.Arrays;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.TransactionalException;

import com.jspiders.demo1.dto.DoctorDTO;
import com.jspiders.demo1.dto.PatientDTO;

//import org.hibernate.mapping.List;

//import com.jspiders.manytomany.dto.DoctorDTO;
//import com.jspiders.manytomany.dto.PatientDTO;

public class DoctorPatientDAO {

  private static EntityManagerFactory entityManagerFactory;
  private static EntityManager  entityManager;
  private static EntityTransaction entityTransaction;
  
  public static void openConnection() {
    entityManagerFactory =Persistence.createEntityManagerFactory("hibernate1");
    entityManager=entityManagerFactory.createEntityManager();
    entityTransaction = entityManager.getTransaction();
    
  }
  public static void closeConnection() {
    if(entityManagerFactory != null) {
      entityManagerFactory.close();
    }
    if (entityManager != null) {
      entityManager.close();
    }
    if (entityTransaction != null) {
      try {
        entityTransaction.rollback();
      }catch (TransactionalException e) {
        // TODO: handle exception
        System.out.println("Transaction already commited");
      }
    }
  }
  
  public static void main(String[] args) {
    
    openConnection();
    
    entityTransaction.begin();
    
    PatientDTO patient1 = new PatientDTO();
    
//    patient1.setId(1);
    patient1.setName("Abhi");
    patient1.setAge(22);
    
    
    
    PatientDTO patient2 = new PatientDTO();
    
    patient2.setName("Rohan");
    patient2.setAge(23);
    
    
    
    List<PatientDTO> patients =Arrays.asList(patient1,patient2);
    
    DoctorDTO doctor1 = new DoctorDTO();
    
//    doctor1.setId(1);
    doctor1.setName("Amit");
    doctor1.setSpecialization("Neurologiest");
    doctor1.setPatient(patients);
    
    
    
    DoctorDTO doctor2 =new DoctorDTO();
    
//    doctor2.setId(2);
    doctor2.setName("Sourabh");
    doctor2.setSpecialization("Dentiest");
    doctor2.setPatient(patients);
    
    
    List<DoctorDTO> doctors=Arrays.asList(doctor1,doctor2);
    
    
    patient1.setDoctor(doctors);
    patient2.setDoctor(doctors);

    entityManager.persist(patient1);
    entityManager.persist(patient2);
    entityManager.persist(doctor2);
    entityManager.persist(doctor1);
    
    
    entityTransaction.commit();
    
    closeConnection();
    
  }
}