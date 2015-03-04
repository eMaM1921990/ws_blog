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
import com.model.TopicDetails;



@Path("/user")
public class JSONService {
	@GET
	@Path("/add/{name}/{subject}")
	@Produces("application/xml")
	public Topic addDubject(
		@PathParam("name") String name,
		@PathParam("subject") String subject) {
		Topic t=new Topic();
		t.setNAME(name);
		t.setSUBJECT(subject);
		Topicdao dao=new Topicdao();
		String msg=dao.Presist(t);
		t.setIdTOPICS(Integer.valueOf(msg));
		
		return t;
 
	}
	
	
	@GET
	@Path("/subject/comment/{id}")
	@Produces(MediaType.TEXT_XML)
	public String getComments(
			@PathParam("id") String id) {
			TopicDetails comment=new TopicDetails();
			comment.setTOPICID(Integer.valueOf(id));
			
			
			
			return "<User>" + "<Name>" + id + "</Name>" +"<Name>" + id + "</Name>" + "</User>";
	 
		}
	
	
	@GET
	@Path("/subject/all")
	@Produces(MediaType.TEXT_XML)
	public String getAllSubject() {
			Topicdao dao=new Topicdao();
			List<Topic> data=dao.FindAll();
			String response="<Topics>";
			for(Topic s:data){
				
					response=response+"<Topic><name>"+s.getNAME()+"</name><sub>"+s.getSUBJECT()+"</sub></Topic>";
				
				
			}
			
			response=response+"</Topics>";
			
			
			
			
			return response;
	 
		}
	
	/*
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Topic> getTrackInJSON() {
 
		Topic t = new Topic();
		Topicdao dao=new Topicdao();
		List<Topic>data=dao.FindAll();
		
 
		return data;
 
	}
	*/
	
	/*@POST
	@Path("/postclient")
	@Consumes("application/json")
	public Response createProductInJSON(Topic product) {
 
		String result = "Product created : " + product;
		return Response.status(201).entity(result).build();
 
	}*/
	
}