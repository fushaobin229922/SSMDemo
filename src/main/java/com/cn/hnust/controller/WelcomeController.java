package com.cn.hnust.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class WelcomeController {
	@RequestMapping("/login")
	public String userLogin(HttpServletRequest request){
		System.out.println("Step into login mehod");
		return "index";
	} 
	@RequestMapping("/register")
	public String userRegister(HttpServletRequest request){
		System.out.println("++++++++++++++");
		return "index";
	} 
}
