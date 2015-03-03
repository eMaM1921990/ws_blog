package com.api;


import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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
		String msg=dao.Presist(o);
		
		return Response.status(200)
			.entity("addUser is called, name : " + name + ", age : " + subject)
			.build();
 
	}
	
	
}