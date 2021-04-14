package saude.com.service;


import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import saude.com.model.DadosCovid;

@Path("/_search")
@RegisterRestClient() 
public interface DadosCovidMinSaude {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<DadosCovid> listar();
}
