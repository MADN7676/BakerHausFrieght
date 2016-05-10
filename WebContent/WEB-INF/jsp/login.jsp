<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
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
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/icpcg.css"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Backerhaus Freight Login</title>
</head>
<body>
<div id="header">
<h1 style="color:rgb(26,13,0);font-size:240%;)"><i>Backerhaus Freight Portal</i></h1>
</div>
<center>
<br/><br/>
<h1><i>Please Login Below to Access Backerhaus Freight Portal</i></h1><br/><br/>
<form:form method="POST" commandName="loginModel">
<span style="padding-left:40px">
<img  src="C:\Users\nitesh\Desktop\BackerHausFrieght\WebContent\images\logo.gif" alt="BV Logo" width="124" height="142"><br>
</span>
<span style="padding-left:70px">
<img src="C:\Users\nitesh\Desktop\BackerHausFrieght\WebContent\images\logo_sentence.gif" alt="BV Logo" width="214" height="62">
</span><br>
<table id="login">

<tr ></tr>
<tr><td id="loginInner"/><td id="loginInner" style="color:rgb(186,128,69)">User ID <td id="loginInner"><form:input path="userId" /><form:errors path="userId" cssClass="error" /></td><td id="loginInner"/></tr>
<tr></tr>
<tr><td id="loginInner"/><td id="loginInner" style="color:rgb(186,128,69)">Password</td><td id="loginInner"><form:password path="password"/><form:errors path="password" cssClass="error" /></td><td id="loginInner"/></tr>
<tr></tr>
</table><br/>
<span style="padding-left:50px">
<input type="submit" value="Login" style="color:rgb(186,128,69)" /></span>
</form:form>
<br/><br/><br/><br/><br/><br/><br/>
</center>
<div id="footer">
<b>© Bacherhaus Veit Ltd.</b>
</div>
</body>
</html>