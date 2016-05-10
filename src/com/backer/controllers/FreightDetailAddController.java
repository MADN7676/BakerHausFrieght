package com.backer.controllers;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.StringTokenizer;
import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.backer.dao.BackerDAOImpl;
import com.backer.entities.FreightDetail;
import com.backer.model.FreightDetailModel;

public class FreightDetailAddController extends SimpleFormController{
	
	private BackerDAOImpl backerDAOImpl;
	
	public BackerDAOImpl getBackerDAOImpl() {
		return backerDAOImpl;
	}

	public void setBackerDAOImpl(BackerDAOImpl backerDAOImpl) {
		this.backerDAOImpl = backerDAOImpl;
	} 
	
	public FreightDetailAddController(){
		setCommandClass(FreightDetailModel.class);
		setCommandName("freightDetailModel");
	}
		
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception {
		FreightDetailModel freightDetailModel=(FreightDetailModel) command;
		FreightDetail freightDetail = new FreightDetail();
	
		HttpSession session=request.getSession();
		
		freightDetail.setCreateUserId((String) session.getAttribute("userId"));
		
		java.util.Date date = new java.util.Date();
       
        java.sql.Date sqlDate = new Date(date.getTime());
		
		freightDetail.setCreateDate(sqlDate);
		
		/*
		  SimpleDateFormat sdf;
		  sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		
		
		System.out.println(freightDetailModel.getInvoiceDate());
		
		date = sdf.parse(freightDetailModel.getInvoiceDate());
		
	
	    date = new Date(date.getYear()+1900,date.getMonth())
		
		System.out.println("invoice date "+date.getMonth()+" "+date.getYear());
		
		sqlDate = new Date(date.getTime()); 
		
        */
		
		StringTokenizer st = new StringTokenizer(freightDetailModel.getInvoiceDate(), "/");
		
		int count = 1;
		String dd="",month="", year="";
		while(st.hasMoreTokens()){
			if(count==1)
				dd=st.nextToken();
			else if(count==2)
				month=st.nextToken();
			else
				year=st.nextToken();
			count++;
		}
		
		sqlDate = java.sql.Date.valueOf(year+"-"+month+"-"+dd);
		
		
        freightDetail.setInvoiceDate(sqlDate);
		
		freightDetail.setFrtCharges(freightDetailModel.getFrtCharges());
		freightDetail.setHst(freightDetailModel.getHst());
		freightDetail.setInvoiceNumber(freightDetailModel.getInvoiceNumber());
		freightDetail.setLumperCharges(freightDetailModel.getLumperCharges());
		freightDetail.setOrder1(freightDetailModel.getOrder1());
		freightDetail.setOrder2(freightDetailModel.getOrder2());
		freightDetail.setOrder3(freightDetailModel.getOrder3());
		freightDetail.setOrder4(freightDetailModel.getOrder4());
		freightDetail.setOrder5(freightDetailModel.getOrder5());
		freightDetail.setOrder6(freightDetailModel.getOrder6());
		freightDetail.setRemarks(freightDetailModel.getRemarks());
		
		backerDAOImpl.addFreightDetail(freightDetail);
		return new ModelAndView(getSuccessView());
	}

}
