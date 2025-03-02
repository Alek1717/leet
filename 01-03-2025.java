class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] newWords = new String[s.split(" ").length];
        for(int i = 0; i < words.length; i++) {
            String temp = words[i];
            int pos = Integer.parseInt(String.valueOf(temp.charAt(temp.length() - 1)));
            temp = temp.substring(0, temp.length() - 1);
            newWords[pos - 1] = temp;
        }
        String newSentence = "";
        for(int j = 0; j < newWords.length; j++) {
            newSentence = newSentence + newWords[j];
            if(j + 1 != newWords.length) newSentence = newSentence + " ";
        }
        return newSentence;
    }
}