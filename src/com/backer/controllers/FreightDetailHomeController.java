package com.backer.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.backer.dao.BackerDAOImpl;
import com.backer.entities.FreightDetail;

public class FreightDetailHomeController extends AbstractController{

	private BackerDAOImpl backerDAOImpl;
	
	public BackerDAOImpl getBackerDAOImpl() {
		return backerDAOImpl;
	}

	public void setBackerDAOImpl(BackerDAOImpl backerDAOImpl) {
		this.backerDAOImpl = backerDAOImpl;
	} 
	
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		HttpSession session=request.getSession();
		List<FreightDetail> freightDetails = backerDAOImpl.getFeightDeatilsByUserId((String) session.getAttribute("userId"));
	
		ModelMap model=new ModelMap();
		model.addAttribute("freightDetails", freightDetails);
		return new ModelAndView("home", model);
	}

}
