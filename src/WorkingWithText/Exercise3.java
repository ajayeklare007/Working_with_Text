package WorkingWithText;

public class Exercise3 {
    public static void main(String[] args) {
        String text1 = "      This is text1";
        String text2 = "This is text2      ";
        String text3 = "  This is text3     ";

        System.out.format("Original text is: \n%s \n%s \n%s \n",text1, text2, text3);
        System.out.format("Converted text is: \n%s \n%s \n%s",
                text1.stripLeading(),
                text2.stripTrailing(),
                text3.strip());
    }
}
