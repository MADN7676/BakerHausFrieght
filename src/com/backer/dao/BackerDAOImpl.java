package com.backer.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.backer.entities.FreightDetail;
import com.backer.model.LoginModel;

public class BackerDAOImpl {
	
	private final String dbURL = "jdbc:oracle:thin:@BV-DB1:1521:orcl";
	private final String dbUserName = "backerhaus";
	private final String dbPassword = "backerhaus";
		
	public boolean isValidUser(String userId) throws ClassNotFoundException, SQLException{
		Connection dbConnection = getDBConnection();
		ResultSet resultSet;
		
		PreparedStatement ps = dbConnection.prepareStatement("Select count(*) from menu_user where user_id = ?");
		ps.setString(1, userId);
		resultSet = ps.executeQuery();
		
		int userCount = 0;
		
		while(resultSet.next()){
			userCount = resultSet.getInt(1);
		}
		
		resultSet.close();
		dbConnection.close();
		
		if(userCount == 0)
			return false;
		
		return true;
	}
	
	public boolean isUserAuthenticated(LoginModel loginModel) throws ClassNotFoundException, SQLException{
		Connection dbConnection = getDBConnection();
		ResultSet resultSet;
		
		PreparedStatement ps = dbConnection.prepareStatement("Select count(*) from menu_user where user_id = ? and user_passwd = ?");
		ps.setString(1, loginModel.getUserId());
		ps.setString(2, loginModel.getPassword());
		resultSet = ps.executeQuery();
		
		int userCount = 0;
		
		while(resultSet.next()){
			userCount = resultSet.getInt(1);
		}
		
		resultSet.close();
		dbConnection.close();
		
		if(userCount == 0)
			return false;
		
		return true;
	}
	
	private Connection getDBConnection() throws SQLException, ClassNotFoundException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		return DriverManager.getConnection(dbURL, dbUserName, dbPassword);
	}

	public List<FreightDetail> getFeightDeatilsByUserId(String userId) throws ClassNotFoundException, SQLException{
		List<FreightDetail>  freightDetails = new ArrayList<FreightDetail>();
		FreightDetail freightDetail;
		
		Connection dbConnection = getDBConnection();
		ResultSet resultSet;
		
		PreparedStatement ps = dbConnection.prepareStatement("Select FP_INV_NO,FP_INV_DT, FP_FRT,FP_LUMPER,FP_HST,FP_BV_ORD_1,FP_BV_ORD_2,FP_BV_ORD_3, FP_BV_ORD_4,FP_BV_ORD_5,FP_BV_ORD_6,FP_CR_UID,FP_CR_DT from  OM_FRT_PORTAL where FP_CR_UID = ?");
		ps.setString(1, userId);
		resultSet = ps.executeQuery();
		
		while(resultSet.next()){
			freightDetail = new FreightDetail();
			freightDetail.setInvoiceNumber(resultSet.getString(1));
			freightDetail.setInvoiceDate(resultSet.getDate(2));
			freightDetail.setFrtCharges(resultSet.getFloat(3));
			freightDetail.setLumperCharges(resultSet.getFloat(4));
			freightDetail.setHst(resultSet.getFloat(5));
			freightDetail.setOrder1(resultSet.getInt(6));
			freightDetail.setOrder2(resultSet.getInt(7));
			freightDetail.setOrder3(resultSet.getInt(8));
			freightDetail.setOrder4(resultSet.getInt(9));
			freightDetail.setOrder5(resultSet.getInt(10));
			freightDetail.setOrder6(resultSet.getInt(11));
			freightDetail.setCreateUserId(resultSet.getString(12));
			freightDetail.setCreateDate(resultSet.getDate(13));
			freightDetails.add(freightDetail);
		}
		
		resultSet.close();
		dbConnection.close();
		
		return freightDetails;
	}
	
	public void addFreightDetail(FreightDetail freightDetail) throws ClassNotFoundException, SQLException{
		Connection dbConnection = getDBConnection();
		
		PreparedStatement ps = dbConnection.prepareStatement(
				"insert into OM_FRT_PORTAL (FP_SYS_ID, FP_INV_NO,FP_INV_DT, FP_FRT,FP_LUMPER,FP_HST,FP_REMARK,FP_BV_ORD_1,FP_BV_ORD_2,FP_BV_ORD_3, FP_BV_ORD_4,FP_BV_ORD_5,FP_BV_ORD_6,FP_CR_UID,FP_CR_DT) "
				+ "values(FP_SYS_ID.NEXTVAL,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"//)"
				);
		ps.setString(1, freightDetail.getInvoiceNumber());
		ps.setDate(2, freightDetail.getInvoiceDate());
		ps.setFloat(3, freightDetail.getFrtCharges());
		ps.setFloat(4, freightDetail.getLumperCharges());
		ps.setFloat(5, freightDetail.getHst());
		ps.setString(6, freightDetail.getRemarks());
		ps.setInt(7, freightDetail.getOrder1());
		ps.setInt(8, freightDetail.getOrder2());
		ps.setInt(9, freightDetail.getOrder3());
		ps.setInt(10, freightDetail.getOrder4());
		ps.setInt(11, freightDetail.getOrder5());
		ps.setInt(12, freightDetail.getOrder6());
		ps.setString(13, freightDetail.getCreateUserId());
		ps.setDate(14, freightDetail.getCreateDate());
		
		ps.executeUpdate();
		
		dbConnection.close();
	}
	
}
