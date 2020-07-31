package com.hcl.task.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hcl.task.dao.TransactionDao;
import com.hcl.task.models.TransactionM;

/**
 * Servlet implementation class AddMedicine
 */
@WebServlet("/AddFunds")
public class AddFunds extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddFunds() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//String MedName=request.getParameter("MedicineName");
		int fromaccnumb=Integer.parseInt(request.getParameter("fromaccnum"));
		
		int toaccnumb=Integer.parseInt(request.getParameter("toaccnum"));
		
		int amount=Integer.parseInt(request.getParameter("funds"));
		
		PrintWriter out=response.getWriter();
		//out.println("from "+fromaccnumb+" To"+toaccnumb+" amt"+amount);
	
		
		TransactionDao dao=new TransactionDao();
		int currbalance=dao.updateAndGetBalance(fromaccnumb,toaccnumb,amount);
		int i=dao.addFunds(fromaccnumb,toaccnumb,amount,currbalance);
		System.out.println(i);

		HttpSession session=request.getSession();
		List<TransactionM> d=new ArrayList<>();
		d=dao.getTransactionsInfo(fromaccnumb);
		session.setAttribute("Lasttransactions", d);
		
		/*
		for(TransactionM t : d)
   	   	{
         
        		 System.out.println(t.getFromccno());
     
   	   	}*/
		
		
		session.setAttribute("currentbalance",currbalance);
		response.sendRedirect(request.getContextPath()+"/viewrecenttransactions.jsp");	
	
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
