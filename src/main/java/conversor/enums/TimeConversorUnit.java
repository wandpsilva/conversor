package conversor.enums;

/**
 * This Enum return the possible values for time conversions.
 * @author Wanderlucio P. da Silva
 * @since 1.0
 */
public enum TimeConversorUnit {

    SECONDS("seconds"),
    MINUTES("minutes"),
    HOURS("hours");

    private String description;

    TimeConversorUnit(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }
}
