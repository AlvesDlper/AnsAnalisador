package com.ansanalyzer.entities;

import java.io.File;

public class MedicalOrder {

	private Long id;
	private Patient patient;
	File file;
	
	public MedicalOrder(Long id, Patient patient, File file) {
		
		this.id = id;
		this.patient = patient;
		this.file = file;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	
		
	
}
