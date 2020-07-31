package com.hcl.task.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.hcl.task.models.TransactionM;


public class TransactionDao {
	
private Connection con;
	
	private PreparedStatement pst;
	
	private ResultSet rs;
	

	
	public TransactionDao() {
		
			try {
				
Class.forName("com.mysql.jdbc.Driver");
				
				this.con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdemo","root","tiger123");
					
			}
			catch(Exception e) {
				
				System.out.println(e);
				
			}
	
	}

	
	
	
	

	public int updateAndGetBalance(int fid, int tid, int money) {
		// TODO Auto-generated method stub
		int q=0;
		try {
			
			this.pst = this.con.prepareStatement("update customer set balance=balance-'"+money+"' where acc_number=?");
			
			
			this.pst.setInt(1,fid);
			
			 this.pst.executeUpdate();
		    this.pst = this.con.prepareStatement("update customer set balance=balance+'"+money+"'  where acc_number=?");
					this.pst.setInt(1,tid);
				  this.pst.executeUpdate();
			
				  this.pst=this.con.prepareStatement("select * from customer where acc_number=?");
		     this.pst.setInt(1,fid);
		     this.rs=this.pst.executeQuery();
		     while (rs.next()) {
					q=rs.getInt("balance");
				}
		
		}
		catch(Exception e) {
			
			System.out.println(e);
		}

		return q;

	}

	
	
	
	
	
	

	public int addFunds(int fId, int tId, int money,int bal) {
		// TODO Auto-generated method stub
		int i=0;
		try {
			
			this.pst = this.con.prepareStatement("INSERT into transaction VALUES(?,?,?,?)");
			
			this.pst.setInt(1,fId);
			this.pst.setInt(2,tId);
			this.pst.setInt(3,money);
			this.pst.setInt(4, bal);
					
			i = this.pst.executeUpdate();
						
		   
		}
		catch(Exception e) {
			
			System.out.println(e);
		}

		return i;

	}

	

	public List<TransactionM> getTransactionsInfo(int fId) {
		// TODO Auto-generated method stub
		List<TransactionM> d= new ArrayList<>();
		try {
			
			this.pst = this.con.prepareStatement("select * from transaction where fromaccno=? ORDER BY balance LIMIT 0,5"); 
			
			
			this.pst.setInt(1,fId);
			this.rs = this.pst.executeQuery();
			while (rs.next()) {
				d.add(new TransactionM(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4))) ;
			}
		} 
		catch(Exception e) {
			
			System.out.println(e);
		}

		return d;
	}

	public int getBalance(int ano)
	
	
	{int q=0;
		try {
			
			

			  this.pst=this.con.prepareStatement("select * from customer where acc_number=?");
	     this.pst.setInt(1,ano);
	     this.rs=this.pst.executeQuery();
	     while (rs.next()) {
				q=rs.getInt("balance");
			
		}
		}
		
		catch(Exception e)
		{
			
			System.out.println(e);
			
		}
	return q;	
		
	}
		

}
	

