package br.com.teste.kleber.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path ("/WS1")
public class WebService01 {
	
	@GET
	@Path("/teste")
	public String isAlive() {
		//http://localhost:8080/DWP_Rest/rest/WS1/teste
		return "Funciona!!!";
	}

}
