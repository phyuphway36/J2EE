package servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import utility.Vehicle;
import utility.VehicleDataSource;

import java.io.IOException;
import java.util.List;

/**
 * Servlet implementation class VehicleController
 */
public class VehicleController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final VehicleDataSource data = new VehicleDataSource();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VehicleController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// step1 : get data from model
		List<Vehicle> vehicleList = data.getVehicleList();
		//step2 :set data into request obj
		request.setAttribute("vehicleList", vehicleList);
		//step3: open dispatcher to forward page
		RequestDispatcher rd = request.getRequestDispatcher("vehicle-view.jsp");
		//step4 : forward request response
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
