package Omegpoint.tests;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidityCheckTest {
    private ValidityCheck checker = new ValidityCheck();
    private Scanner scan = new Scanner(System.in);

    @Test
    public void notNull() {
        System.out.println("t1");
        assertTrue(checker.notNull("1"));
        assertTrue(checker.notNull("-1"));
        assertTrue(checker.notNull("0"));
        assertFalse(checker.notNull(null));
    }

    @Test
    public void isPersonnummer(){
        System.out.println("t2");
        assertFalse(checker.isPersonnummer(null));
        assertFalse(checker.isPersonnummer(""));
        assertFalse(checker.isPersonnummer("                "));
        assertFalse(checker.isPersonnummer("97802022"));
        assertTrue(checker.isPersonnummer("Pnr 19780202-2389"));
        assertTrue(checker.isPersonnummer("Pnr 19820411-2380"));
    }

}
