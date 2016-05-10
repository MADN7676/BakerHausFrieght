package com.backer.authentication;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.backer.model.LoginModel;

@SuppressWarnings("deprecation")
public class LoginController extends SimpleFormController{
	
	public LoginController(){
		setCommandClass(LoginModel.class);
		setCommandName("loginModel");
	}
		
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception {
		LoginModel loginModel=(LoginModel) command;
		
		HttpSession session=request.getSession();
		
		session.setAttribute("userId", loginModel.getUserId());
		session.setAttribute("login", "true");
		session.setMaxInactiveInterval(300);
		return new ModelAndView(getSuccessView());
	}
}
