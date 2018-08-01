package br.com.rs.restjersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/mainservice")
public class MainService {

	@GET
	@Produces("application/xml")
	public String hello() {
 		String result = "hello restful world";
		return result;
	}
	
	@Path("{param}")
	@GET
	@Produces("application/xml")
	public String saudacao(@PathParam("param") String param) {
		String saudacao = param;
		String result = "Hello "+saudacao;
 
		return result;
	}
	
}
