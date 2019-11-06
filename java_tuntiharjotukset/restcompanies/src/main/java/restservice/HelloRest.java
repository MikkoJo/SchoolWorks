package restservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
 
@Path("/hello")
public class HelloRest {
 
	@GET
	@Path("/{name}")
	public Response getMsg(@PathParam("name") String msg) {
		String result = "Nimesi on : " + msg;
		return Response.status(200).entity(result).build();
 
	}
 
}