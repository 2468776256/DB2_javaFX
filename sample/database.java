package sample;

import java.sql.*;

import javafx.collections.ObservableList;

public class database {
	 static
	    {   try
	        {   
	              Class.forName ("com.ibm.db2.jcc.DB2Driver");
	        }
	        catch (Exception e)
	        {   System.out.println ("\n  Error loading DB2 Driver...\n");
	            System.out.println (e);
	            System.exit(1);
	        }
	    }
	 public static void main(String args[]) throws Exception {		

	 }
	 public static void import_observableList(ObservableList<Staff> staffObservableList) throws SQLException {
		 Connection con=null;
		 String url="jdbc:db2:SAMPLE";
		 //String userid="db2admin";
		 // String passwd="981020";
		 con=DriverManager.getConnection(url);
		 Statement stmt = con.createStatement();
		 ResultSet rs = stmt.executeQuery("select * from staff");
		 boolean more = rs.next();
		 staffObservableList.clear();
		 while(more) {
			 String a="NULL";
			 String b="NULL";
			 String c="NULL";
			 String d="NULL";
			 String e="NULL";
			 String f="NULL";
			 String g="NULL";
			 if(rs.getString(1)!=null)
				 a = rs.getString(1);
			 if(rs.getString(2)!=null)
				 b = rs.getString(2);		
			 if(rs.getString(3)!=null)
				 c= rs.getString(3);			 
			 if(rs.getString(4)!=null)
				 d= rs.getString(4);			 
			 if(rs.getString(5)!=null)
				 e = rs.getString(5);			 
			 if(rs.getString(6)!=null)
				 f = rs.getString(6);			 
			 if(rs.getString(7)!=null)
				 g = rs.getString(7);			 
			 Staff temp = new Staff(a,b,c,d,e,f,g);
			 staffObservableList.add(temp);
			 more = rs.next();
		 }
	}
	 
	 
	 
	 public static void save_data(ObservableList<Staff> staffObservableList,int NUM) throws SQLException { 
		 Connection con=null;
		 String url="jdbc:db2:SAMPLE";
		 con=DriverManager.getConnection(url);

		 Staff stafftext;
		 for(int i = staffObservableList.size(); i > NUM; i--) {
			 stafftext = staffObservableList.get(i-1);
			 String id = stafftext.getID();
			 String name = stafftext.getNAME();
			 String dept = stafftext.getDEPT();
			 String job = stafftext.getJOB();
			 String years = stafftext.getYEARS();
			 String salary = stafftext.getSALARY();
			 String comm = stafftext.getCOMM();
			 String sql="insert into STAFF(ID,NAME,DEPT,JOB,YEARS,SALARY,COMM) values(?,?,?,?,?,?,?)";  
			 PreparedStatement pstmt=(PreparedStatement) con.prepareStatement(sql); 
			 pstmt.setInt(1, Integer.parseInt(id));
			 pstmt.setString(2, name);
			 pstmt.setInt(3, Integer.parseInt(dept));
			 pstmt.setString(4, job);
			 if(!years.equals(null)&&!years.equals("")){
				 pstmt.setInt(5,Integer.parseInt(years));
			 }
			 else pstmt.setNull(5, Types.SMALLINT);
			 if(salary!=null&&!salary.equals("")){
				 pstmt.setDouble(6, Double.valueOf(salary.toString()));
			 }
			 else pstmt.setNull(6, Types.SMALLINT);
			 if(comm!=null&&!comm.equals("")){
				 pstmt.setDouble(7, Double.valueOf(comm.toString()));
			 }
			 else pstmt.setNull(7, Types.SMALLINT);
			 pstmt.executeUpdate();  
			 
		 }
	 }
	 public static void update(Staff staff) throws SQLException {
		 Connection con=null;
		 String url="jdbc:db2:SAMPLE";
		 con=DriverManager.getConnection(url);
		 String id = staff.getID();
		 String name = staff.getNAME();
		 String dept = staff.getDEPT();
		 String job = staff.getJOB();
		 String years = staff.getYEARS();
		 String salary = staff.getSALARY();
		 String comm = staff.getCOMM();
		 String sql="UPDATE STAFF SET NAME=?, DEPT=?, JOB=?, YEARS=?, SALARY=?, COMM=? WHERE ID =";  
		 PreparedStatement pstmt=(PreparedStatement) con.prepareStatement(sql+id); 
		 pstmt.setString(1, name);
		 pstmt.setInt(2, Integer.parseInt(dept));
		 pstmt.setString(3, job);
		 if(!years.equals(null)&&!years.equals("")){
			 pstmt.setInt(4,Integer.parseInt(years));
		 }
		 else pstmt.setNull(4, Types.SMALLINT);
		 if(salary!=null&&!salary.equals("")){
			 pstmt.setDouble(5, Double.valueOf(salary.toString()));
		 }
		 else pstmt.setNull(5, Types.SMALLINT);
		 if(comm!=null&&!comm.equals("")){
			 pstmt.setDouble(6, Double.valueOf(comm.toString()));
		 }
		 else pstmt.setNull(6, Types.SMALLINT);
		 pstmt.executeUpdate();  
		 
		 
	 }
	 
	 
	 public static boolean same_mainkey(ObservableList<Staff> staffObservableList,int ID) {
		 int size = staffObservableList.size();
		 Staff stafftext;
		 for(int i = 0; i < size; i++) {
			 stafftext= staffObservableList.get(i);
			 if(ID == Integer.parseInt(stafftext.getID())) 
					return false;
		 }
		 return true;
	 }
}








