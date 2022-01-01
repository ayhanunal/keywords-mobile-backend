package com.ayhanunal.keywordsmobilebackend.models;

import com.ayhanunal.keywordsmobilebackend.models.entity.Word;

import java.util.List;

public class Keyword {

    private int wordCount;
    private List<Word> words;

    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }
}
