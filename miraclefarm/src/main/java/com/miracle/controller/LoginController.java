package com.miracle.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.miracle.dto.CustDto;
import com.miracle.service.CustService;

@Controller
public class LoginController {
	@Autowired
	CustService service;
	
	@RequestMapping("/login")
	public String login() {
		return "login.html";
	}
	
	@RequestMapping("/loginimpl")
	public ModelAndView loginimpl(HttpServletRequest req, ModelAndView mav, HttpSession session) {
		String userid = req.getParameter("userid");
		String userpwd = req.getParameter("userpwd");
		CustDto cust = null;
		
		try {
			cust = service.choice(userid);
			
			if(cust == null) {
				mav.setViewName("redirect:login");
			}
			else {
				if(cust.getUserpwd().equals(userpwd)) {
					session.getAttribute(userid);
					session.getAttribute(userpwd);
					mav.setViewName("redirect:/");
				}
				else {
					mav.setViewName("redirect:login");
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mav;
	}
}
