package utility;

import java.util.Arrays;
import java.util.List;

public class VehicleDataSource {
	
	public List<Vehicle> getVehicleList(){
	
		List<Vehicle> vehicles = Arrays.asList(
				new Vehicle ("Toyota","Ciax",2020),
				new Vehicle ("Toyota","Probox",2020),
				new Vehicle ("Toyota","Corollina",2020),
				new Vehicle ("Lambodina","Advendator",2020),
				new Vehicle ("Toyota","Terminator",2020),
				new Vehicle ("Toyota","Crown",2020)

				
				);
		return vehicles;
	}

}
