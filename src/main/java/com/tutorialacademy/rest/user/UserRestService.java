package com.tutorialacademy.rest.user;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import org.glassfish.jersey.server.ResourceConfig;

@Path("/user")
public class UserRestService extends ResourceConfig { 
	
	final static Logger logger = Logger.getLogger( UserRestService.class );
	
	@POST
	@Path("/userNoAnnotation")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response userNoAnnotation( UserNoAnnotation user ) {
		logger.info( user );
		
		return Response.ok( user ).build();
	}	
	
	@POST
	@Path("/userHidePassword")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response userHidePassword( UserHidePassword user ) {
		logger.info( user );
		
		return Response.ok( user ).build();
	}
	
	@POST
	@Path("/userIgnorePassword")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response userIgnorePassword( UserIgnorePassword user ) {
		logger.info( user );
		
		return Response.ok( user ).build();
	}
	
}
