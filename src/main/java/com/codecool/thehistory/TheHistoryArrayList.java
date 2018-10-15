package com.codecool.thehistory;

import java.util.ArrayList;
import java.util.*;


public class TheHistoryArrayList implements TheHistory {
    /**
     * This implementation should use a String ArrayList so don't change that!
     */
    private List<String> wordsArrayList = new ArrayList<>();

    @Override
    public void add(String text) {
        wordsArrayList = new ArrayList<>(Arrays.asList(text.split("\\s")));
    }

    @Override
    public void removeWord(String wordToBeRemoved) {
        for (int i = wordsArrayList.size()-1; i >=0 ; i--) {
            String word = wordsArrayList.get(i);
            if (word.equals(wordToBeRemoved)) wordsArrayList.remove(i);
        }
    }

    @Override
    public int size() {
        return wordsArrayList.size();
    }

    @Override
    public void clear() {
        wordsArrayList.clear();
    }

    @Override
    public void replaceOneWord(String from, String to) {
        for (int i = 0; i < wordsArrayList.size(); i++) {
            if (wordsArrayList.get(i).equals(from))
                wordsArrayList.set(i, to);
        }
    }

    @Override
    public void replaceMoreWords(String[] fromWords, String[] toWords) {
        //TODO: check the TheHistory interface for more information
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String word : wordsArrayList) {
            sb.append(word).append(" ");
        }
        if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1); // last space char
        return sb.toString();
    }

}
