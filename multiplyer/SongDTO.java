package com.jspiders.multiplayerProject.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class SongDTO {
	
	@Id
	private int id;
	private String songName;
	private String movieName;
	private String composer;
	private String lyricist;
	private double length;
//	private List<SongOperationDTO> song;
	public String getSongName() {
		// TODO Auto-generated method stub
		return null;
	}
}
