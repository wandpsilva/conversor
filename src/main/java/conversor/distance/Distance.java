package conversor.distance;

/**
 * The class {@code Distance} contains methods for performing basic
 * distance conversions.
 * @author Wanderlucio P. da Silva
 * @since 1.0
 */
public final class Distance {

    /**
     * This class musn't be instanciable.
     */
    private Distance(){}

    /**
     * @param kilometers kilometers value
     * @return miles value
     */
    public static double toMiles(final double kilometers){
        return kilometers / 1.609;
    }

    /**
     * @param miles miles value
     * @return o kilometers value
     */
    public static double toKilometers(final double miles) {
        return miles / 0.62137;
    }

}
