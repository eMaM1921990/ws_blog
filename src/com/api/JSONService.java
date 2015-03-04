package com.api;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.daos.Topicdao;
import com.model.Topic;



@Path("/user")
public class JSONService {
	@POST
	@Path("/add")
	public Response addUser(
		@FormParam("NAME") String name,
		@FormParam("subject") String subject) {
		Topic t=new Topic();
		t.setNAME(name);
		t.setSUBJECT(subject);
		Topicdao dao=new Topicdao();
		String msg=dao.Presist(t);
		
		return Response.status(200)
			.entity("addUser is called, name : " + name + ", age : " + subject)
			.build();
 
	}
	
	
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Topic> getTrackInJSON() {
 
		Topic t = new Topic();
		Topicdao dao=new Topicdao();
		List<Topic>data=dao.FindAll();
		
 
		return data;
 
	}
	
	
	@POST
	@Path("/postclient")
	@Consumes("application/json")
	public Response createProductInJSON(Topic product) {
 
		String result = "Product created : " + product;
		return Response.status(201).entity(result).build();
 
	}
	
}