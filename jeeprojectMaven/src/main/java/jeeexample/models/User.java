package jeeexample.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = User.GET_ALL_USERS, query = "SELECT e FROM User e"),
		@NamedQuery(name = User.GET_ALL_USERS_IDS, query = "SELECT e.id FROM User e"),
		@NamedQuery(name = User.GET_USERS_COUNT, query = "SELECT COUNT(p.id) FROM User p"),
		@NamedQuery(name = User.GET_USERS_BY_MESSAGE_ID, query = "SELECT s FROM User s WHERE s.message.id = :messageId"),
		@NamedQuery(name = User.GET_EMPTY_USERS, query = "SELECT s FROM User s WHERE s.message = null"),
		@NamedQuery(name = User.USERS_MESSAGE_TO_NULL, query = "UPDATE User s SET s.message = null WHERE s.message.id = :messageId"),
		@NamedQuery(name = User.DELETE_USERS_WITH_MESSAGE_ID, query = "delete from User e where e.message.id = :messageId") })
public class User extends Entity_ {

	public static final String GET_ALL_USERS = "getAllUsers";
	public static final String GET_ALL_USERS_IDS = "getAllUsersIds";
	public static final String GET_USERS_COUNT = "getUsersCount";
	public static final String GET_USERS_BY_MESSAGE_ID = "getUsersByProductId";
	public static final String GET_EMPTY_USERS = "getEmptyUsers";
	public static final String USERS_MESSAGE_TO_NULL = "setUsersMessageToNull";
	public static final String DELETE_USERS_WITH_MESSAGE_ID = "deleteUsersByMessageId";

	private static final long serialVersionUID = 1L;
	@ManyToOne
	private Message message;
	private String name;
	private String firstName;
	private String lastName;

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "User [message=" + message + ", name=" + name + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", getId()=" + getId() + "]";
	}

}
