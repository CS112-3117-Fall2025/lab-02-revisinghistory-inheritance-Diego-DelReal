public class HistoricalEvent 
{
    /********** CONSTANTS *********/
	public static final String DEFAULT_DESCRIPTION = "December";
    public static final String DEFAULT_EVENTDAY = "12/31/1959";

	/********** INSTANCE VARIABLES **********/	
    private String description, eventDay;
	
	
	/********** CONSTRUCTORS **********/
	/**
	 * Default constructor sets Date object to default values
	 */
	public HistoricalEvent()
	{
		this(DEFAULT_DESCRIPTION, DEFAULT_EVENTDAY);
	}
}
