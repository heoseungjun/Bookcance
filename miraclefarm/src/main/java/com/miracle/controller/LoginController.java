package com.miracle.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.miracle.dto.UserDto;
import com.miracle.service.UserService;

@Controller
public class LoginController {
	@Autowired
	UserService service;
	
	@RequestMapping("/login")
	public String login() {
		return "login.html";
	}
	
	@RequestMapping("/loginimpl")
	public ModelAndView loginimpl(HttpServletRequest req, ModelAndView mav, Model model, HttpSession session) {
		String userid = req.getParameter("userid");
		String userpwd = req.getParameter("userpwd");
		UserDto cust = null;
		
		try {
			cust = service.choice(userid);
			
			if(cust == null) {
				model.addAttribute("check", 1);
				mav.setViewName("redirect:/login");
			}
			else {
				if(cust.getUserpwd().equals(userpwd)) {
					session.getAttribute(userid);
					session.getAttribute(userpwd);
					session.setMaxInactiveInterval(3600);
					mav.setViewName("redirect:/");
				}
				else {
					model.addAttribute("check", 2);
					mav.setViewName("redirect:/login");
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mav;
	}
}
