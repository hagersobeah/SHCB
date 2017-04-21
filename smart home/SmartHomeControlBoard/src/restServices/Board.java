package restServices;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/board")
public class Board {
	String boardName;
	String boardID;
	
@GET
@Path("/get")
@Produces (MediaType.TEXT_PLAIN)
public static String getInfo()
{
	return "hi";
}
}
