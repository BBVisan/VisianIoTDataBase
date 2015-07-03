/**
 *
 */
package models;

/**
 * @author bertrand
 *
 */
public class Project
{
	private int				id;
	private String			client;
	private String			useCase;
	private IndustryType	primaryField;
	private IndustryType	secondaryField;
	private IOTType			primaryIOT;
	private IOTType			secondaryIOT;
	private String			description;
	private Delivery		delivery;
	private DevSoft			soft;
	private DevHard			hard;
	private String			notes;

	public Project()
	{
	}

	/**
	 * @param id
	 * @param client
	 * @param useCase
	 * @param primaryField
	 * @param secondaryField
	 * @param primaryIOT
	 * @param secondaryIOT
	 * @param description
	 * @param delivery
	 * @param soft
	 * @param hard
	 * @param notes
	 */
	public Project(final int id, final String client, final String useCase, final IndustryType primaryField, final IndustryType secondaryField, final IOTType primaryIOT, final IOTType secondaryIOT,
			final String description, final Delivery delivery, final DevSoft soft, final DevHard hard, final String notes)
	{
		this.id = id;
		this.client = client;
		this.useCase = useCase;
		this.primaryField = primaryField;
		this.secondaryField = secondaryField;
		this.primaryIOT = primaryIOT;
		this.secondaryIOT = secondaryIOT;
		this.description = description;
		this.delivery = delivery;
		this.soft = soft;
		this.hard = hard;
		this.notes = notes;
	}

	public int getId()
	{
		return (this.id);
	}

	public void setId(final int id)
	{
		this.id = id;
	}

	public String getClient()
	{
		return (this.client);
	}

	public void setClient(final String client)
	{
		this.client = client;
	}

	public String getUseCase()
	{
		return (this.useCase);
	}

	public void setUseCase(final String useCase)
	{
		this.useCase = useCase;
	}

	public IndustryType getPrimaryField()
	{
		return (this.primaryField);
	}

	public void setPrimaryField(final IndustryType primaryField)
	{
		this.primaryField = primaryField;
	}

	public IndustryType getSecondaryField()
	{
		return (this.secondaryField);
	}

	public void setSecondaryField(final IndustryType secondaryField)
	{
		this.secondaryField = secondaryField;
	}

	public IOTType getPrimaryIOT()
	{
		return (this.primaryIOT);
	}

	public void setPrimaryIOT(final IOTType primaryIOT)
	{
		this.primaryIOT = primaryIOT;
	}

	public IOTType getSecondaryIOT()
	{
		return (this.secondaryIOT);
	}

	public void setSecondaryIOT(final IOTType secondaryIOT)
	{
		this.secondaryIOT = secondaryIOT;
	}

	public String getDescription()
	{
		return (this.description);
	}

	public void setDescription(final String description)
	{
		this.description = description;
	}

	public Delivery getDelivery()
	{
		return (this.delivery);
	}

	public void setDelivery(final Delivery delivery)
	{
		this.delivery = delivery;
	}

	public DevSoft getSoft()
	{
		return (this.soft);
	}

	public void setSoft(final DevSoft soft)
	{
		this.soft = soft;
	}

	public DevHard getHard()
	{
		return (this.hard);
	}

	public void setHard(final DevHard hard)
	{
		this.hard = hard;
	}

	public String getNotes()
	{
		return (this.notes);
	}

	public void setNotes(final String notes)
	{
		this.notes = notes;
	}
}
