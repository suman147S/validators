package com.validators.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.validators.entities.Registration;
import com.validators.repositories.RegistrationRepository;

@Controller
public class RegistrationController {
	 
	@Autowired
	private RegistrationRepository repo;
	
	@RequestMapping("/view")
	public String viewReg() {
		return "view_reg";
	}
	
	@RequestMapping("/save")
	public String saveReg(@ModelAttribute("reg") Registration reg) {
		try {
			repo.save(reg);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "view_reg";
	}
}
