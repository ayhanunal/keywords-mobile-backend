package com.ayhanunal.keywordsmobilebackend.controllers;

import com.ayhanunal.keywordsmobilebackend.models.Keyword;
import com.ayhanunal.keywordsmobilebackend.models.entity.Word;
import com.ayhanunal.keywordsmobilebackend.services.KeywordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author ayhanunal
 */

@RestController
@RequestMapping("/keyword")
public class KeywordController {

    @Autowired
    KeywordService keywordService;

    @GetMapping(value = "/allwords")
    public Keyword getAllKeywords() {
        return keywordService.getAllKeywords();
    }

    @GetMapping(value = "/words")
    public Keyword searchKeyword(
        @RequestParam("search") String searchedWord
    ){
        return keywordService.searchKeyword(searchedWord);
    }

    @PostMapping(value = "/enterword")
    public Word enterScreen(@RequestBody Word data) {
        return keywordService.enterWord(data);
    }

}
