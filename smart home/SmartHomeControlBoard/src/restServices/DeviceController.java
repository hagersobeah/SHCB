/**
 * 
 */
package restServices;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path ("/deviceController")

/**
 * @author mahmoud
 *
 */
public class DeviceController {
	Device device;

	Boolean addDevice() {
		Boolean added = true;
		return added;
	}

	void removeDevice(Device device){
		
	}
	
	void getStatus(Device device){
		
	}
	
	
	@GET
	@Path ("/checkAvailability")
	@Produces (MediaType.TEXT_PLAIN)
	public static Boolean checkAvailability(){
		Boolean available=true;
		return available;
	}
	
}
