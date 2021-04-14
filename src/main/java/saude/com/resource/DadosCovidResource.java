package saude.com.resource;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import io.quarkus.security.User;
import saude.com.model.DadosCovid;
import saude.com.service.DadosCovidMinSaude;
@Path("/datacovid")
public class DadosCovidResource {
	@Inject
	@RestClient
	DadosCovidMinSaude dadoscovidminsaude;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<DadosCovid> listar(){
		return dadoscovidminsaude.listar();
	}
}
