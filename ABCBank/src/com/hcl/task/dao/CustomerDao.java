package com.hcl.task.dao;
import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.hcl.task.models.CustomerM;
public class CustomerDao {
	private Connection con;
	private PreparedStatement pst;
	private ResultSet rs;
	private List<CustomerM> customer;
	public CustomerDao() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			this.con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdemo","root","tiger123");
			
		}
		catch(Exception e) {
			
			System.out.println(e);
			
		}
		
       }
	
		public int createCustomer(String name, int accno, String acctype,int bal, int age, String addr,
			int pno,String gen,String email)
		{
			int i=0;
			try {
				
				this.pst = this.con.prepareStatement("INSERT into customer VALUES(?,?,?,?,?,?,?,?,?)");
				
				this.pst.setString(1, name);
				this.pst.setInt(2, accno);
				this.pst.setString(3, acctype);
				this.pst.setInt(4, bal);
				this.pst.setInt(5, age);
				this.pst.setString(6, addr);
				this.pst.setInt(7, pno);
				this.pst.setString(8, gen);
				this.pst.setString(9, email);
		

				i = this.pst.executeUpdate();
			}
			catch(Exception e) {
				
				System.out.println(e);
			}
			return i;
		}
		/*
		
public List<CustomerM> getAllCustomers(int no) {

	
	List<CustomerM> users = new ArrayList<>();
	try {
	
		this.pst = this.con.prepareStatement("select count* from patient "); 
		//System.out.println(this.pst);
		// Step 3: Execute the query or update query
		//this.pst.setString(1,s);
		this.rs = this.pst.executeQuery();

		// Step 4: Process the ResultSet object.
		while (rs.next()) {
//			int id = rs.getInt("id");
//			String name = rs.getString("name");
//			String email = rs.getString("email");
//			String country = rs.getString("country");
			users.add(new patientM(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10)));
		}
	} 
	catch(Exception e) {
		
		System.out.println(e);
	}
	return users;
	
}*/

		/*
		public List<patientM> getPatientDetails(int patId) {
			// TODO Auto-generated method stub
			
			List<patientM> users = new ArrayList<>();
			try {
			
				this.pst = this.con.prepareStatement("select * from patient where patient_id=?"); 
				this.pst.setInt(1, patId);
				this.rs = this.pst.executeQuery();
				while (rs.next()) {
					users.add(new patientM(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10)));
				}
			} 
			catch(Exception e) {
				System.out.println(patId);
				System.out.println(e);
			}

			
			return users;
		}
*/
	}


