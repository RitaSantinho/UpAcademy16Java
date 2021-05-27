package jeeexample.services;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import jeeexample.models.User;
import jeeexample.repositories.UserRepository;

@RequestScoped
@Path("api/user")
public class UserService extends EntityService<UserRepository, User> {

	@Inject
	protected UserRepository DBP;

	@POST
	@Path("fullName")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public User fillName(User user) {
		user.setName(user.getFirstName() + " " + user.getLastName());
		return user;
	}

	@GET
	@Path("/message/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getShelvesByProductID(@PathParam("id") long id) {
		if (id == 0) {
			return repository.getEmptyUsers();
		} else {
			return repository.findByMessageId(id);
		}
	}
}
