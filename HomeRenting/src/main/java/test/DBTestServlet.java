package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import home.model.House;
//import home.model.House;
import jakarta.annotation.Resource;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DBTestServlet extends HttpServlet{
private static final long serialVersionUID = 1L;
	
	@Resource(name="jdbc/homeRenting")
	private DataSource dataSource;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DBTestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		Connection connection = null;
		Statement stmt = null;
		ResultSet rs = null;
		
	
		
		try {
			connection = dataSource.getConnection();
			
			stmt = connection.createStatement();
			rs = stmt.executeQuery("select * from home;");
			
			while (rs.next()) {
				House house = new House(
						rs.getInt("id"), 
						rs.getString("address"), 
						rs.getDouble("rentPrice"), 
						rs.getInt("bedRoom"), 
						rs.getInt("kitchen"), 
						rs.getInt("bathRoom"),  
						rs.getBoolean("vaccancy"));
				out.print(house+"\n");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(connection!=null) {
				
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
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
