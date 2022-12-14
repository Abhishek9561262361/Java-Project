package com.jspiders.demo1.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DoctorDTO {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private String name;
	private String specialization;
	
	@ManyToMany (mappedBy = "doctor")
	private List<PatientDTO> patient;
	
}
