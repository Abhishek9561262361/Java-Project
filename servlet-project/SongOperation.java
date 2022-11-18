package com.jspiders.project;

import java.util.ArrayList;
import java.util.Scanner;

public class SongOperation {

	static ArrayList<Song> list = new ArrayList<Song>();
	static Scanner sc = new Scanner(System.in);

	public void addSongs() {
		System.out.println("please enter how many songs you want to add in your song list");
		int choice = sc.nextInt();
		for (int i = 0; i < choice; i++) {
			System.out.println("enter song id");
			int id = sc.nextInt();
			System.out.println("Enter song name");
			String name = sc.next();
			System.out.println("enter movie name");
			String mname = sc.next();
			System.out.println("enter composer name");
			String cname = sc.next();
			System.out.println("enter lyricist");
			String lname = sc.next();
			System.out.println("enter the duration for the song");
			Double dvalue = sc.nextDouble();
			Song song = new Song();
			song.setId(id);
			song.setSongName(name);
			song.setMovieName(mname);
			song.setComposer(cname);
			song.setLyricist(lname);
			song.setLength(dvalue);
			list.add(song);
			System.out.println(song.getSongName() + " :is added");
//			System.out.println("size: "+list.size());
//	      for(int j=0;j<list.size();j++) {
//	        Song song = new Song();
//	        song.setSongName(name);
//	        list.add(song);
//	      }
		}
	}
	public static void playlist() {
		System.out.println("there are : ");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getSongName());
		}
		System.out.println("songs in our list");
	}

	public  void chooseSongToPlay() {

//	    for (int i = 0; i < list.size(); i++) {
//	      System.out.println(list.get(i));
//	    }

		System.out.println("choose song to play");
		int choice = sc.nextInt();
		for (int i = 1; i <= list.size(); i++) {
			if (choice == i) {
				System.out.println(list.get(i-1).getSongName() + "is playing");
			}
		}
	}

	public  void playAllSongs() {
		for (int i = 1; i <= list.size(); i++) {
			System.out.println(list.get(i-1).getSongName() + "is playing");
		}
	}

	public void playRandomSongs() {
		double random=(Math.random()*(list.size()-0+1))+0;
//		System.out.println(list.get((int) random));
		System.out.println(list.get((int) random)+ " :is playing now");
	}

	public void removeSong() {
		SongOperation.playlist();
		System.out.println("enter the song number which you want to remove");
		int choice = sc.nextInt();
		for (int i = 1; i <= list.size(); i++) {
			if(choice == i) {
				list.remove(i-1);
				System.out.println(list.get(i-1)+ " :get removed");
			}
		}
		SongOperation.playlist();
	}
	
	public void updateSong() {
		
		SongOperation.playlist();
		System.out.println("enter which number song you want to update");
		int choice = sc.nextInt();
		for(int i=1;i<=list.size();i++) {
			if(choice == i) {
				System.out.println("enter the song name");
				String value = sc.next();
				list.get(i).setSongName(value);
				System.out.println(list.get(i-1).getSongName()+" song updated sucessfully!");
			}
		}
		SongOperation.playlist();
	}
//	public static void main(String[] args) {
////		SongOperation.addSongs();
////		SongOperation.playAllSongs();
////		SongOperation.chooseSongToPlay();
//	}
}
