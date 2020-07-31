<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@page import="com.hcl.task.models.CustomerM"%>
       <%@page import="com.hcl.task.models.TransactionM"%>
    <%@page import="java.util.List"%>
  
<!DOCTYPE html>
<html>
<head>
<style>
input[type="button"] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid grey;
  border-radius: 4px;
  box-sizing: border-box;
}
input[type=submit] {
  width: 50%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}
h1,h2
{
text-align: center;
color: darkblue;
}
p
{
color: black;
}
  .login-box{
    width: 400px;
    height: 400px;
    background: lightgrey;
    color: #fff;
    top: 50%;
    left: 50%;
    position: absolute;
    transform: translate(-50%,-50%);
    box-sizing: border-box;
    padding: 35px 30px;
}
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
input[type=button] {
  width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

h1
{
text-align: center;
color: darkblue;
}
a

{
width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;


}
</style>
</head>
<body>
<h1>Online Banking Application</h1>
<h2>Last Five Transaction Details</h2><br>
<%int balance =Integer.parseInt(String.valueOf(session.getAttribute("currentbalance").toString())); %>
<h2> Your Current Balance :<%=balance%></h2>

<%
	List<TransactionM> transactions;

%>

<%
	transactions = (List<TransactionM>)session.getAttribute("Lasttransactions");
   if(transactions.isEmpty())
   {
%>
	   <h1>No record found</h1>
<%
	}
%>

<table border="1">
<tr>
     <th> From Account Number </th>
	
	<th> To Account Number </th>
	<th> Funds Transfered</th>
	<th> Balance </th>
	
</tr>
	   <%
	   	for(TransactionM t : transactions)
	   	   	{
	   %>
  
		<tr> 
		   <td> <%=t.getFromccno()%> </td>
	      <td> <%=t.getToaccno()%> </td>
	     
	      
	      <td> <%=t.getFunds()%> </td>
	      
	         <td> <%=t.getBalance()%> </td> 
	         
	         <%
	}
%>
	 </table>
	 
	 
	 

<form action="transferfunds.jsp" method="get">
<center>
<input type="submit" value="Transfer Funds Again ">
</form></center>



<form action="admin.jsp" method="get">
<center>
<input type="submit" value="Back">
</form></center>	 
</body>
</html>









