package com.SmartCity.Bhopal1Click.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
    
    @GetMapping("/")
    public String home() 
    {
        return "index";
    }
    
    
    @GetMapping("/history")
    public String history() 
    {
        return "history";
    }
    
    @GetMapping("/about")
    public String about() 
    {
        return "about";
    }
    
    @GetMapping("/directors")
    public String directors() 
    {
        return "directors";
    }

    

    @GetMapping("/videos")
    public String videos() 
    {
        return "videos";
    }
    
    @GetMapping("/galleryimg")
    public String galleryimg() 
    {
        return "galleryimg";
    }

    
    @GetMapping("/press")
    public String press() 
    {
        return "press";
    }
    
    
}
