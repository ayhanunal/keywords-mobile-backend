package com.ayhanunal.keywordsmobilebackend.controllers;

import com.ayhanunal.keywordsmobilebackend.models.Keyword;
import com.ayhanunal.keywordsmobilebackend.services.KeywordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
