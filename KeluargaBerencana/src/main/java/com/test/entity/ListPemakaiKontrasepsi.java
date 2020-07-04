package com.test.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "list_pemakai_kontrasepsi")
public class ListPemakaiKontrasepsi {
	
	private int idList;
	private int idPropinsi;
	private int idKontrasepsi;
	private int jumlahPemakai;
	
	public ListPemakaiKontrasepsi() {
		
	}

	public ListPemakaiKontrasepsi(int idList, int idPropinsi, int idKontrasepsi, int jumlahPemakai) {
		super();
		this.idList = idList;
		this.idPropinsi = idPropinsi;
		this.idKontrasepsi = idKontrasepsi;
		this.jumlahPemakai = jumlahPemakai;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdList() {
		return idList;
	}

	public void setIdList(int idList) {
		this.idList = idList;
	}

	public int getIdPropinsi() {
		return idPropinsi;
	}

	public void setIdPropinsi(int idPropinsi) {
		this.idPropinsi = idPropinsi;
	}

	public int getIdKontrasepsi() {
		return idKontrasepsi;
	}

	public void setIdKontrasepsi(int idKontrasepsi) {
		this.idKontrasepsi = idKontrasepsi;
	}

	public int getJumlahPemakai() {
		return jumlahPemakai;
	}

	public void setJumlahPemakai(int jumlahPemakai) {
		this.jumlahPemakai = jumlahPemakai;
	}
	
	

}
