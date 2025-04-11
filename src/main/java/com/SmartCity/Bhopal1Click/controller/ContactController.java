package com.SmartCity.Bhopal1Click.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.SmartCity.Bhopal1Click.model.ContactModel;
import com.SmartCity.Bhopal1Click.repository.ContactRepository;

@Controller
public class ContactController {

	@Autowired
	private ContactRepository crepo;
	

    @GetMapping("/contact")
    public String contact() 
    {
        return "contact";
    }

	
	@PostMapping("/contact-form")
	public String contact(@ModelAttribute ContactModel c)
	{
		System.out.println(c);
		crepo.save(c);
		
		return "redirect:/contact";
	}
	
}


