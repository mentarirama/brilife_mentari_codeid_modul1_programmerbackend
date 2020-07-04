package com.test.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "list_propinsi")
public class ListPropinsi {
	
	private int idPropinsi;
	private String namaPropinsi;
	
	public ListPropinsi() {
		
	}

	public ListPropinsi(int idPropinsi, String namaPropinsi) {
		super();
		this.idPropinsi = idPropinsi;
		this.namaPropinsi = namaPropinsi;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdPropinsi() {
		return idPropinsi;
	}

	public void setIdPropinsi(int idPropinsi) {
		this.idPropinsi = idPropinsi;
	}

	public String getNamaPropinsi() {
		return namaPropinsi;
	}

	public void setNamaPropinsi(String namaPropinsi) {
		this.namaPropinsi = namaPropinsi;
	}
	
	

}
