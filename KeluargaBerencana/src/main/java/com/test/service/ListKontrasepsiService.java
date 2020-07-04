package com.test.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.ListKontrasepsi;
import com.test.repo.ListKontrasepsiRepository;

@Service
@Transactional
public class ListKontrasepsiService {
	
	@Autowired
	private ListKontrasepsiRepository repo;
	
	public List<ListKontrasepsi> listAll(){
		return repo.findAll();
	}
	
	public void save(ListKontrasepsi listKontrasepsi) {
		repo.save(listKontrasepsi);
	}
	
	public ListKontrasepsi get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}

}
