package com.backer.authentication;

import java.sql.SQLException;

import javax.naming.NamingException;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.backer.dao.BackerDAOImpl;
import com.backer.model.LoginModel;

public class LoginValidator implements Validator {
	
	private BackerDAOImpl backerDAOImpl;
	
	public BackerDAOImpl getBackerDAOImpl() {
		return backerDAOImpl;
	}

	public void setBackerDAOImpl(BackerDAOImpl backerDAOImpl) {
		this.backerDAOImpl = backerDAOImpl;
	}

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return LoginModel.class.isAssignableFrom(arg0);
	}

	@Override
	public void validate(Object arg0, Errors errors) {
		// TODO Auto-generated method stub
		
		LoginModel loginModel=(LoginModel) arg0;
		String userId,password;
		userId=loginModel.getUserId();
		password=loginModel.getPassword();
		if(userId.isEmpty()){
			errors.rejectValue("userId", "UserId.required");
			if(password.isEmpty())
				errors.rejectValue("password", "password.required");
		} else
			try {
				if(!backerDAOImpl.isValidUser(userId.trim())){
					errors.rejectValue("userId", "UserId.NotAuthorized");
				}
				else
				{
					if(password.isEmpty())
						errors.rejectValue("password", "password.required");
					if(!backerDAOImpl.isUserAuthenticated(loginModel))
						errors.rejectValue("password", "password.invalid");
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}