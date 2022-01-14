package conversor.weight;

/**
 * The class {@code Mass} contains methods for performing basic
 * mass conversions.
 * @author Wanderlucio P. da Silva
 * @since 1.0
 */
public final class Mass {

    /**
     * This class musn't be instanciable.
     */
    private Mass(){}

    /**
     * @param grams grams value
     * @return miligrams value
     */
    public static double toMiligrams(final double grams){
        return grams * 1000.0;
    }

    /**
     * @param miligrams miligrams value
     * @return grams value
     */
    public static double toGrams(final double miligrams){
        return miligrams / 1000.0;
    }
}
