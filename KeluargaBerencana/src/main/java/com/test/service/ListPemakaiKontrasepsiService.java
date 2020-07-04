package com.test.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.ListKontrasepsi;
import com.test.entity.ListPemakaiKontrasepsi;
import com.test.repo.ListPemakaiKontrasepsiRepository;

@Service
@Transactional
public class ListPemakaiKontrasepsiService {
	
	@Autowired
	private ListPemakaiKontrasepsiRepository repo;
	
	public List<ListPemakaiKontrasepsi> listAll(){
		return repo.findAll();
	}
	
	public void save(ListPemakaiKontrasepsi listPemakaiKontrasepsi) {
		repo.save(listPemakaiKontrasepsi);
	}

}
