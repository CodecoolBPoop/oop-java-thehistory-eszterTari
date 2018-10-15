package com.codecool.thehistory;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Arrays;

public class TheHistoryLinkedList implements TheHistory {
    /**
     * This implementation should use a String LinkedList so don't change that!
     */
    private List<String> wordsLinkedList = new LinkedList<>();

    @Override
    public void add(String text) {
        wordsLinkedList = new LinkedList<>(Arrays.asList(text.split("\\s")));
    }

    @Override
    public void removeWord(String wordToBeRemoved) {
        ListIterator<String> wordsIterator = wordsLinkedList.listIterator();
        while (wordsIterator.hasNext()) {
            String word = wordsIterator.next();
            if (word.equals(wordToBeRemoved)) wordsIterator.remove();
        }
    }

    @Override
    public int size() {
        return wordsLinkedList.size();
    }

    @Override
    public void clear() {
        wordsLinkedList.clear();
    }

    @Override
    public void replaceOneWord(String from, String to) {
        ListIterator<String> wordsIterator = wordsLinkedList.listIterator();
        while (wordsIterator.hasNext()) {
            String word = wordsIterator.next();
            if (word.equals(from)) wordsIterator.set(to);
        }
    }

    @Override
    public void replaceMoreWords(String[] fromWords, String[] toWords) {
        //TODO: check the TheHistory interface for more information
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String word : wordsLinkedList) {
            sb.append(word).append(" ");
        }
        if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1); // last space char
        return sb.toString();
    }

}
