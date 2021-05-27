package jeeexample.repositories;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.persistence.TypedQuery;

import jeeexample.models.User;

@RequestScoped
public class UserRepository extends EntityRepository<User> {

	@Override
	protected Class<User> getEntityClass() {
		return User.class;
	}

	@Override
	protected String getAllEntities() {
		return User.GET_ALL_USERS;
	}
	
	@Override
	protected String getAllEntitiesIds() {
		return User.GET_ALL_USERS_IDS;
	}
	
	@Override
	protected String getEntitiesCount() {
		return User.GET_USERS_COUNT;
	}
	
	public List<User> getEmptyUsers() {
		return entityManager.createNamedQuery(User.GET_EMPTY_USERS, getEntityClass()).getResultList();
	}

	public List<User> findByMessageId(long id) {
		TypedQuery<User> query = entityManager.createNamedQuery(User.GET_USERS_BY_MESSAGE_ID, getEntityClass());
		query.setParameter("messageId", id);
		return query.getResultList();
	}
}
