<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!--  <meta charset="ISO-8859-1">
<title>Insert title here</title>-->

<style>
input[type=text], input[type="number"], input[type="date"] select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid grey;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=password], select {
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

input[type=submit]:hover {
  background-color: grey;
}

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;

}
h1
{
text-align: center;
color: darkblue;
}
h2
{

color: darkblue;
}
   
</style>


</head>
<body>
<form action="createController" method="get">
<div class="login-box">

<h1>Online Banking Application</h1>
<h1>Create Customer</h1>
<h2>Customer Name : </h2> <input type="text" name="cust_name" placeholder="Enter Customer name" pattern="[A-Za-z]+"  required>
<h2>Account Number : </h2> <input type="number" name="acc_num" placeholder="Enter Account number" required>
<h2>Account Type :</h2>
<select name="acc_type" required>
    <option value="">--Please choose an option--</option>
    <option value="Savings">Savings</option>
    <option value="Current">Current</option>
    </select>
<h2>Deposit Amount:</h2> <input type="number" name="balance" placeholder="Enter Amount" required>
<h2>Age:</h2> <input type="number" name="age" placeholder="Enter Customer age" required>

<h2>Address:</h2><input type="text" name="address"  placeholder="Enter address" pattern="[A-Za-z]+" required>
<h2>Phone Number : </h2> <input type="number" name="phone" placeholder="Enter phone number" required>
<h2>Gender :</h2>
<select name="gender" required>
    <option value="">--Please choose an option--</option>
    <option value="Male">Male</option>
    <option value="Female">Female</option>
    </select>

<h2>Email ID : </h2> <input type="text" name="cust_email" placeholder="Enter email address" required>

<center>
<input type="submit" value="create"/>
</center></td>



</form>
</div>
</body>
</html>