import java.util.logging.Logger;

/**
 * This is a solution to "Programmeringsuppgift.
 * It assumed that the pnr should be a string since it was a mix of number and letters
 * in the assignment description.
 *
 * @author Teodor E
 */

public class ValidityCheck {
    private final int PNRSIZE = 12;
    private static final Logger LOGGER = Logger.getLogger( ValidityCheck.class.getName());

    // ******************************
    // Public methods
    // ******************************
    /**
     * 1. Skriv en ValidityCheck som kontrollerar om kandidatdata inte är null.
     * @param pnr A string possibly containing a "personnummer"
     */
    public boolean notNull(String pnr){
        if (pnr != null) return true;
        LOGGER.info(pnr);
        return false;
    }

    /**
     * 2. Skriv en ValidityCheck som kontrollerar huruvida kandidatdatat
     * representerar ett personnummer eller ej.
     * @param pnr This is a string containing a "personnummer"
     */
    public boolean isPersonnummer(String pnr){

        if (!notNull(pnr) || !notEmpty(pnr)) return false;

        String nr = pnr.replaceAll("[^\\d.]","");

        if (!enoughDidgits(nr)) return false;

        char[] charArray = nr.toCharArray();
        int controlDigit = calculateControlDigit(charArray);
        int lastDigit = Integer.parseInt(String.valueOf(charArray[charArray.length-1]));

        if (controlDigit == lastDigit) return true;
        LOGGER.info(pnr);
        return false;

    }

    // ******************************
    // Private methods
    // ******************************
    /**
     * @param nr A string possibly containing enough digits to maybe be a pnr
     */
    private boolean enoughDidgits(String nr){
        if(nr.length() != PNRSIZE){
            LOGGER.info(nr);
            return false;
        }
        return true;
    }


    /**
     * @param pnr A string possibly containing a "personnummer"
     */
    private boolean notEmpty(String pnr){
        if(pnr.isBlank() || pnr.isEmpty()){
            LOGGER.info(pnr);
            return false;
        }
        return true;
    }

    /**
     * 2b. Calculates what the last digit in "personnummer" should be according to the
     * Luhn-algorithm (https://sv.wikipedia.org/wiki/Luhn-algoritmen)
     * @param charArray A char[] containing 12 char digits
     */
    private int calculateControlDigit(char[] charArray) {
        int sum = 0, temp1;

        for(int i = 2; i<charArray.length-1; i++) {
            temp1 = Integer.parseInt(String.valueOf(charArray[i]));
            if (i % 2 == 0) {
                temp1 = temp1 * 2;
                if (temp1 >= 10) {
                    temp1 = temp1 / 10 + temp1 % 10;
                }
            }
                sum += temp1;
        }

        return (10- (sum%10)) %10;
    }
}
