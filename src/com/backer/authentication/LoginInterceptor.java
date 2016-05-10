package com.backer.authentication;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter

{

	@Override
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response, Object handler) throws Exception
	{
		String uri = request.getRequestURI();
		if (!uri.endsWith("login.htm") && !uri.endsWith("logout.htm"))
		{
			String login=(String) request.getSession().getAttribute("login");
			if (login == null)
			{
				response.sendRedirect("login.htm");
				return false;
			}
		}
		return true;
	}
}