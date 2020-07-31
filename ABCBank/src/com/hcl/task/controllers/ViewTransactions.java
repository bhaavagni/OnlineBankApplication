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

import com.hcl.task.dao.CustomerDao;
import com.hcl.task.dao.TransactionDao;
import com.hcl.task.models.*;

/**
 * Servlet implementation class ViewPatients
 */
@WebServlet("/ViewTransactions")
public class ViewTransactions extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewTransactions() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		CustomerDao dao=new CustomerDao();
		TransactionDao d=new TransactionDao();
	     int accno=Integer.parseInt(request.getParameter("accnumber"));
		/*PrintWriter out=response.getWriter();
		out.println(accno);
		*/
		HttpSession session=request.getSession();
		List<TransactionM> tlist=new ArrayList<>();
		tlist=d.getTransactionsInfo(accno);
		int bal=d.getBalance(accno);
		session.setAttribute("Lastfivetransactions", tlist);
			session.setAttribute("currbalance",bal);
		  response.sendRedirect(request.getContextPath()+"/viewalltransactions.jsp");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
