package testIdentifier;

public class Identifier {
    public boolean validateIdentifier(String identifier) {
        char achar;
        boolean validIdentifier = false;

        if (identifier.length() > 0) {
            achar = identifier.charAt(0);
            validIdentifier = validCharacter(achar);

            if (identifier.length() > 1) {
                achar = identifier.charAt(1);
                int index = 1;

                while (index < identifier.length()) {
                    achar = identifier.charAt(index);
                    if (!validIdentifierContent(achar)) {
                        validIdentifier = false;
                    }
                    index++;
                }
            }
        }

        return validIdentifier && (identifier.length() >= 1) && (identifier.length() <= 6);
    }

    public boolean validCharacter(char ch) {
        return ((ch >= 'A') && (ch <= 'Z') || (ch >= 'a' && ch <='z'));
    }

    public boolean validIdentifierContent(char ch) {
        return validCharacter(ch) || (ch >= '0' && ch <= '9');
    }
}
