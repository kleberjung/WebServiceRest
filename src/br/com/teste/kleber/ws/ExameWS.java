package br.com.teste.kleber.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import br.com.teste.kleber.dao.ExameDAO;
import br.com.teste.kleber.model.Exame;


@Path ("/exameWS")
public class ExameWS {
	
	@GET
	@Path("getExame")
	public Exame getExame() {
	//public Exame getExame(int idExame) {
		
		//http://localhost:8080/DWP_Rest/rest/exameWS/getExame
		Exame exame = new Exame();
		ExameDAO exameDAO = new ExameDAO();
		
		try {
			//exame = exameDAO.getExame(idExame);
			exame = exameDAO.getExame(1);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return exame;
	}

}