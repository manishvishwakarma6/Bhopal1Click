package com.SmartCity.Bhopal1Click.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.SmartCity.Bhopal1Click.model.FeedbackModel;
import com.SmartCity.Bhopal1Click.repository.FeedbackRepository;

@Controller
public class FeedbackController {

	@Autowired
	private FeedbackRepository repo;
	
	@GetMapping("/feedback")
    public String feedback() 
    {
        return "feedback";
    }
	
	@PostMapping("/fbform")
	public String feedback(@ModelAttribute FeedbackModel u )
	{
		System.out.println(u);
		repo.save(u);
		
		return "redirect:/feedback";
	}
	
}
