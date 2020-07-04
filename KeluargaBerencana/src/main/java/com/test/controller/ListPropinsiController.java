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

import com.test.entity.ListPropinsi;
import com.test.service.ListPropinsiService;


@Controller
public class ListPropinsiController {
	
	@Autowired
	private ListPropinsiService service;
	
	@RequestMapping(value = "/propinsi", method = RequestMethod.GET)
	public String viewPropinsi(Model model) {
		ListPropinsi listPropinsi = new ListPropinsi();
		model.addAttribute("listPropinsi",listPropinsi);
		List<ListPropinsi> listPropinsis = service.listAll();
		model.addAttribute("listPropinsis", listPropinsis);
		return "propinsi";
	}
	
	@RequestMapping("/new_propinsi")
	public String showNewPropinsiPage(Model model) {
		ListPropinsi listPropinsi = new ListPropinsi();
		model.addAttribute("propinsi", listPropinsi);
		
		return "new_propinsi";
	}
	// post propinsi data
	@RequestMapping(value = "/save_propinsi", method = RequestMethod.POST)
	public String savePropinsi(@ModelAttribute("propinsi")ListPropinsi listPropinsi) {
		service.save(listPropinsi);
		return "redirect:/propinsi";
	}
	
	@RequestMapping("/edit_propinsi/{id}")
	public ModelAndView showEditPropinsiPage(@PathVariable(name = "id")int id) {
		ModelAndView mav = new ModelAndView("edit_propinsi");
		ListPropinsi listPropinsi =  service.get(id);
		mav.addObject("propinsi", listPropinsi);
		
		return mav;
	}
	
	@RequestMapping("/delete_propinsi/{id}")
	public String delePropinsi(@PathVariable(name = "id")int id){
		service.delete(id);
		return "redirect:/propinsi";
	}
	

}
