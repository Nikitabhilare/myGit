package JdbcEx;

import java.sql.*;

public class JdbcEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn;
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","niki");
	//	System.out.println("connection established");
		Statement st=conn.createStatement();
	//	st.execute("insert into employee values(900, 'saloni', 8000)");
	//	PreparedStatement ps=conn.prepareStatement("insert into employee values(700, 'riddhi', 30000)");
		PreparedStatement ps=conn.prepareStatement("insert into employee values(?,?,?)");

 /*     ps.setInt(1, 500);
        ps.setString(2, "pooja");
        ps.setInt(3, 3000);
        ps.execute(); 


        ResultSet rs=ps.executeQuery("DELETE FROM employee WHERE salary='8000'");

        while(rs.next())
        {
            System.out.println(rs.getInt(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getInt(3));
        }
//		ps.execute();
//		ps.close();
		
		}*/
		CallableStatement c=conn.prepareCall("{call pro1()}");}
		catch(SQLException | ClassNotFoundException ex) {
			System.out.println(ex);
		}
	}

}
