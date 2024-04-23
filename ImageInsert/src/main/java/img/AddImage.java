package img;

import jakarta.annotation.Resource;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

/**
 * Servlet implementation class AddImage
 */

@MultipartConfig
public class AddImage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Resource(name="jdbc/imageInsert")
	private DataSource dataSource;
       
	 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddImage() {
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
		System.out.println("In do post method of Add Image");
		String address = request.getParameter("address");
		String rent = request.getParameter("rentPrice");
		double rentPrice = Double.parseDouble(rent);
		
		Part file = request.getPart("image");
		
		String imageFileName = file.getSubmittedFileName();
		System.out.println("Selected Image"+ imageFileName);
		
		String uploadPath = "C:/JobReadyJavaEEOfline/HomeRenting/src/main/webapp/image/"+imageFileName;
		System.out.println("UploadPath"+uploadPath);
		try {
		FileOutputStream fos = new FileOutputStream(uploadPath);
		InputStream is = file.getInputStream();
		
		byte[] data = new byte[is.available()];
		is.read(data);
		fos.write(data);
		fos.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		PrintWriter out = response.getWriter();
		Connection connection = null;
		Statement stmt = null;
		ResultSet rs = null;
		int row = 0;
		
		try {
			connection = dataSource.getConnection();
			
			PreparedStatement pstmt;
			String query = "INSERT INTO `imgdb`.`image` "
					+ "(`imageFileName`, `address`) "
					+ "VALUES (?, ?);";
			pstmt = connection.prepareStatement(query);
			pstmt.setString(1, imageFileName);
		//	pstmt.setDouble(2, rentPrice);
			pstmt.setString(2, address);
			 row = pstmt.executeUpdate();
			
			if(row>0) {
				System.out.println("image added into database successfully");
			}
			else {
				System.out.println("Failed to upload image");
			}
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
