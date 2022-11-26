package WorkingWithText;

public class Exercise4 {
    public static void main(String[] args) {
        String myText = "    alphabet ";
        String result = convert(myText);
        System.out.println(result);
    }
    public static String convert(String myText) {
        String stripText = myText.strip();
        int lastCharIndex = stripText.length() - 1;
        char oldChar = stripText.charAt(lastCharIndex);
        char newChar = stripText.toUpperCase().charAt(lastCharIndex);

        String requiredString = stripText.replace(oldChar, newChar);

        return requiredString;
    }
}
