package com.cg.iter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
	
	
	@PostMapping("/validateUser")
	public String validateUserLogin(@RequestParam("uid")String username,
			                                                @RequestParam("pass")String password,Model model)
	{
		   String message="Invalid Username/Password";
		   if(username.equalsIgnoreCase("iter") && password.equals("iter123")) 
		   return "trainee";
		   else return null;
	}
	 //model.addAttribute("message",message);
}    //  message="You are an Authorised User...Welcome";
