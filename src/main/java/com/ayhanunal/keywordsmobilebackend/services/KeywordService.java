package com.ayhanunal.keywordsmobilebackend.services;

import com.ayhanunal.keywordsmobilebackend.models.Keyword;
import com.ayhanunal.keywordsmobilebackend.models.entity.Word;
import com.ayhanunal.keywordsmobilebackend.models.repositories.KeywordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KeywordService {

    @Autowired
    KeywordRepository keywordRepository;

    public Keyword getAllKeywords(){
        Keyword keyword = new Keyword();

        List<Word> wordList = keywordRepository.getAllWords();
        keyword.setWordCount(wordList.size());
        keyword.setWords(wordList);

        return keyword;
    }

}
