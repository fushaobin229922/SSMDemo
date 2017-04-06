package com.cn.hnust.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.hnust.pojo.User;
import com.cn.hnust.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService userService;
	
	@RequestMapping ("/retrieveUser")
	public String retrieveUser(HttpServletRequest req, Model model){
		int id = Integer.parseInt(req.getParameter("id"));
		User user = this.userService.getUserById(id);
		model.addAttribute("user", user);
		return "showUser";
		
	}
}	
