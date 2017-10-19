package com.heaven.mvc.board.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
	@Autowired
	private UserRepository userRepo;
	
	
	@GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("user", new User());
        return "greeting";
    }
	
	@PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute User user) {
		userRepo.save(user);
        return "result";
    }

}
