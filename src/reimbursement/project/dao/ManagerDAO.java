package reimbursement.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import reimbursement.project.ConnectionFactory;

public class ManagerDAO {
	
	/* validation for log in*/
	public static boolean validate(String userName, String passWord) {
     
		    
		    
		    		try( Connection conn = ConnectionFactory.getConnection()){
		    			
		    			PreparedStatement ps = conn.prepareStatement("select * from Employee where userName= ? and passWord =?");	
		    			ps.setString(1,userName);
		    			ps.setString(2,passWord);
		    			ResultSet rs =  ps.executeQuery();
		    			return rs.next();
		    			
		    		} /* catch SQL exception */ 
		    		catch (SQLException e) {
		    			e.printStackTrace();
		    		}
		    		
	return false; 
	  
	
	
	
	
	
	
	
	
	
	
	
	}	
	

}
