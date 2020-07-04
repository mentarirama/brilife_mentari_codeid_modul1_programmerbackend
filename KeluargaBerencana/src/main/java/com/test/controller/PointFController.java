package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.entity.ListKontrasepsi;
import com.test.entity.ListPemakaiKontrasepsi;
import com.test.entity.ListPropinsi;
import com.test.service.ListKontrasepsiService;
import com.test.service.ListPemakaiKontrasepsiService;
import com.test.service.ListPropinsiService;

@Controller
public class PointFController {
	
	@Autowired
	private ListKontrasepsiService service;
	
	@Autowired
	private ListPropinsiService propinsi_service;
	
	@Autowired
	private ListPemakaiKontrasepsiService pemakai_service;
	
	@RequestMapping(value = "/data_entry", method = RequestMethod.GET)
	public String viewAddPage(Model model) {
		ListKontrasepsi listKontrasepsi = new ListKontrasepsi();
		ListPropinsi listPropinsi = new ListPropinsi();
		
		model.addAttribute("listPropinsi", listPropinsi);
		model.addAttribute("listKontrasepsi", listKontrasepsi);
		
		List<ListKontrasepsi> listKontrasepsis = service.listAll();
		List<ListPropinsi> listPropinsis =  propinsi_service.listAll();
		
		model.addAttribute("listKontrasepsis",listKontrasepsis);
		model.addAttribute("listPropinsis",listPropinsis);
		model.addAttribute("pemakaiKontrasepsi", new ListPemakaiKontrasepsi());
		return "data_entry";	
	}
	
	@RequestMapping(value = "list_pemakaikontrasepsi", method = RequestMethod.GET)
	public String viewListPemakaiKontrasepsi(Model model) {
		List<ListPemakaiKontrasepsi>listPemakaiKontrasepsii =  pemakai_service.listAll();
		model.addAttribute("listPemakaiKontrasepsii",listPemakaiKontrasepsii);
		return "list_pemakaikontrasepsi";
	}
	
	@RequestMapping(value = "/save_pemakai", method = RequestMethod.POST)
	public String saveListPemakai(@ModelAttribute("pemakaiKontrasepsi")ListPemakaiKontrasepsi listPemakaiKontrasepsi) {
		pemakai_service.save(listPemakaiKontrasepsi);
		return "redirect:/list_pemakaikontrasepsi";
	}
	
	

}
