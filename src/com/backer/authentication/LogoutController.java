package com.backer.authentication;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class LogoutController extends MultiActionController{
	
	public ModelAndView logout(HttpServletRequest request,HttpServletResponse response){
		request.getSession().invalidate();
		
		return new ModelAndView("redirect:/login.htm");
	}
}
