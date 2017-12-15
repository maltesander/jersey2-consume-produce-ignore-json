package com.tutorialacademy.rest.post;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import org.glassfish.jersey.server.ResourceConfig;

@Path("/post")
public class PostRestService extends ResourceConfig {
	
	final static Logger logger = Logger.getLogger( PostRestService.class );
	
	@POST
	@Path("/ignorePropertiesTrue")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response ignorePropertiesTrue( PostIgnorePropertiesTrue post ) {
		logger.info( post );
		
		return Response.ok( post, MediaType.APPLICATION_JSON ).build();
	}
	
	@POST
	@Path("/ignorePropertiesFalse")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response ignorePropertiesFalse( PostIgnorePropertiesFalse post ) {
		logger.info( post );
		
		return Response.ok( post, MediaType.APPLICATION_JSON ).build();
	}
	
}
