package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.test.entity.ListKontrasepsi;
import com.test.service.ListKontrasepsiService;

@Controller
public class ListKontrasepsiController {
	
	@Autowired
	private ListKontrasepsiService service;
	
	@RequestMapping(value = "/kontrasepsi", method = RequestMethod.GET)
	public String viewKontrasepsi(Model model) {
		ListKontrasepsi listKontrasepsi = new ListKontrasepsi();
		model.addAttribute("listKontrasepsi", listKontrasepsi);
		List<ListKontrasepsi> listKontrasepsis = service.listAll();
		model.addAttribute("listKontrasepsis",listKontrasepsis);
		return "kontrasepsi";
	}
	
	@RequestMapping("/new_kontrasepsi")
	public String showNewKontrasepsiPage(Model model) {
		ListKontrasepsi listKontrasepsi = new ListKontrasepsi();
		model.addAttribute("listkontrasepsi", listKontrasepsi);
		
		return "new_kontrasepsi";
	}
	
	@RequestMapping(value = "/save_kontrasepsi", method = RequestMethod.POST)
	public String saveKontrasepsi(@ModelAttribute("listkontrasepsi")ListKontrasepsi listKontrasepsi) {
		service.save(listKontrasepsi);
		return "redirect:/kontrasepsi";
	}
	
	@RequestMapping("/edit_kontrasepsi/{id}")
	public ModelAndView showEditKontrasepsiPage(@PathVariable(name = "id")int id) {
		ModelAndView mav = new ModelAndView("edit_propinsi");
		ListKontrasepsi listKontrasepsi = service.get(id);
		mav.addObject("kontrasepsi", listKontrasepsi);
		return mav;
	}
	
	@RequestMapping("/delete_kontrasepsi/{id}")
	public String deleteKontrasepsi(@PathVariable(name = "id")int id) {
		service.delete(id);
		return "redirect:/propinsi";
	}
	

}
