package com.test.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "list_kontrasepsi")
public class ListKontrasepsi {
	
	private int idKontrasepsi;
	private String namaKontrasepsi;
	
	
	public ListKontrasepsi() {
		
	}

	public ListKontrasepsi(int idKontrasepsi, String namaKontrasepsi) {
		super();
		this.idKontrasepsi = idKontrasepsi;
		this.namaKontrasepsi = namaKontrasepsi;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdKontrasepsi() {
		return idKontrasepsi;
	}

	public void setIdKontrasepsi(int idKontrasepsi) {
		this.idKontrasepsi = idKontrasepsi;
	}

	public String getNamaKontrasepsi() {
		return namaKontrasepsi;
	}

	public void setNamaKontrasepsi(String namaKontrasepsi) {
		this.namaKontrasepsi = namaKontrasepsi;
	}
	
	

}
