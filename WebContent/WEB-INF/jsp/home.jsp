<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml-transitional.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<head>

<title>BV FREIGHT DETAILS</title>
<style>

table {
    width:100%;
}

table, th , td {
    border: 1px solid grey;
    border-collapse: collapse;
    padding: 5px;
}

th {
    text-align: left; 
}

table tr:nth-child(odd) {
    background-color: #f1f1f1;
}
table tr:nth-child(even) {
    background-color: #ffffff;
}

</style>
<style>
#header {
    background-color:rgb(186,128,69);
    color:white;
    text-align:center;
    padding:35px;
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
</head>

<body id="content">
<div id="header">
<h1 style="color:rgb(26,13,0);font-size:240%;)"><i>Frieght Details</i></h1>
</div>
<br/>


         <span style="padding-left:1150px">
		<a  href="logout.htm" style="color:rgb(186,128,69)"><b><i>Log Out</i></b></a></span>
		<br/>
	<center>
		
		<a href="addFreightDetails.htm"><b>Add Request</b></a>
		<br/><br/>
		
		<table>
			<tr>
  				<th>Invoice No.</th>
  				<th>Invoice Date</th>
 				<th>Freight Charges</th>
 				<th>Lumper Charges</th>
  				<th>HST</th>
 				<th>BV Order1</th>
 				<th>BV Order2</th>
  				<th>BV Order3</th>
 				<th>BV Order4</th>
  				<th>BV Order5</th>
 				<th>BV Order6</th>
 				<th>Create Date</th>
 				<th>Create User</th>
			</tr>
			<c:forEach var="freightDetail" items="${freightDetails}">
				<tr>
					<td>
						${freightDetail.invoiceNumber}
					</td>
					<td>
						${freightDetail.invoiceDate}
					</td>
					<td>
						${freightDetail.frtCharges}
					</td>
					<td>
						${freightDetail.lumperCharges}
					</td>
					<td>
						${freightDetail.hst}
					</td>
					<td>
						${freightDetail.order1}
					</td>
					<td>
						${freightDetail.order2}
					</td>
					<td>
						${freightDetail.order3}
					</td>
					<td>
						${freightDetail.order4}
					</td>
					<td>
						${freightDetail.order5}
					</td>
					<td>
						${freightDetail.order6}
					</td>
					<td>
						${freightDetail.createDate}
					</td>
					<td>
						${freightDetail.createUserId}
					</td>
				</tr>
			</c:forEach>
		</table>
		 <br/><br/>
	</center>
	
	<div id="footer">
<b>© Bacherhaus Veit Ltd.</b>
</div>
	

</body>
</html>