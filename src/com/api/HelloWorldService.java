package com.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import com.model.Topic;
 
@Path("/uk")
public class HelloWorldService {
 
	/*
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
 
		String output = "Jersey say : " + msg;
 
		return Response.status(200).entity(output).build();
 
	}*/
 
	
	@POST
	@Path("/post")
	@Consumes("application/json")
	public Response createTopicInJSON(Topic p) {
		String result = "Product created : ";
		return Response.status(201).entity(result).build();
	}
}