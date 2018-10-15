package com.codecool.thehistory;

import java.util.Arrays;

public class TheHistoryArray implements TheHistory {

    /**
     * This implementation should use a String array so don't change that!
     */
    private String[] wordsArray = new String[0];

    @Override
    public void add(String text) {
        wordsArray = text.split("\\s");
    }

    @Override
    public void removeWord(String wordToBeRemoved) {
        String [] arrayOfOtherWords = new String[wordsArray.length-1];
        int index = 0;
        int NumOfRemovedWords = 0;
        for (String word : wordsArray) {
            if (word != null) {
                if(!word.equals(wordToBeRemoved)){
                    arrayOfOtherWords[index++] = word;
                } else {
                    NumOfRemovedWords++;
                }
            }
        }
        System.arraycopy(arrayOfOtherWords,0, wordsArray, 0, wordsArray.length-NumOfRemovedWords);
    }

    @Override
    public int size() {
        return wordsArray.length;
    }

    @Override
    public void clear() {
        wordsArray = new String[0];
    }

    @Override
    public void replaceOneWord(String from, String to) {
        for (int i = 0; i < wordsArray.length; i++) {
            if (wordsArray[i].equals(from)) wordsArray[i] = to;
        }
    }

    @Override
    public void replaceMoreWords(String[] fromWords, String[] toWords) {
        //TODO: check the TheHistory interface for more information
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String word : wordsArray) {
            sb.append(word).append(" ");
        }
        if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1); // last space char
        return sb.toString();
    }
}
