package testIdentifier;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IdentifierTests {
    private final Identifier id = new Identifier();

    @Test
    public void emptyIdentifier() {
        boolean validIdentifier = id.validateIdentifier("");
        assertFalse(validIdentifier);
    }

    @Test
    public void onlyNumber() {
        boolean validIdentifier = id.validateIdentifier("1");
        assertFalse(validIdentifier);
    }

    @Test
    public void onlyCharacter() {
        boolean validIdentifier = id.validateIdentifier("a");
        assertTrue(validIdentifier);
    }

    @Test
    public void startsWithNumber() {
        boolean validIdentifier = id.validateIdentifier("1b3fas");
        assertFalse(validIdentifier);
    }

    @Test
    public void startsWithSymbol() {
        boolean validIdentifier = id.validateIdentifier("-fas34");
        assertFalse(validIdentifier);
    }

    @Test
    public void tooManyCharacters() {
        boolean validIdentifier = id.validateIdentifier("abcqyw3");
        assertFalse(validIdentifier);
    }

    @Test
    public void correctCharactersAndCorrectLength() {
        boolean validIdentifier = id.validateIdentifier("abc2yw");
        assertTrue(validIdentifier);
    }

    @Test
    public void symbolInIdentifier() {
        boolean validIdentifier = id.validateIdentifier("ab3c@7");
        assertFalse(validIdentifier);
    }

    @Test
    public void identifierLengthInRange() {
        boolean validIdentifier = id.validateIdentifier("sktt1");
        assertTrue(validIdentifier);
    }
}
