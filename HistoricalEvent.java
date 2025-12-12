import java.text.DateFormat;

public class HistoricalEvent 
{
    /********** CONSTANTS *********/
	public static final String DEFAULT_DESCRIPTION = "December";
    public static final Date DEFAULT_EVENT_DAY = new Date();

	/********** INSTANCE VARIABLES **********/	
	private String description;
	private Date eventDay;
	
	
	/********** CONSTRUCTORS **********/
	/**
	 * Default constructor sets Date object to default values
	 */
	public HistoricalEvent()
	{
		this(DEFAULT_DESCRIPTION, DEFAULT_EVENT_DAY);
	}

	public HistoricalEvent(String description, Date eventDay) {
		if (!this.setAll(description, eventDay)) {
			System.out.println("ERROR: Bad data given to constructor");
			System.exit(0);
		}
	}

	public HistoricalEvent(HistoricalEvent original) {
		if (original != null) {
			this.setAll(original.description, original.eventDay);
		} else {
			System.out.println("ERROR: Null data given to constructor");
			System.exit(0);
		}
	}


	public boolean setAll(String description, Date eventDay) {
		return this.setDescription(description) && this.setEventDay(eventDay);
	}


	@Override
	public String toString() {
		return "On " + this.eventDay + ": " + this.description;
	}

	@Override
	public boolean equals(Object other) {
		if (other == null) {
			return false;
		} else if (!(other instanceof HistoricalEvent)) {
			return false;
		} else {
			HistoricalEvent otherEvent = (HistoricalEvent) other;
			return this.description.equals(otherEvent.description) && this.eventDay.equals(otherEvent.eventDay);
		}
	}

	public boolean setDescription(String description) {
			this.description = description;
			return true;
	}

	public boolean setEventDay(Date eventDay) {
		this.eventDay = eventDay;
		return true;
	}


	public String getDescription() {
		return this.description;
	}

	public Date getEventDay() {
		return new Date(this.eventDay);
	}

}
