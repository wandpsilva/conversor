package conversor.time;

import conversor.enums.TimeConversorUnit;

/**
 * The class {@code TimeConversor} contains methods for performing basic
 * time conversions.
 * @author Wanderlucio P. da Silva
 * @since 1.0
 */
public final class TimeConversor {

    /**
     * This class musn't be instanciable.
     */
    private TimeConversor(){}

    /**
     * @param val the value to be converted in Hours
     * @param type the type of value should be converted, such as minutes or seconds
     * @return hours value
     */
    public static double toHours(final double val, final TimeConversorUnit type){
        double result = 0.0;
        if(TimeConversorUnit.SECONDS.getDescription().equals(type.getDescription())){
            result = val / 60 / 60;
        }
        if(TimeConversorUnit.MINUTES.getDescription().equals(type.getDescription())){
            result = val / 60;
        }
        if(TimeConversorUnit.HOURS.getDescription().equals(type.getDescription())){
            result = val;
        }
        return result;
    }

    /**
     * @param val the value to be converted in Minutes
     * @param type the type of value should be converted, such as minutes or seconds
     * @return minutes value
     */
    public static double toMinutes(final double val, final TimeConversorUnit type){
        double result = 0.0;
        if(TimeConversorUnit.SECONDS.getDescription().equals(type.getDescription())){
            result = val / 60;
        }
        if(TimeConversorUnit.MINUTES.getDescription().equals(type.getDescription())){
            result = val;
        }
        if(TimeConversorUnit.HOURS.getDescription().equals(type.getDescription())){
            result = val * 60;
        }
        return result;
    }

    /**
     * @param val the value to be converted in Seconds
     * @param type the type of value should be converted, such as minutes or seconds
     * @return seconds value
     */
    public static double toSeconds(final double val, final TimeConversorUnit type){
        double result = 0.0;
        if(TimeConversorUnit.SECONDS.getDescription().equals(type.getDescription())){
            result = val;
        }
        if(TimeConversorUnit.MINUTES.getDescription().equals(type.getDescription())){
            result = val * 60;
        }
        if(TimeConversorUnit.HOURS.getDescription().equals(type.getDescription())){
            result = val * 60 * 60;
        }
        return result;
    }
}
