<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@page import="com.hcl.task.models.CustomerM"%>
    <%@page import="java.util.List"%>
  
<!DOCTYPE html>
<html>
<head>


<style>




body{
    margin: 0px 10px;
    padding: 0;
    background: url(https://www.moneycrashers.com/wp-content/uploads/2012/04/reasons-change-banks-1068x713.jpg);
     background-size: cover;
    background-position: center;
     background-attachment: fixed;
   font-family: sans-serif;
   height: 150px;
   width: 50%;
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
input[type=button] {
  width: 50%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}
   .login-box{
    width: 500px;
    height: 300px;
    background: rgba(0, 0, 0,0.4);
    color: #fff;
    top: 50%;
    left: 50%;
    position: absolute;
    transform: translate(-50%,-50%);
    box-sizing: border-box;
    padding: 35px 30px;
    }

h1
{
text-align: center;
color: white;
}

</style>
</head>
<body>
<div class="login-box">
<form action="ViewTransactions" method="get">

<h1>Transactions</h1>
<h2>Enter Account Number:
<input type="text" name="accnumber" placeholder="Enter Account Number" required>
</h2>
<center><input type="submit" value="View Transactions"/>

</form>
<a href="admin.jsp"><input type="button" value="Back"></a></center>
</div>
</body>
</html>