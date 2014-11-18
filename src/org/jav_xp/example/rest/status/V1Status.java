package org.jav_xp.example.rest.status;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


@Path("/v1/status/*")
public class V1Status{

	private static final String API_VERSION = "1.0"; 
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle() {
		return "<p>Java Web Service</p>";
	}
	
	@Path("/version")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnVersion() {
		return "<p>Version: "+API_VERSION+"</p>";
	}
}
