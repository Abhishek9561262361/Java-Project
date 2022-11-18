package com.jspiders.multiplayerProject.dto;

import java.util.List;
import java.util.Scanner;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//import com.jspiders.project.SongOperation;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class SongOperationDTO {

	
	@Id
	@ManyToMany
	private List<SongDTO> songDTOs;
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
			SongDTO song = new SongDTO();
			song.setId(id);
			song.setSongName(name);
			song.setMovieName(mname);
			song.setComposer(cname);
			song.setLyricist(lname);
			song.setLength(dvalue);
			songDTOs.add(song);
			System.out.println(song.getSongName() + " :is added");
		}
	}
	
	public  void playlist() {
		
		System.out.println("there are : ");
		for(int i=0;i<songDTOs.size();i++) {
			System.out.println(songDTOs.get(i).getSongName());
		}
		System.out.println("songs in our list");
	}
	
	public void chooseSongTOPlay() {
		System.out.println("choose song to play");
		int choice = sc.nextInt();
		for (int i = 1; i <= songDTOs.size(); i++) {
			if (choice == i) {
				System.out.println(songDTOs.get(i-1).getSongName() + "is playing");
			}
		}
	}
	
	public  void playAllSongs() {
		for (int i = 1; i <= songDTOs.size(); i++) {
			System.out.println(songDTOs.get(i-1).getSongName() + "is playing");
		}
	}
	
	public void playRandomSongs() {
		double random=(Math.random()*(songDTOs.size()-0+1))+0;
		System.out.println(songDTOs.get((int) random)+ " :is playing now");
	}
	
	public void removeSong() {
//		SongOperationDTO.playlist();
		System.out.println("enter the song number which you want to remove");
		int choice = sc.nextInt();
		for (int i = 1; i <= songDTOs.size(); i++) {
			if(choice == i) {
				songDTOs.remove(i-1);
				System.out.println(songDTOs.get(i-1)+ " :get removed");
			}
		}
//		SongOperationDTO.playlist();
	}
	
public void updateSong() {
		
//		SongOperationDTO.playlist();
		System.out.println("enter which numbr song you want to update");
		int choice = sc.nextInt();
		for(int i=1;i<=songDTOs.size();i++) {
			if(choice == i) {
				System.out.println("enter the song name");
				String value = sc.next();
				songDTOs.get(i).setSongName(value);
				System.out.println(songDTOs.get(i-1).getSongName()+" song updated sucessfully!");
			}
		}
//		SongOperationDTO.playlist();
	}
}