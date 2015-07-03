/**
 *
 */
package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author bertrand
 *
 */
@Entity
@Table(name = "USER_TABLE")
public class User
{
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	private int		id;
	private String	firstName;
	private String	lastName;
	private String	login;
	private String	password;
	private Date	createdAt;
	private Date	updatedAt;

	public User()
	{
	}

	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param login
	 * @param password
	 * @param createdAt
	 * @param updatedAt
	 */
	public User(final int id, final String firstName, final String lastName, final String login, final String password, final Date createdAt, final Date updatedAt)
	{
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.login = login;
		this.password = password;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	/**
	 * @return the id
	 */
	public int getId()
	{
		return (this.id);
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(final int id)
	{
		this.id = id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return (this.firstName);
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(final String firstName)
	{
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName()
	{
		return (this.lastName);
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(final String lastName)
	{
		this.lastName = lastName;
	}

	/**
	 * @return the login
	 */
	public String getLogin()
	{
		return (this.login);
	}

	/**
	 * @param login
	 *            the login to set
	 */
	public void setLogin(final String login)
	{
		this.login = login;
	}

	/**
	 * @return the password
	 */
	public String getPassword()
	{
		return (this.password);
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(final String password)
	{
		this.password = password;
	}

	/**
	 * @return the createdAt
	 */
	public Date getCreatedAt()
	{
		return (this.createdAt);
	}

	/**
	 * @param createdAt
	 *            the createdAt to set
	 */
	public void setCreatedAt(final Date createdAt)
	{
		this.createdAt = createdAt;
	}

	/**
	 * @return the updatedAt
	 */
	public Date getUpdatedAt()
	{
		return (this.updatedAt);
	}

	/**
	 * @param updatedAt
	 *            the updatedAt to set
	 */
	public void setUpdatedAt(final Date updatedAt)
	{
		this.updatedAt = updatedAt;
	}
}
