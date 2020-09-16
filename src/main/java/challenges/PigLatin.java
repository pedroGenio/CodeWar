package challenges;

public class PigLatin {
    public static String pigIt(String str) {
        String latin = "";
        for (String word : str.split(" ")) {
            char letter = word.charAt(0);
            if (Character.isLetter(letter)) {
                if (!latin.isEmpty()) {
                    latin = latin + " ";
                }
                latin = latin + word.substring(1) + word.charAt(0) + "ay";
            } else {
                latin = latin + " " + word;
            }
        }

        return latin;
    }
}


 //Best Practice:
 /*
     return Arrays.stream(str.trim().split(" "))
         .map(v -> v.matches("[a-zA-Z]+") ? v.substring(1).concat(v.substring(0, 1)).concat("ay") : v)
         .collect(Collectors.joining(" "));
         */
