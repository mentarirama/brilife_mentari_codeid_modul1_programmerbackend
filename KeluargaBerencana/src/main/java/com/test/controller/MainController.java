package com.test.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.entity.ListKontrasepsi;

@Controller
public class MainController {
	
	@RequestMapping("")
	public String viewListKontrasepsi(Model model) {
		model.addAttribute("index");
		return "index";	
	}

}
