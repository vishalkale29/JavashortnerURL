package com.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import com.demo.service.ServiceProvider;

@Path("/Demo")
public class HelloWorldService {
	
	
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {

		ServiceProvider serviceProvider=new ServiceProvider();
		
		String outPut=serviceProvider.getShortUrl(msg);
		
		
		if(!msg.contains("http")){
		msg="http://"+msg;
		}
		
		
		msg = "\"" + msg + "\"";
       
		
		 String output="<html> " + "<title>" + "Hello Jersey" + "</title>"
			        + "<body><h1>" + "Click Me-->" + "<a href="+msg+">"+ outPut+"</a></h1> </body>" + "</html> ";
			    
			    return Response.status(200).entity(output).build();

	}
	
	
}