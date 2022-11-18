package com.jspiders.project;

//import java.util.List;
import java.util.Scanner;

public class Multiplayer {
	public static void main(String[] args) {

		// create object of SongOperation class to access all methods
		SongOperation songOperation = new SongOperation();

		boolean state = true;
		while (state) {
			System.out.println(" Menu \n ");
			Scanner sc = new Scanner(System.in);
			System.out.println("1.Play \n2.Add \n3.edit \n4.exit \n");
			int choice = sc.nextInt();

			switch (choice) {

			case 1: {
				System.out.println("PLAY \n");
				System.out.println("There are three methods in play : \n1.Choose song to play \n2.Play All Songs \n3.Play Song Randam \n4.Go Back");
				int choice1 = sc.nextInt();

				switch (choice1) {

				case 1: {
					if (SongOperation.list.isEmpty() == true) {
						System.out.println("plese first add some songs");
						songOperation.addSongs();
					} else {
						SongOperation.playlist();
						songOperation.chooseSongToPlay();
					}
					break;
				}
				case 2: {
					if (songOperation.list.isEmpty() == true) {
						System.out.println("plese first add some songs");
						songOperation.addSongs();
					} else {
						songOperation.playAllSongs();
					}
					break;
				}
				case 3: {
					if (songOperation.list.isEmpty() == true) {
						System.out.println("plese first add some songs");
						songOperation.addSongs();
					} else {
						songOperation.playRandomSongs();
					}
					break;
				}
				default: {
					System.out.println("please enter valid input");
					break;
				}
				}
				break;
				
			}
			case 2: {

				System.out.println("ADD \n");
				System.out.println("there are three methods in this method: \n1.Add Songs \n2.Remove Song \n3.Go Back");
				int choice2 = sc.nextInt();

				switch (choice2) {

				case 1: {
					songOperation.addSongs();
					SongOperation.playlist();
					break;
				}
				case 2: {
					songOperation.removeSong();
					break;
				}
				default: {
					System.out.println("please enter valid input");
					break;
				}

				}
				break;

			}
			case 3: {
				System.out.println("EDIT \n");
				songOperation.updateSong();
				break;
			}
			case 4: {
				state = false;
				break;

			}
			}
		}

	}
}
