package jeeexample.services;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import jeeexample.models.Message;
import jeeexample.repositories.MessageRepository;

@RequestScoped
@Path("api/message")
public class MessageService extends EntityService<MessageRepository, Message> {
	
	@Inject
	protected MessageRepository DBS;

	@GET
	@Path("/exist/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public boolean getShelvesByProductID(@PathParam("id") long id) {
			return repository.existId(id);
	}
}
