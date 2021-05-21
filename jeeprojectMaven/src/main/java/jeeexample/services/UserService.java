package jeeexample.services;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Path;

import jeeexample.models.User;
import jeeexample.repositories.UserRepository;


@RequestScoped
@Path("api/user")
public class UserService extends EntityService<UserRepository, User> {
	
	@Inject
	protected UserRepository DBP;
	
}
