package img;

import jakarta.annotation.Resource;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

/**
 * Servlet implementation class DisplayServlet
 */
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Resource(name="jdbc/imageInsert")
	private DataSource dataSource;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		System.out.println("In do post method of Display Image");
		String address = request.getParameter("address");
//		String rent = request.getParameter("rentPrice");
//		Double rentPrice = Double.parseDouble(rent);
		String imageId = request.getParameter("imageId");
		int id = Integer.parseInt(imageId);
		
		PrintWriter out = response.getWriter();
		Connection connection = null;
		int imgId = 0;
		//double rPrice = 0;
		String imgFileName = null;
				
//		Statement stmt = null;
		//ResultSet rs = null;
		
		
		try {
			connection = dataSource.getConnection();
			
			Statement stmt;
			String query = "select * from image";
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				if(rs.getInt("imageId")==id) {
					address = rs.getString("address");
					//rPrice = rs.getDouble("rentPrice");
					imgId  = rs.getInt("imageId");
					imgFileName = rs.getString("imageFileName");
				}
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher rd;
		request.setAttribute("id",String.valueOf(imgId) );
		request.setAttribute("img", imgFileName);
		//request.setAttribute("rentPrice",String.valueOf(rPrice));
		request.setAttribute("address", address);
		rd = request.getRequestDispatcher("display.jsp");
		rd.forward(request, response);
	}

}
