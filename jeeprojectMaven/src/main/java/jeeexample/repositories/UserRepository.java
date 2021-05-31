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

	public List<User> findByMessageId(long messageId) {
		TypedQuery<User> query = entityManager.createNamedQuery(User.GET_USERS_BY_MESSAGE_ID, getEntityClass());
		query.setParameter("messageId", messageId);
		return query.getResultList();
	}
	
	public long setUsersMessageToNullByMessageId(long messageId) {
	    return entityManager.createNamedQuery(User.USERS_MESSAGE_TO_NULL).setParameter("messageId", messageId).executeUpdate();
	}
	
	public long deleteUsersByMessageId(long messageId) {
	    return entityManager.createNamedQuery(User.DELETE_USERS_WITH_MESSAGE_ID).setParameter("messageId", messageId).executeUpdate();
	}
}
