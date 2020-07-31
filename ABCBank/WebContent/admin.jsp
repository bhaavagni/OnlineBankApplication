<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!--  <meta charset="ISO-8859-1">
<<title>Insert title here</title>-->
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


input[type=text], input[type="number"], input[type="date"] select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid grey;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 100%;
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

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
h1,h2,h3
{
text-align: center;
color: white;
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
</style>


</head>
<body>

<div class="login-box">
<h1>Online Banking Application</h1>
<h2>Welcome Admin</h2>
<form action="create.jsp" >
<input type="submit" value="Create Customer">
</form>
<form action="View.jsp" >
<input type="submit" value="View Transactions">
</form>
<form action="transferfunds.jsp" >
<input type="submit" value="Transfer Funds">

</form><form action="logout" >
<input type="submit" value="Logout">
</form>
</div>
</body>
</html>