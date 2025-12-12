public class RevisedHistoricalEvent extends HistoricalEvent
{
    public static final String DEFAULT_REVISED_DESCRIPTION = "Revised description";
    public static final String DEFAULT_CITATION = "Academic citation";


    private String revisedDescription;
    private String citation;


    public void setRevisedDescription(String revisedDescription) {
        this.revisedDescription = revisedDescription;
    }

    public void setCitation(String citation) {
        this.citation = citation;
    }

    public String getRevisedDescription() {
        return this.revisedDescription;
    }

    public String getCitation() {
        return this.citation;
    }


    public boolean setAll(String description, Date eventDay, String revisedDescription, String citation) {
        if (!super.setAll(description, eventDay)) {
            this.setRevisedDescription(revisedDescription);
            this.setCitation(citation);
            return true;
        } else {
            return false;
        }
    }
    
    public RevisedHistoricalEvent(String description, Date eventDay, String revisedDescription, String citation) {
        super(description, eventDay);
        this.setRevisedDescription(revisedDescription);
        this.setCitation(citation);
    }

    public RevisedHistoricalEvent() {
        this(HistoricalEvent.DEFAULT_DESCRIPTION, HistoricalEvent.DEFAULT_EVENT_DAY, DEFAULT_REVISED_DESCRIPTION,
                DEFAULT_CITATION);
    }


    @Override
    public String toString() {
        return "The following history was told for many years:\n" + super.toString() +
                "\nBy correcting history, not just rewriting it, we are revising it to embark on the process of righting a wrong.\nHere is the revised history:\n"
                + this.revisedDescription + "\nSource: " + this.citation;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        } else if (this.getClass() != other.getClass()) {
            return false;
        } else {
            RevisedHistoricalEvent otherEvent = (RevisedHistoricalEvent) other;
            return super.equals(other) && this.revisedDescription.equals(otherEvent.revisedDescription)
                    && this.citation.equals(otherEvent.citation);
        }
    }


    public void teach() {
        System.out.println(this.toString());
    }


}