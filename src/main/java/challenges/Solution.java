package challenges;

import java.text.MessageFormat;

public class Solution {
    private static String MESSAGE0 = "no one likes this";
    private static String MESSAGE1 = "{0} likes this";
    private static String MESSAGE2 = "{0} and {1} like this";
    private static String MESSAGE3 = "{0}, {1} and {2} like this";
    private static String MESSAGE4 = "{0}, {1} and {2} others like this";

    public static String whoLikesIt(String... names) {
        String test = "";
        switch (names.length) {
            case 0:
                test = MESSAGE0;
                break;
            case 1:
                test = MessageFormat.format(MESSAGE1, names[0]);
                break;
            case 2:
                test = MessageFormat.format(MESSAGE2, names[0], names[1]);
                break;
            case 3:
                test = MessageFormat.format(MESSAGE3, names[0], names[1], names[2]);
                break;
            default:
                test = MessageFormat.format(MESSAGE4, names[0], names[1], names.length - 2);
                break;
        }

        return test;
    }
}
