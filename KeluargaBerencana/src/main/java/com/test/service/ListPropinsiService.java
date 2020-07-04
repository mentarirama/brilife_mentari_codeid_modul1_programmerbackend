package com.test.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.ListPropinsi;
import com.test.repo.ListPropinsiRepository;

@Service
@Transactional
public class ListPropinsiService {
	
	@Autowired
	private ListPropinsiRepository repo;
	
	public List<ListPropinsi> listAll(){
		return repo.findAll();
	}

	public void save(ListPropinsi listPropinsi) {
		repo.save(listPropinsi);
	}

	public ListPropinsi get(int id) {
		return repo.findById(id).get();
	}

	public void delete(int id) {
		repo.deleteById(id);
	}

}
