package com.hcl.task.controllers;

import java.io.IOException;

import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hcl.task.dao.CustomerDao;
/**
 * Servlet implementation class createController
 */
@WebServlet("/createController")
public class createController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public createController() {
        super();
        // TODO Auto-generated constructor stub
    }
int ssnpatient,p_idp,agep,i=0;
String cname,catype,address,email,gen;
int canum,cbal,cage,cphone;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		 cname=request.getParameter("cust_name");
		 canum=Integer.parseInt(request.getParameter("acc_num"));
		 catype=request.getParameter("acc_type");
		 cbal=Integer.parseInt(request.getParameter("balance"));
        cage=Integer.parseInt(request.getParameter("age"));
		 address=request.getParameter("address");
		    cphone=Integer.parseInt(request.getParameter("phone"));
		 email=request.getParameter("cust_email");
		 gen=request.getParameter("gender");
		 PrintWriter out=response.getWriter();

		 CustomerDao cd=new CustomerDao();
		 i=cd.createCustomer(cname,canum,catype,cbal,cage,address,cphone,gen,email);
			
			if(i>0)
			{
				 response.sendRedirect(request.getContextPath()+"/welcome.jsp");
//				System.out.print("Patient inserted successfuly");
//				
//				out.println("<a href='mainlogin.jsp'>click here to go back to main screen</a>");
//				
				
			}
			else
			{
				
				 response.sendRedirect(request.getContextPath()+"/error.jsp");
				//System.out.print("Insert patient again");
				
				//out.println("<a href='mainlogin.jsp'>click here to go back to main screen and create again</a>");
				
			}
			
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
