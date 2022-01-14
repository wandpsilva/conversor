package conversor.wheather;

/**
 *  * The class {@code Temperature} contains methods for performing basic
 *  * temperature conversions.
 * @author Wanderlucio P. da Silva
 * @since 1.0
 */
public final class Temperature {

    /**
     * This class musn't be instanciable.
     */
    private Temperature(){
    }

    /**
     * @param celsius celsius temperature value
     * @return fahrenheit value
     */
    public static double toFahrenheit(final double celsius){
        return celsius * 9/5 + 32;
    }

    /**
     * @param fahrenheit fahrenheit temperature value
     * @return celsius value
     */
    public static double toCelsius(final double fahrenheit){
        return (fahrenheit - 32) * 5/9;
    }
}
