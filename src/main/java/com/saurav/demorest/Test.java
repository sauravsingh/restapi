/**
 * 
 */
package com.saurav.demorest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author saurav
 *
 */
@Path("test")
public class Test {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getIt() {
		return "Welcome to api gallery";
	}
}
