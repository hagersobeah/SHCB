/**
 * 
 */
package restServices;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/accountController")
/**
 * @author mahmoud
 *
 */
public class AccountController {
	User user;

	@GET
	@Path("/getInfo")
	@Produces(MediaType.TEXT_PLAIN)
	public static String getInfo() {
		
		String info = "";
		return info;
	}
	
	@POST
	@Path ("/signIn")
	@Produces(MediaType.TEXT_PLAIN)
	
	public static Boolean signIn() {
		Boolean signedIn = true;
		return signedIn;
	}

	void signUp(User user) {

	}

	//@Path("/signOut")
	public static String signOut(User user) {
		return "Signed out successfully";
	}

	void addUser(User user) {

	}

	void removeUser(User user) {

	}


	void removeAccount(User user) {

	}

}
