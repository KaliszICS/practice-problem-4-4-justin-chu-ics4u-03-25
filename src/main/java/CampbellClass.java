public final class CampbellClass { // 'final' prevents inheritance

    private CampbellClass() {
        throw new IllegalStateException("nuh uh");
    }

    //string stuff

    /**
     * convert integer to its string representation
     *
     * @param value the int value to convert
     * @return the string representation of the int
     */
    public static String convertString(int value) {
        return Integer.toString(value);
    }

    /**
     * converts a double to string
     *
     * @param value the double value to convert
     * @return the string representation of the double
     */
    public static String convertString(double value) {
        return Double.toString(value);
    }

    /**
     * converts a character into string
     *
     * @param value the char value to convert
     * @return the string representation of the character
     */
    public static String convertString(char value) {
        return Character.toString(value);
    }

    /**
     * converts a boolean to its string representation (true or false)
     *
     * @param value the boolean value to convert
     * @return the string representation of the boolean (true or false)
     */
    public static String convertString(boolean value) {
        return Boolean.toString(value);
    }

    //le measurement stuff

    /**
     * converts a measurement in meters to centimeters
     *
     * @param meters the measurement in meters (int)
     * @return the equivalent measurement in centimeters (int)
     */
    public static int convertMetersToCenti(int meters) {
        return meters * 100; //1 m = 100 cm
    }

    /**
     * converts a measurement in meters to centimeters
     *
     * @param meters the measurement in meters (double)
     * @return the equivalent measurement in centimeters (double)
     */
    public static double convertMetersToCenti(double meters) {
        return meters * 100.0; //use 100.0 because double
    }

    //more string stuff

    /**
     * removes all non-alphabetic characters from a string
     * the case of the remaining letters is preserved from the original string
     * if the input string is null, returns an empty string
     *
     * @param input the given string
     * @return a new string containing only the alphabetic characters from the input
     */
    public static String removeNonAlpha(String input) {
        if (input == null) {
            return ""; //can also return null prolly
        }
        //[^a-zA-Z] matches any character that is nut a lowercase or uppercase letter
        return input.replaceAll("[^a-zA-Z]", "");
    }

    /**
     * removes all non-alphabetic characters from a string and converts the
     * remaining letters to either uppercase or lowercase
     * if the input string is null, returns an empty string
     *
     * @param input   given string
     * @param toUpper if true converts remaining letters to uppercase
     *                if false converts remaining letters to lowercase
     * @return new string containing only alphabetic characters from the input
     *         converted to the specified case
     */
    public static String removeNonAlpha(String input, boolean toUpper) {
        if (input == null) {
            return ""; //can also return null if needed
        }
        //first remove non-alphabetic characters
        String lettersOnly = input.replaceAll("[^a-zA-Z]", "");

        //then convert case based on the boolean flag
        if (toUpper) {
            return lettersOnly.toUpperCase();
        } else {
            return lettersOnly.toLowerCase();
        }
    }

}