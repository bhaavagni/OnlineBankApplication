<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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


select,input[type=number]{
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid grey;
  border-radius: 4px;
  box-sizing: border-box;
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

input[type=submit]:hover {
  background-color: grey;
}
 .login-box{
    width: 500px;
    height: 500px;
    background: rgba(0, 0, 0,0.4);
    color: #fff;
    top: 50%;
    left: 50%;
    position: absolute;
    transform: translate(-50%,-50%);
    box-sizing: border-box;
    padding: 35px 30px;
}
h2,h3
{
text-align: left;
color: white;
}
h1
{text-align: center;
color: white;
}
p
{

color: black;
}

</style>
</head>
<body>

<form action="AddFunds" method="get">
<div class="login-box">
<h1>Online Banking Application</h1>
<h3>Enter From Account Number : 
<input type="text" name="fromaccnum" placeholder="Enter your account number"required></h3>

<h3>Enter To Account Number : 
<input type="text" name="toaccnum" placeholder="Enter your recipient account number"required>
</h3>

<h3>Enter funds to transfer:  
<input type="text" name="funds" placeholder="Enter funds"required></h3>


<center><input type="submit" value="Transfer Funds"/></center>
<center><a href="admin.jsp"><input type="button" value="Back"></a></center>

</form>
</div>
</body>
</html>