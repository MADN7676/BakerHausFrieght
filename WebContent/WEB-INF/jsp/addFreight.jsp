<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<style>
#header {
    background-color:rgb(186,128,69);
    color:white;
    text-align:center;
    padding:25px;
}
#nav {
    line-height:30px;
    background-color:#eeeeee;
    height:300px;
    width:100px;
    float:left;
    padding:5px;	      
}
#section {
    width:450px;
    float:left;
    padding:10px;	 	 
}
#footer {
    background-color:rgb(186,128,69);
    color:style="color:rgb(26,13,0)";
    clear:both;
    text-align:center;
   padding:35px;	 	 
}
</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add freight</title>
</head>
<body id="content">
<div id="header">
<h1 style="color:rgb(26,13,0);font-size:240%;)"><i>Backerhaus Freight Portal</i></h1>
</div>
<a href="logout.htm"><br><br>
<span style="padding-left:1059px"><b style="font-size:160%;"><i>Log Out</i></b></span></a>
		<br/><br/>
	
		<h2 style="color:rgb(128, 66, 0);font-size: 180%;text-align:center;"><i><b>Add New Freight Details</b></i></h2>
		<form:form method="POST" commandName="freightDetailModel">
			
			<CENTER><table>
			<tr>
				<td style="color:rgb(128, 66, 0)"><b>Invoice Number</b></td>
				<td><form:input path="invoiceNumber" />
				</td>
			</tr>
			
			<tr>
				<td style="color:rgb(128, 66, 0)"><b>Invoice Date</b></td>
				<td><form:input path="invoiceDate" />
				</td>
			</tr>
						
			<tr>
				<td style="color:rgb(128, 66, 0)"><b>Freight Charges</b></td>
				<td><form:input path="frtCharges" />
				</td>
			</tr>
						
			<tr>
				<td style="color:rgb(128, 66, 0)"><b>Lumper Charges</b></td>
				<td><form:input path="lumperCharges" />
				</td>
			</tr>
			
						<tr>
				<td style="color:rgb(128, 66, 0)"><b>HST</b></td>
				<td><form:input path="hst" />
				</td>
			</tr>
			
						<tr>
				<td style="color:rgb(128, 66, 0)"><b>BV Order1</b></td>
				<td><form:input path="order1" />
				</td>
			</tr>
			
			<tr>
				<td style="color:rgb(128, 66, 0)"><b>BV Order2</b></td>
				<td><form:input path="order2" />
				</td>
			</tr>
			<tr>
				<td style="color:rgb(128, 66, 0)"><b>BV Order3</b></td>
				<td><form:input path="order3" />
				</td>
			</tr>
			<tr>
				<td style="color:rgb(128, 66, 0)"><b>BV Order4</b></td>
				<td><form:input path="order4" />
				</td>
			</tr>
			<tr>
				<td style="color:rgb(128, 66, 0)"><b>BV Order5</b></td>
				<td><form:input path="order5" />
				</td>
			</tr>
			<tr>
				<td style="color:rgb(128, 66, 0)"><b>BV Order6</b></td>
				<td><form:input path="order6" />
				</td>
			</tr>
			
			
			</table></center>
			
			<table style="padding-left:399px">
			<tr>
				<td style="color:rgb(128, 66, 0)"><b>Remarks</b></td>
				<td style="padding-left:33px"><form:input path="remarks" size= "85" />
				</td>
			</tr>
			</table>
			
		<br />
		<br>
		<center><input style="font-weight: bold; width: auto;color:rgb(128, 66, 0);" type="submit" value="Save"/></center>
	  
	  	
		</form:form>
		
	
  <br><br>
  <br><br>
  
 
  
  
	
	<div id="footer">
<b>© Bacherhaus Veit Ltd.</b>
</div>
</body>
</html>