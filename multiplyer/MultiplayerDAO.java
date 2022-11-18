package com.jspiders.multiplayerProject.dao;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.TransactionalException;

import com.jspiders.multiplayerProject.dto.SongDTO;
import com.jspiders.multiplayerProject.dto.SongOperationDTO;

public class MultiplayerDAO extends SongOperationDTO {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	private static Scanner sc = new Scanner(System.in);
	private static SongDTO song = new SongDTO();
	private static SongOperationDTO songopp = new SongOperationDTO();

	public static void openConnection() {

		entityManagerFactory = Persistence.createEntityManagerFactory("multiplayerProject");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();

	}

	public static void closeConnection() {
		if (entityManagerFactory != null) {
			entityManagerFactory.close();
		}
		if (entityManager != null) {
			entityManager.close();
		}
		if (entityTransaction != null) {
			try {
				entityTransaction.rollback();
			} catch (TransactionalException e) {
				// TODO: handle exception
				System.out.println("Transaction already commited");
			}
		}
	}

//	public static void addSongs() {
//
//		System.out.println("please enter how many songs you want to add in your song list");
//		int choice = sc.nextInt();
//		for (int i = 0; i < choice; i++) {
//			System.out.println("enter song id");
//			int id = sc.nextInt();
//			System.out.println("Enter song name");
//			String name = sc.next();
//			System.out.println("enter movie name");
//			String mname = sc.next();
//			System.out.println("enter composer name");
//			String cname = sc.next();
//			System.out.println("enter lyricist");
//			String lname = sc.next();
//			System.out.println("enter the duration for the song");
//			Double dvalue = sc.nextDouble();
//			SongDTO song = new SongDTO();
//			song.setId(id);
//			song.setSongName(name);
//			song.setMovieName(mname);
//			song.setComposer(cname);
//			song.setLyricist(lname);
//			song.setLength(dvalue);
////				songDTOs.add(song);
//			System.out.println(song.getSongName() + " :is added");
//
//		}
//	}

	public static void main(String[] args) {

		openConnection();
		entityTransaction.begin();
		System.out.println("HIIIIII...........................!" + "/n we have the menus in our song List"
				+ "/n please choose what you want in our app"
				+ "/n1. Add any song for your best list /n2. Show our playlist /n3. Choose song to play /n4. Play random song /n5.Update any song you want. /n6.Remove Song");
//		  MultiplayerDAO obj=new MultiplayerDAO();
		List<SongDTO> songs = Arrays.asList(song);
//		 SongOperationDTO songOperationDTO = new SongOperationDTO();
		songopp.setSongDTOs(songs);
		entityManager.persist(songopp);
//		 songOperationDTO.getSongDTOs(songDTOs);

		int key = sc.nextInt();
		switch (key) {
		case 1:
			
			openConnection();
			entityTransaction.begin();
			System.out.println("we have to add songs in our list first");
			songopp.addSongs();
			entityTransaction.commit();
			closeConnection();
			break;
			
		case 2:
			
			openConnection();
			entityTransaction.begin();
			System.out.println("the playlist of our program is: ");
			if(songs.isEmpty() == true) {
				System.out.println("we have to add some songs first");
				songopp.addSongs();
			}
			songopp.playlist();
			entityTransaction.commit();
			closeConnection();
			break;
			
		case 3:
			
			openConnection();
			entityTransaction.begin();
			System.out.println("plase see the playlist and choose which song you want to play");
			if(songs.isEmpty() == true) {
				System.out.println("we have to add some songs first");
				songopp.addSongs();
			}
			songopp.playlist();
			songopp.chooseSongTOPlay();
			entityTransaction.commit();
			closeConnection();
			break;
			
		case 4:
			
			openConnection();
			entityTransaction.begin();
			if(songs.isEmpty() == true) {
				System.out.println("we have to add some songs first");
				songopp.addSongs();
			}
			songopp.playRandomSongs();
			entityTransaction.commit();
			closeConnection();
			break;
			
		case 5:
			
			openConnection();
			entityTransaction.begin();
			System.out.println("plase first see the playlist and if you want to update then update it");
			if(songs.isEmpty() == true) {
				System.out.println("we have to add some songs first");
				songopp.addSongs();
			}
			songopp.playlist();
			songopp.updateSong();
			entityTransaction.commit();
			closeConnection();
			break;
			
		case 6:
			
			openConnection();
			entityTransaction.begin();
			System.out.println("plase first see the playlist and if you want to remove any song then remove it");
			if(songs.isEmpty() == true) {
				System.out.println("we have to add some songs first");
				songopp.addSongs();
			}
			songopp.playlist();
			songopp.removeSong();
			entityTransaction.commit();
			closeConnection();
			break;
			
		default:
			
			openConnection();
			entityTransaction.begin();
			System.out.println("plase enter valid input");
			entityTransaction.commit();
			closeConnection();
			break;
			
		}
		
		entityTransaction.commit();
		closeConnection();
	}
}
