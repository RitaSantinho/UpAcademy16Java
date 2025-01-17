package jeeexample.repositories;

import javax.enterprise.context.RequestScoped;

import jeeexample.models.Message;

@RequestScoped
public class MessageRepository extends EntityRepository<Message> {

	@Override
	protected Class<Message> getEntityClass() {
		return Message.class;
	}

	@Override
	protected String getAllEntities() {
		return Message.GET_ALL_MESSAGES;
	}

	@Override
	protected String getAllEntitiesIds() {
		return Message.GET_ALL_MESSAGES_IDS;
	}

	@Override
	protected String getEntitiesCount() {
		return Message.GET_MESSAGES_COUNT;
	}

	public boolean existId(long id) {
		String query = "SELECT COUNT(e) FROM Message e WHERE e.id = " + id;
		Long count = (Long) entityManager.createQuery(query).getSingleResult();
		return ((count.equals(0L)) ? false : true);
	}
}
