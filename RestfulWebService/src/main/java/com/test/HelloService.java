package com.test;

import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class HelloService {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/text")
public String simplePlainTextResponse() {
	return "This is simple Restful web service plain text Reponse";
}
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/html/{debit}")
public String htmlTextResponse(@PathParam("debit") String card) {
	return "<html><body><h1>Simple RestAPI HTML Response card no: "+card+"</h1></body></html>";
}
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String greetUserResponse(@QueryParam("msg")String msg) {
		return msg;
	}
	//if we use post then use consume
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public List<UserDetails> listAllUsersData(){
		UserDetails u1=new UserDetails(1,"Rohith","sharma","java@dev.com",1233445897);
		UserDetails u2=new UserDetails(2,"Ro","kho","kunti@dev.com",666445891);
		UserDetails u3=new UserDetails(3,"Raa","sha","raa@dev.com",123344589);
		
		return List.of(u1,u2,u3);
	}
}
