package com.jspiders.multiplayerProject.dao;

import java.util.Scanner;

import com.jspiders.multiplayerProject.dto.SongOperationDTO;

public class Multiplayer {

	private static SongOperationDTO songOperationDTO;

	public Multiplayer(int id, String songName, String singerName, String movieName, String composer, String lyrist,
			double duration) {
//	    super(id, songName, singerName, movieName, composer, lyrist, duration);
		// TODO Auto-generated constructor stub

	}

	static Scanner sc = new Scanner(System.in);
	static boolean loop = true;

	public static void menu() {
		System.out.println(
				"Select anything from the menu\n1.Play Songs\n2.Add Songs\n3.Remove Song\n4.Edit Song\n5.Display All Song\n6.Exit");
		int a = sc.nextInt();
		switch (a) {
		case 1:
			playSongs();

			break;
		case 2:
			addSongs();
			break;
		case 3:
			removeSongs();
			break;
//	    case 4:
//	      editSongs();
//	      break;
//	    case 5:
//	      displayAllSongs();
//	      break;
		case 6:
			System.out.println("Thanks for using the application :) ");
			loop = false;
			break;
		default:
			System.out.println("Invalid Input");
			return;
		}
	}

	// play songs
	public static void playSongs() {
		System.out.println("Select from below options\n1.Choose Song To Play\n2.Play All Songs\n3.Play Random Songs");
		int a = sc.nextInt();
		switch (a) {
		case 1:
			songOperationDTO.chooseSongTOPlay();
			break;
		case 2:
			songOperationDTO.playAllSongs();
			break;
		case 3:
			songOperationDTO.playRandomSongs();
			break;
		default:
			System.out.println("wrong option selected");
			return;
		}

	}

	// add songs
	public static void addSongs() {
		System.out.println("Do you really want to add songs\n1.Yes\n2.No ");
		int a = sc.nextInt();
		switch (a) {
		case 1:
			songOperationDTO.addSongs();
			break;
		case 2:
			return;

		}

	}

	// remove songs
	public static void removeSongs() {
		System.out.println("Do you really want to remove songs\n1.Yes\n2.No ");
		int a = sc.nextInt();
		switch (a) {
		case 1:
			songOperationDTO.removeSong();
			break;
		case 2:
			return;
		default:
			break;
		}

	}

	// edit songs
//	  public static void editSongs() {
//	    System.out.println("Do you really want to edit songs\n1.Yes\n2.No ");
//	    int a = sc.nextInt();
//	    switch (a) {
//	    case 1:
//	      songOperationDTO.editSongs();
//	      break;
//	    case 2:
//	      return;
//	    default:
//	      break;
//	    }
//
//	  }

	// display all songs
//	  public static void displayAllSongs() {
//	    songOperationDTO.displayAllSongs();
//	    return;
//	  }

	// main method
	public static void main(String[] args) {
		while (loop) {
			System.out.println("Welcome to Music Player ");
			menu();

		}
	}
}
