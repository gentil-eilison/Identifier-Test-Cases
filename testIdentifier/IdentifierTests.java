package testIdentifier;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IdentifierTests {
    private final Identifier id = new Identifier();

    @Test
    public void lengthLessThanOneAndEmpty() {
        assertFalse(id.validateIdentifier(""));
    }

    @Test
    public void startsWithLetterValidCharsAndCorrectLength() {
        assertTrue(id.validateIdentifier("a"));
    }

    @Test
    public void startsWithLetterValidCharsAndUpperLimitLength() {
        assertTrue(id.validateIdentifier("a12345"));
    }

    @Test
    public void longerThanExpected() {
        assertFalse(id.validateIdentifier("a123456"));
    }

    @Test
    public void startsWithNumber() {
        assertFalse(id.validateIdentifier("2"));
    }

    @Test
    public void containsSymbols() {
        assertFalse(id.validateIdentifier("A@"));
    }
}
