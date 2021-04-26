package cz.educanet.praha;

public class StringWithMostOccurrencesOfLetter {

    public static String findStringWithMostOccurrencesOfLetter(String[] strings, char letter) {
        String gitGudString = "";
        int count = 0;
        for (int i = 0; i < strings.length;i++){
            int currentCount = 0;
            for (int j = 0; j < strings[i].length(); j++) {
                if (strings[i].charAt(j) == letter) {
                    currentCount++;
                }
            }
            if (currentCount > count){
                gitGudString = strings[i];
                count = currentCount;
            }
        }
        return gitGudString;
    }
}