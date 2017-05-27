package com.hodor.rest.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public class HelloResource {

	private static final String HELLO_TEXT = "Welcome to JAX-RS World !!!";

	/*
	 * You can defined the @Path() on the method The URL in this case would be
	 * http://localhost:8080/JAX-RS-Starter/app/hello/myhello
	 */
	@GET
	@Produces("text/plain")
	// @Path("myhello")
	public String getHello() {
		return HELLO_TEXT;
	}
}
