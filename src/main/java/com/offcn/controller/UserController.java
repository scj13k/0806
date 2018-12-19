package com.offcn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.offcn.pojo.ShiroUser;
import com.offcn.service.ShiroUserService;

@Controller
public class UserController {

	@Autowired
	private ShiroUserService service;
	
	@RequestMapping("/home")
	public String getHome(Model model){
		List<ShiroUser> users = service.findAllUser();
		model.addAttribute("users", users);
		return "home";
	}
}
