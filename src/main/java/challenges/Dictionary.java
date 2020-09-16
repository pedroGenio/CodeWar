package challenges;

import org.apache.commons.text.similarity.LevenshteinDistance;

public class Dictionary {
    private final String[] words;

    public Dictionary(String[] words) {
        this.words = words;
    }

    public String findMostSimilar(String to) {


//        Arrays.stream(words).filter(w -> w.equals(to)).collect(Collectors.joining());
//        Arrays.stream(words).filter(Dictionary::myFilterFunction(to)).collect(Collectors.joining());
        int min = Integer.MAX_VALUE;
        String wo = "";
        for (String w : words) {
            int level = LevenshteinDistance.getDefaultInstance().apply(w, to);
//            System.out.println(level + " " + w);
            if (level < min) {
                min = level;
                wo = w;
            }
//            min = level < min ? level : min;
//            wo = level < min ? w : wo;
        }
        return wo;
    }

    private static boolean myFilterFunction(String w, String to){
        int min = Integer.MAX_VALUE;
        return LevenshteinDistance.getDefaultInstance().apply(w, to) < min ? true : false;
    }
}
